package com.example.demo.model.response;

import java.util.List;

public class BaseResponse<T> {

	private String status;
	
	private List<Object> error;
	
	private T payload;

	
	public BaseResponse() {
		super();
	}

	public BaseResponse(String status, List<Object> error, T payload) {
		super();
		this.status = status;
		this.error = error;
		this.payload = payload;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Object> getError() {
		return error;
	}

	public void setError(List<Object> error) {
		this.error = error;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "BaseResponse [status=" + status + ", error=" + error + ", payload=" + payload + "]";
	}
	
}
