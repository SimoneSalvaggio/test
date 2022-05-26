package com.example.demo.model;

public class MoneyTransferCreditor {
	
	private String name;
	
	private MoneyTransferCreditorAccount account;
	
	private MoneyTransferCreditorAddress address;

	public MoneyTransferCreditor() {
		super();
	}

	public MoneyTransferCreditor(String name, MoneyTransferCreditorAccount account,
			MoneyTransferCreditorAddress address) {
		super();
		this.name = name;
		this.account = account;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MoneyTransferCreditorAccount getAccount() {
		return account;
	}

	public void setAccount(MoneyTransferCreditorAccount account) {
		this.account = account;
	}

	public MoneyTransferCreditorAddress getAddress() {
		return address;
	}

	public void setAddress(MoneyTransferCreditorAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MoneyTransferCreditor [name=" + name + ", account=" + account + ", address=" + address + "]";
	}
	

}
