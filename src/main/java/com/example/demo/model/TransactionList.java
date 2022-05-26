package com.example.demo.model;

import java.util.List;

public class TransactionList {
	
	private List<Transaction> list;

	public TransactionList() {
		super();
	}

	public TransactionList(List<Transaction> list) {
		super();
		this.list = list;
	}

	public List<Transaction> getList() {
		return list;
	}

	public void setList(List<Transaction> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "TransactionList [list=" + list + "]";
	}
	
	

}
