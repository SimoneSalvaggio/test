package com.example.demo.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction_requests_history")
public class TransactionRequestHistory {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;
	
    @Column(name = "request_date", updatable = false)
    private Date requestDate;

    @Column(name = "date_from", updatable = false)
    private String dateFrom;
    
    @Column(name = "date_to", updatable = false)
    private String dateTo;
    
    @Column(name = "result_size", updatable = false)
    private Integer resultSize;

    @Column(name = "account_id", updatable = false)
    private Long accountId;
    

	public TransactionRequestHistory() {
		super();
	}

	public TransactionRequestHistory(Long id, Date requestDate, String dateFrom, String dateTo, Integer resultSize, Long accountId) {
		super();
		this.id = id;
		this.requestDate = requestDate;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.resultSize = resultSize;
		this.accountId = accountId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public Integer getResultSize() {
		return resultSize;
	}

	public void setResultSize(Integer resultSize) {
		this.resultSize = resultSize;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "TransactionRequestHistory [id=" + id + ", requestDate=" + requestDate + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + ", resultSize=" + resultSize + ", accountId=" + accountId + "]";
	}
	
    

}
