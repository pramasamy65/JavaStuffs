package com.handson.jaxbjaxws.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class PurchaseOrder {

	List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Custoemr getCustoemr() {
		return custoemr;
	}

	public void setCustoemr(Custoemr custoemr) {
		this.custoemr = custoemr;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	private Custoemr custoemr;
	private String coment;

}
