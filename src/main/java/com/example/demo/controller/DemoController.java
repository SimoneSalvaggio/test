package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.example.demo.model.MoneyTransfer;
import com.example.demo.model.Payload;
import com.example.demo.model.Transaction;
import com.example.demo.model.response.BonificoResponse;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping(DemoController.URI)
public class DemoController {

	static final String URI = "/api/demo";
	
	private final Long defaultAccountId = 14537780L;
	
	@Autowired
	DemoService demoService;

	@GetMapping("saldo/{accountId}")
	public ResponseEntity<Payload> findSaldoByAccountId(@PathVariable(required = false) Long accountId) {

		//nella consegna c'era scritto di ritornare il saldo e l'ho interpretato come oggetto payload visto che non mi sembrava il massimo ritornare solo un numero
		
		//ho messo la possibilità di inserire l'eventuale id che mi sembrava una cosa più realistica, altrimenti prendo di default quello indicato
		
		ResponseEntity<Payload> resp = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		
		if (null==accountId) {
			accountId = defaultAccountId;		
		}
		try {
			resp = new ResponseEntity<Payload>(demoService.getBalance(accountId), HttpStatus.OK);
		} catch (RestClientException e) {
			resp = new ResponseEntity<>(null, HttpStatus.SERVICE_UNAVAILABLE);
		}
		return resp;
	}
	
	@PostMapping("bonifico/{accountId}")
	public ResponseEntity<BonificoResponse> createBonifico(@PathVariable(required = false) Long accountId,
															@RequestBody MoneyTransfer moneyTransfer) {
		ResponseEntity<BonificoResponse> resp;
		if (null==accountId) {
			accountId = defaultAccountId;
		}
		try {
			resp = new ResponseEntity<BonificoResponse>(demoService.doPayment(accountId, moneyTransfer), HttpStatus.OK);
		} catch (RestClientException e) {
			String msg = e.getMessage();
			//l'errore mi sembrava tornasse solo come stringa e non formattata quindi l'unico modo che ho trovato per riconoscere se arriva l'errore previsto è stato controllare nel messaggio se c'è il codice
			if (msg.contains("API000")) {
				resp = new ResponseEntity<>(new BonificoResponse("API000","Errore tecnico  La condizione BP049 non e' prevista per il conto id 14537780.",null), HttpStatus.BAD_REQUEST);
			}else {				
				resp = new ResponseEntity<>(null, HttpStatus.SERVICE_UNAVAILABLE);
			}
		}
		return resp;
	}

	@GetMapping("transazioni/{accountId}")
	public ResponseEntity<List<Transaction>> findTransactionsBetweenDateFromAndDateTo(@PathVariable(required = false) Long accountId,
														@RequestParam String fromAccountingDate,
														@RequestParam String toAccountingDate) {
		
		ResponseEntity<List<Transaction>> resp = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		if (null==accountId) {
			accountId = defaultAccountId;		
		}
		try {
			resp = new ResponseEntity<List<Transaction>>(demoService.getTransactions(accountId,fromAccountingDate, toAccountingDate), HttpStatus.OK);
		} catch (RestClientException e) {
			resp = new ResponseEntity<>(null, HttpStatus.SERVICE_UNAVAILABLE);
		}
		return resp;
	}
	
}
