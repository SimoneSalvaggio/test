package com.example.demo.model;

public class MoneyTransferTaxReliefLegalPersonBeneficiary {
	
	private String fiscalCode;
	
	private String legalRepresentativeFiscalCode;

	public MoneyTransferTaxReliefLegalPersonBeneficiary() {
		super();
	}

	public MoneyTransferTaxReliefLegalPersonBeneficiary(String fiscalCode, String legalRepresentativeFiscalCode) {
		super();
		this.fiscalCode = fiscalCode;
		this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getLegalRepresentativeFiscalCode() {
		return legalRepresentativeFiscalCode;
	}

	public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
		this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
	}

	@Override
	public String toString() {
		return "MoneyTransferTaxReliefLegalPersonBeneficiary [fiscalCode=" + fiscalCode
				+ ", legalRepresentativeFiscalCode=" + legalRepresentativeFiscalCode + "]";
	}
	

}
