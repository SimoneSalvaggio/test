package com.example.demo.model;

import java.util.Date;

public class Payload {
	
	private Date date;

	private Double balance;
	
	private Double availableBalance;
	
	private String currency;

	public Payload() {
		super();
	}

	public Payload(Date date, Double balance, Double availableBalance, String currency) {
		super();
		this.date = date;
		this.balance = balance;
		this.availableBalance = availableBalance;
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Payload [date=" + date + ", balance=" + balance + ", availableBalance=" + availableBalance
				+ ", currency=" + currency + "]";
	}
	
	
}
