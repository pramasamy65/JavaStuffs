package com.handson.jaxbjaxws.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import com.handson.jaxbjaxws.model.Custoemr;
import com.handson.jaxbjaxws.model.Item;
import com.handson.jaxbjaxws.model.PurchaseOrder;

/**
 * Hello world!
 *
 */
@SuppressWarnings("restriction")
public class Marshaling_UnMarshaling {

	public static void main(String[] args) throws JAXBException {

		marshaling();

		unMarshaling();
	}

	private static void unMarshaling() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(PurchaseOrder.class);
		Unmarshaller unMarshall = context.createUnmarshaller();
		PurchaseOrder order = (PurchaseOrder) unMarshall.unmarshal(new File("PurshaseOrder.xml"));
		System.out.println(order.getComent());
	}

	private static void marshaling() throws JAXBException, PropertyException {
		JAXBContext context = JAXBContext.newInstance(PurchaseOrder.class);
		Marshaller marshall = context.createMarshaller();
		marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshall.marshal(createOrder(), new File("PurshaseOrder.xml"));
		System.out.println("XML Generated Successfully");
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
		order.setItems(items);
		Custoemr customer = new Custoemr();
		customer.setName("John Peter");
		order.setCustoemr(customer);
		order.setComent("No Comments");
		return order;

	}
}
