package com.example.demo.model;

public class MoneyTransferTaxRelief {
	
	private String taxReliefId;
	
	private Boolean isCondoUpgrade;
	
	private String creditorFiscalCode;
	
	private String beneficiaryType;
	
	private MoneyTransferTaxReliefNaturalPersonBeneficiary naturalPersonBeneficiary;
	
	private MoneyTransferTaxReliefLegalPersonBeneficiary legalPersonBeneficiary;

	public MoneyTransferTaxRelief() {
		super();
	}

	public MoneyTransferTaxRelief(String taxReliefId, Boolean isCondoUpgrade, String creditorFiscalCode,
			String beneficiaryType, MoneyTransferTaxReliefNaturalPersonBeneficiary naturalPersonBeneficiary,
			MoneyTransferTaxReliefLegalPersonBeneficiary legalPersonBeneficiary) {
		super();
		this.taxReliefId = taxReliefId;
		this.isCondoUpgrade = isCondoUpgrade;
		this.creditorFiscalCode = creditorFiscalCode;
		this.beneficiaryType = beneficiaryType;
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}

	public String getTaxReliefId() {
		return taxReliefId;
	}

	public void setTaxReliefId(String taxReliefId) {
		this.taxReliefId = taxReliefId;
	}

	public Boolean getIsCondoUpgrade() {
		return isCondoUpgrade;
	}

	public void setIsCondoUpgrade(Boolean isCondoUpgrade) {
		this.isCondoUpgrade = isCondoUpgrade;
	}

	public String getCreditorFiscalCode() {
		return creditorFiscalCode;
	}

	public void setCreditorFiscalCode(String creditorFiscalCode) {
		this.creditorFiscalCode = creditorFiscalCode;
	}

	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	public MoneyTransferTaxReliefNaturalPersonBeneficiary getNaturalPersonBeneficiary() {
		return naturalPersonBeneficiary;
	}

	public void setNaturalPersonBeneficiary(MoneyTransferTaxReliefNaturalPersonBeneficiary naturalPersonBeneficiary) {
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
	}

	public MoneyTransferTaxReliefLegalPersonBeneficiary getLegalPersonBeneficiary() {
		return legalPersonBeneficiary;
	}

	public void setLegalPersonBeneficiary(MoneyTransferTaxReliefLegalPersonBeneficiary legalPersonBeneficiary) {
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}

	@Override
	public String toString() {
		return "MoneyTransferTaxRelief [taxReliefId=" + taxReliefId + ", isCondoUpgrade=" + isCondoUpgrade
				+ ", creditorFiscalCode=" + creditorFiscalCode + ", beneficiaryType=" + beneficiaryType
				+ ", naturalPersonBeneficiary=" + naturalPersonBeneficiary + ", legalPersonBeneficiary="
				+ legalPersonBeneficiary + "]";
	}
	

}
