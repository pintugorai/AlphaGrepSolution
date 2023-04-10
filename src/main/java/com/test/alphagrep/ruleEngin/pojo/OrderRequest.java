package com.test.alphagrep.ruleEngin.pojo;

import com.test.alphagrep.ruleEngin.Type;

public class OrderRequest {
	private Type requestType;
	private int orderID;
	private int token;
	private String symbol;
	private String side;
	private Double price;
	private int quantity;
	private int quantityFilled;
	private int disclosedQnty;
	private String timeStamp;
	private String duration;
	private String orderType;
	private String account;
	private int exchange;
	private int numCopies;
	
	public Type getRequestType() {
		return requestType;
	}
	public void setRequestType(Type requestType) {
		this.requestType = requestType;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
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
	public int getQuantityFilled() {
		return quantityFilled;
	}
	public void setQuantityFilled(int quantityFilled) {
		this.quantityFilled = quantityFilled;
	}
	public int getDisclosedQnty() {
		return disclosedQnty;
	}
	public void setDisclosedQnty(int disclosedQnty) {
		this.disclosedQnty = disclosedQnty;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getExchange() {
		return exchange;
	}
	public void setExchange(int exchange) {
		this.exchange = exchange;
	}
	public int getNumCopies() {
		return numCopies;
	}
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	
	
}
