package com.example.demo.model;

public class MoneyTransferCreditorAccount {
	
	private String accountCode;
	
	private String bicCode;

	public MoneyTransferCreditorAccount() {
		super();
	}

	public MoneyTransferCreditorAccount(String accountCode, String bicCode) {
		super();
		this.accountCode = accountCode;
		this.bicCode = bicCode;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getBicCode() {
		return bicCode;
	}

	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}

	@Override
	public String toString() {
		return "MoneyTransferCreditorAccount [accountCode=" + accountCode + ", bicCode=" + bicCode + "]";
	}
	

}
