package com.handson.jaxbjaxws.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.handson.jaxbjaxws.model.PurchaseOrder;

@SuppressWarnings("restriction")
@WebService
public class PurchaseOrderWS {

	private Map<Long, PurchaseOrder> po = new HashMap<Long, PurchaseOrder>();

	public List<PurchaseOrder> getAllOrders() {
		return new ArrayList<PurchaseOrder>(po.values());
	}

	public static void main(String args[]) {

		Endpoint.publish("http://localhost:8080/PurchaseOrderWS", new PurchaseOrderWS());
		System.out.println("PurchaseOrder Webserice is running...");
	}

}
