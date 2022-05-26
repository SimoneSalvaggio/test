package com.example.demo.model;

public class TransactionType {
	
	private ETransactionTypeEnumerated enumeration;
	
    private String value;
    
	public TransactionType() {
		super();
	}

	public TransactionType(ETransactionTypeEnumerated enumeration, String value) {
		super();
		this.enumeration = enumeration;
		this.value = value;
	}

	public ETransactionTypeEnumerated getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(ETransactionTypeEnumerated enumeration) {
		this.enumeration = enumeration;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TransactionType [enumeration=" + enumeration + ", value=" + value + "]";
	}
    
}
