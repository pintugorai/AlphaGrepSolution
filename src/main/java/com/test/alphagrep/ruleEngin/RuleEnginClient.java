package com.test.alphagrep.ruleEngin;

import java.io.IOException;
import java.util.ArrayList;
import com.test.alphagrep.ruleEngin.pojo.ExchangeResponse;
import com.test.alphagrep.ruleEngin.pojo.OrderRequest;

public class RuleEnginClient {

	public static void main(String[] args) throws IOException {

		OrderRequest req = new OrderRequest();
		req.setRequestType(Type.NEWORDER);
		req.setOrderID(480069891);
		req.setToken(0);
		req.setSymbol("xyz");
		req.setSide("B");
		req.setPrice(123d);
		req.setQuantity(8);
		req.setQuantityFilled(0);
		req.setDisclosedQnty(8);
		req.setTimeStamp("1666287639395048969");
		req.setDuration("DAY");
		req.setOrderType("LIMIT");
		req.setAccount("bJEROM");
		req.setExchange(0);
		req.setNumCopies(0);

		ArrayList<ExchangeResponse> resList = new RequestService().send(req);
		display(resList);

	}

	// For debug
	public static void display(ArrayList<ExchangeResponse> resList) {
		for (ExchangeResponse er : resList) {
			System.out.println(er.getOrderID() + " | " + er.getResponseType());
		}

	}

}
