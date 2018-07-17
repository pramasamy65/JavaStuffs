package com.handson.jaxbjaxws.main;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.handson.jaxbjaxws.service.Custoemr;
import com.handson.jaxbjaxws.service.Item;
import com.handson.jaxbjaxws.service.PurchaseOrder;
import com.handson.jaxbjaxws.service.PurchaseOrderWS;
import com.handson.jaxbjaxws.service.PurchaseOrderWSService;


public class PurchaseOrderClient {

	public static void main(String args[]) throws RemoteException {
		PurchaseOrderWSService service = new PurchaseOrderWSService();
		com.handson.jaxbjaxws.service.PurchaseOrderWS port = service
				.getPurchaseOrderWSPort();

		long po = port.addOrder(createOrder());

		System.out.println("Added Order : " + po);

	}

	private static PurchaseOrder createOrder() {

		PurchaseOrder order = new PurchaseOrder();
		List<Item> items = new ArrayList<Item>();
		Item item1 = new Item();
		item1.setItemId(100);
		item1.setItemName("Marker");
		Item item2 = new Item();
		item2.setItemId(100);
		item2.setItemName("Marker");

		items.add(item1);
		items.add(item2);
		Custoemr customer = new Custoemr();
		customer.setName("John Peter");
		order.setCustoemr(customer);
		order.setComent("No Comments");
		return order;

	}

}
