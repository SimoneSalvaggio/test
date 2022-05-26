package com.example.demo.model;

public class MoneyTransferCreditorAddress {
	
	private String address;
	
	private String city;
	
	private String countryCode;

	public MoneyTransferCreditorAddress() {
		super();
	}

	public MoneyTransferCreditorAddress(String address, String city, String countryCode) {
		super();
		this.address = address;
		this.city = city;
		this.countryCode = countryCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "MoneyTransferCreditorAddress [address=" + address + ", city=" + city + ", countryCode=" + countryCode
				+ "]";
	}
	

}
