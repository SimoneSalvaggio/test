package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.MoneyTransfer;
import com.example.demo.model.Payload;
import com.example.demo.model.Transaction;
import com.example.demo.model.response.BonificoResponse;
import com.example.demo.repository.TransactionRequestHistoryRepository;

public class DemoServiceTest {
	
	@InjectMocks
	DemoService demoService;
	
	@Mock
    TransactionRequestHistoryRepository trhRepository;

	@BeforeEach                                         
    void setUp() {
        demoService = new DemoService();
    }

    @Test
    void getBalance() {
        Payload result = demoService.getBalance(14537780L);
        assertNotNull(result);
    }
//  @Test
//  void doPayment() {
//    MoneyTransfer moneyTransfer = new MoneyTransfer();
//    when(trhRepository.save(any())).thenReturn(moneyTransfer);
//  	BonificoResponse result = demoService.doPayment(14537780L,new MoneyTransfer());
//      assertTrue(moneyTransfer.equals(result));
//  }

//    @Test
//    void getTransactions() {
//    	List<Transaction> result = demoService.getTransactions(14537780L, "2019-03-01", "2019-04-07");
//        assertTrue(!result.isEmpty());
//    }
}
