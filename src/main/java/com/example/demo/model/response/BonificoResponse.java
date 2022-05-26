package com.example.demo.model.response;

public class BonificoResponse {
	
	private String code;
	
	private String description;
	
	private Object results;

	public BonificoResponse() {
		super();
	}

	public BonificoResponse(String code, String description, Object results) {
		super();
		this.code = code;
		this.description = description;
		this.results = results;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getResults() {
		return results;
	}

	public void setResults(Object results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "BonificoResponse [code=" + code + ", description=" + description + ", results=" + results + "]";
	}

	

}
