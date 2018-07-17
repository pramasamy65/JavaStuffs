
package com.handson.jaxbjaxws.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchaseOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custoemr" type="{http://service.jaxbjaxws.handson.com/}custoemr" minOccurs="0"/>
 *         &lt;element name="items" type="{http://service.jaxbjaxws.handson.com/}item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseOrder", propOrder = {
    "coment",
    "custoemr",
    "items"
})
public class PurchaseOrder {

    protected String coment;
    protected Custoemr custoemr;
    @XmlElement(nillable = true)
    protected List<Item> items;

    /**
     * Gets the value of the coment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComent() {
        return coment;
    }

    /**
     * Sets the value of the coment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComent(String value) {
        this.coment = value;
    }

    /**
     * Gets the value of the custoemr property.
     * 
     * @return
     *     possible object is
     *     {@link Custoemr }
     *     
     */
    public Custoemr getCustoemr() {
        return custoemr;
    }

    /**
     * Sets the value of the custoemr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custoemr }
     *     
     */
    public void setCustoemr(Custoemr value) {
        this.custoemr = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
    }

}
