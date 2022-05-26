package com.example.demo.controller;

import com.example.demo.model.MoneyTransfer;
import com.example.demo.model.Payload;
import com.example.demo.model.Transaction;
import com.example.demo.model.response.BonificoResponse;
import com.example.demo.service.DemoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class DemoControllerTest {

    MoneyTransfer moneyTransfer;
	
	@InjectMocks
    DemoController demoController;
	
	@Mock
    DemoService demoService;

	@BeforeEach
    void setUp() {
        demoService = new DemoService();
        demoController = new DemoController();
        moneyTransfer = new MoneyTransfer();
    }

    //@Test
    //void findSaldoByAccountId() {
    //    when(demoService.getBalance(any())).thenReturn(new Payload());
    //    ResponseEntity<Payload> result = demoController.findSaldoByAccountId(14537780L);
    //    assertTrue(result.getStatusCode().equals(HttpStatus.OK));
    //}

    //@Test
    //void createBonifico() {
    //    when(demoService.doPayment(any(),any())).thenReturn(new BonificoResponse());
    //    ResponseEntity<BonificoResponse> result = demoController.createBonifico(14537780L, moneyTransfer);
    //    assertTrue(result.getStatusCode().equals(HttpStatus.OK));
    //}

    //@Test
    //void findTransactionsBetweenDateFromAndDateTo() {
    //    when(demoService.getTransactions(any(),any(),any())).thenReturn(new ArrayList());
    //    ResponseEntity<List<Transaction>> result = demoController.findTransactionsBetweenDateFromAndDateTo(14537780L,"2020-03-01","2020-04-07");
    //    assertTrue(result.getStatusCode().equals(HttpStatus.OK));
    //}
}
