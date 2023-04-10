package com.test.alphagrep.ruleEngin;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import com.test.alphagrep.ruleEngin.pojo.OrderRequest;

public class Rules {

	public Set<Type> getResponseList(OrderRequest req) throws IOException {

		FileReader reader = new FileReader(System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\test\\alphagrep\\ruleEngin\\config\\config.properties");

		Properties p = new Properties();
		p.load(reader);

		int qtyMultipler = Integer.parseInt((String) p.get("qtyMultipler"));
		Double pricelimit = Double.parseDouble((String) p.get("pricelimit"));
		Double price = Double.valueOf((String) p.get("price"));

		Set<Type> responses = new HashSet<Type>();

		if (req.getPrice() == price) {
			responses.add(Type.REJEC);
			return responses;
		}

		if (req.getQuantity() % qtyMultipler == 0) {
			responses.add(Type.NEW_ORDER_CONFIRM);
		} else {
			responses.add(Type.REJEC);
			return responses;
		}

		if (req.getSymbol().equalsIgnoreCase("xyz")) {
			if (req.getPrice() > pricelimit) {
				responses.add(Type.REJEC);
				return responses;
			} else {
				responses.add(Type.NEW_ORDER_CONFIRM);
				responses.add(Type.TRADE_CONFIRM);
			}
		}

		return responses;
	}

}
