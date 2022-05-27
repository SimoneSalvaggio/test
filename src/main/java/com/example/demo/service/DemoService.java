package com.example.demo.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.model.MoneyTransfer;
import com.example.demo.model.Payload;
import com.example.demo.model.Transaction;
import com.example.demo.model.TransactionList;
import com.example.demo.model.entity.TransactionRequestHistory;
import com.example.demo.model.response.BonificoResponse;
import com.example.demo.model.response.SaldoResponse;
import com.example.demo.model.response.TransazioniResponse;
import com.example.demo.repository.TransactionRequestHistoryRepository;

@Service
public class DemoService {
	
	@Autowired
	TransactionRequestHistoryRepository transactionRequestHistoryRepository;

	private final String apikey = "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP";
	private final String authSchema = "S2S";
	
	private final String URL_START = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/";
	private final String BALANCE_URL_END = "/balance";
	private final String PAYMENT_URL_END = "/payments/money-transfers";
	private final String TRANSACTION_URL = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/";
	private final String TRANSACTION_URL_END = "/transactions";
	
	public Payload getBalance(Long accountId) throws RestClientException{
		String url = URL_START + accountId + BALANCE_URL_END;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("apikey", apikey);
		headers.add("auth-schema", authSchema);
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		return (Payload) restTemplate.exchange(url, HttpMethod.GET, entity, SaldoResponse.class).getBody().getPayload();
	}
	
	public BonificoResponse doPayment(Long accountId, MoneyTransfer moneyTransfer) throws RestClientException{
		String url = URL_START + accountId + PAYMENT_URL_END;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("apikey", apikey);
		headers.add("auth-schema", authSchema);
		HttpEntity <MoneyTransfer> entity = new HttpEntity<MoneyTransfer>(moneyTransfer, headers);
		Object result = (Object) restTemplate.exchange(url, HttpMethod.POST, entity, BonificoResponse.class).getBody();
		return new BonificoResponse("code standard per OK","desc standard per OK", result);
	}

	public List<Transaction> getTransactions(Long accountId, String fromAccountingDate, String toAccountingDate) throws RestClientException {
		//anche qua con LocalDate o altri tipi per le date non andavano quindi ho dovuto usare delle Stringhe
		String url = TRANSACTION_URL + accountId + TRANSACTION_URL_END;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("apikey", apikey);
		headers.add("auth-schema", authSchema);
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		TransactionList list = (TransactionList) restTemplate.exchange(UriComponentsBuilder.fromHttpUrl(url).queryParam("toAccountingDate", toAccountingDate).queryParam("fromAccountingDate", fromAccountingDate).build().toUriString(), HttpMethod.GET, entity, TransazioniResponse.class).getBody().getPayload();
		TransactionRequestHistory transactionRequestHistory = new TransactionRequestHistory();
		transactionRequestHistory.setRequestDate(new Date());
		transactionRequestHistory.setDateFrom(fromAccountingDate);
		transactionRequestHistory.setDateTo(toAccountingDate);
		transactionRequestHistory.setResultSize(list.getList().size());
		transactionRequestHistory.setAccountId(accountId);
		transactionRequestHistoryRepository.save(transactionRequestHistory);
		return list.getList();
	}

}
