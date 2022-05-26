package com.example.demo.model;

public class MoneyTransfer {
	
	private MoneyTransferCreditor creditor;

	// non mi andava ne con LocalDate che con Date, possibile sia Stringa?
	private String executionDate;

	private String uri;

	private String description;

	private Integer amount;

	private String currency;

	private Boolean isUrgent;

	private Boolean isInstant;

	private String feeType;

	private String feeAccountId;
	
	private MoneyTransferTaxRelief taxRelief;

	public MoneyTransfer() {
		super();
	}

	public MoneyTransfer(MoneyTransferCreditor creditor, String executionDate, String uri, String description,
			Integer amount, String currency, Boolean isUrgent, Boolean isInstant, String feeType, String feeAccountId,
			MoneyTransferTaxRelief taxRelief) {
		super();
		this.creditor = creditor;
		this.executionDate = executionDate;
		this.uri = uri;
		this.description = description;
		this.amount = amount;
		this.currency = currency;
		this.isUrgent = isUrgent;
		this.isInstant = isInstant;
		this.feeType = feeType;
		this.feeAccountId = feeAccountId;
		this.taxRelief = taxRelief;
	}

	public MoneyTransferCreditor getCreditor() {
		return creditor;
	}

	public void setCreditor(MoneyTransferCreditor creditor) {
		this.creditor = creditor;
	}

	public String getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(String executionDate) {
		this.executionDate = executionDate;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Boolean getIsUrgent() {
		return isUrgent;
	}

	public void setIsUrgent(Boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	public Boolean getIsInstant() {
		return isInstant;
	}

	public void setIsInstant(Boolean isInstant) {
		this.isInstant = isInstant;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getFeeAccountId() {
		return feeAccountId;
	}

	public void setFeeAccountId(String feeAccountId) {
		this.feeAccountId = feeAccountId;
	}

	public MoneyTransferTaxRelief getTaxRelief() {
		return taxRelief;
	}

	public void setTaxRelief(MoneyTransferTaxRelief taxRelief) {
		this.taxRelief = taxRelief;
	}

	@Override
	public String toString() {
		return "MoneyTransfer [creditor=" + creditor + ", executionDate=" + executionDate + ", uri=" + uri
				+ ", description=" + description + ", amount=" + amount + ", currency=" + currency + ", isUrgent="
				+ isUrgent + ", isInstant=" + isInstant + ", feeType=" + feeType + ", feeAccountId=" + feeAccountId
				+ ", taxRelief=" + taxRelief + "]";
	}
	
	

}
