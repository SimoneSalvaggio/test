package com.example.demo.model;

public enum ETransactionTypeEnumerated {
	
	GBS_TRANSACTION_TYPE("GBS_TRANSACTION_TYPE"), 
	OTHER("OTHER");
	
	private String description;

    private ETransactionTypeEnumerated(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
