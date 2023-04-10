package com.test.alphagrep.ruleEngin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import com.test.alphagrep.ruleEngin.pojo.ExchangeResponse;
import com.test.alphagrep.ruleEngin.pojo.OrderRequest;

public class RequestService {
	public ArrayList<ExchangeResponse> send(OrderRequest req) throws IOException {

		Set<Type> possibleResponse = new Rules().getResponseList(req);
		ArrayList<ExchangeResponse> res = new ArrayList<ExchangeResponse>();
		ResponseService responseService = new ResponseService();

		for (Type t : possibleResponse) {
			if (t == Type.NEW_ORDER_CONFIRM)
				res.add(responseService.getNewOrderConfirmResponse(req));
			if (t == Type.TRADE_CONFIRM)
				res.add(responseService.getTradeConfirmResponse(req));
			if (t == Type.REJEC)
				res.add(responseService.getRejectResponse(req));
		}

		return res;
	}
}
