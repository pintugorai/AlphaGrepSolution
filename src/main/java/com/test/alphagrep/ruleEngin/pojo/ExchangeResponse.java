package com.test.alphagrep.ruleEngin.pojo;

import com.test.alphagrep.ruleEngin.Type;

public class ExchangeResponse {
	private Type responseType;
	private int orderID;
	private String symbol;
	private String side;
	private Double price;
	private int quantity;
	private String accountID;
	private int errorCode;
	private String timeStamp;
	private int exchangeOrderId;
	private String childResponseType;
	private String duration;
	private String exchTs;

	public Type getResponseType() {
		return responseType;
	}

	public void setResponseType(Type responseType) {
		this.responseType = responseType;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getExchangeOrderId() {
		return exchangeOrderId;
	}

	public void setExchangeOrderId(int exchangeOrderId) {
		this.exchangeOrderId = exchangeOrderId;
	}

	public String getChildResponseType() {
		return childResponseType;
	}

	public void setChildResponseType(String childResponseType) {
		this.childResponseType = childResponseType;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getExchTs() {
		return exchTs;
	}

	public void setExchTs(String exchTs) {
		this.exchTs = exchTs;
	}
}
