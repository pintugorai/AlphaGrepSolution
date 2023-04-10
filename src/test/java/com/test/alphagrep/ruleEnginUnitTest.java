package com.test.alphagrep;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.alphagrep.ruleEngin.RequestService;
import com.test.alphagrep.ruleEngin.Type;
import com.test.alphagrep.ruleEngin.pojo.ExchangeResponse;
import com.test.alphagrep.ruleEngin.pojo.OrderRequest;

public class ruleEnginUnitTest {

	@Test
	public void testCase1() throws IOException {
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
		RequestService rule = new RequestService();
		//RuleEnginClient rule1 = new RuleEnginClient();
		ArrayList<ExchangeResponse> resList = rule.send(req);
		//rule.display(resList);
		Assert.assertEquals(resList.size(), 2);
		Assert.assertEquals(resList.get(0).getResponseType(), Type.NEW_ORDER_CONFIRM);
		Assert.assertEquals(resList.get(1).getResponseType(), Type.TRADE_CONFIRM);
	}
	@Test
	public void testCase2() throws IOException {
		OrderRequest req = new OrderRequest();
		req.setRequestType(Type.NEWORDER);
		req.setOrderID(480069891);
		req.setToken(0);
		req.setSymbol("xyza");
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
		RequestService rule = new RequestService();
		ArrayList<ExchangeResponse> resList = rule.send(req);
		//rule.display(resList);
		Assert.assertEquals(resList.size(), 1);
		Assert.assertEquals(resList.get(0).getResponseType(), Type.NEW_ORDER_CONFIRM);
	}
}
