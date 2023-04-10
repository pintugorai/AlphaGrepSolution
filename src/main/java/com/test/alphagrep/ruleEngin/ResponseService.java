package com.test.alphagrep.ruleEngin;

import com.test.alphagrep.ruleEngin.pojo.ExchangeResponse;
import com.test.alphagrep.ruleEngin.pojo.OrderRequest;

public class ResponseService {

	public ExchangeResponse getRejectResponse(OrderRequest req) {
		ExchangeResponse res = new ExchangeResponse();
		res = getCommonDetails(req);
		res.setResponseType(Type.REJEC);
		return res;
	}

	public ExchangeResponse getTradeConfirmResponse(OrderRequest req) {
		ExchangeResponse res = new ExchangeResponse();
		res = getCommonDetails(req);
		res.setResponseType(Type.TRADE_CONFIRM);
		return res;
	}

	public ExchangeResponse getNewOrderConfirmResponse(OrderRequest req) {
		ExchangeResponse res = new ExchangeResponse();
		res = getCommonDetails(req);
		res.setResponseType(Type.NEW_ORDER_CONFIRM);
		return res;
	}
	
	private ExchangeResponse getCommonDetails(OrderRequest req) {
		ExchangeResponse res1 = new ExchangeResponse();
		res1.setOrderID(req.getOrderID());
		res1.setSymbol(req.getSymbol());
		return res1;
	}

}
