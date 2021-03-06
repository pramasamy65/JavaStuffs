
package com.handson.jaxbjaxws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PurchaseOrderWSService", targetNamespace = "http://service.jaxbjaxws.handson.com/", wsdlLocation = "http://localhost:8080/PurchaseOrderWS?wsdl")
public class PurchaseOrderWSService
    extends Service
{

    private final static URL PURCHASEORDERWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException PURCHASEORDERWSSERVICE_EXCEPTION;
    private final static QName PURCHASEORDERWSSERVICE_QNAME = new QName("http://service.jaxbjaxws.handson.com/", "PurchaseOrderWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PurchaseOrderWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PURCHASEORDERWSSERVICE_WSDL_LOCATION = url;
        PURCHASEORDERWSSERVICE_EXCEPTION = e;
    }

    public PurchaseOrderWSService() {
        super(__getWsdlLocation(), PURCHASEORDERWSSERVICE_QNAME);
    }

    public PurchaseOrderWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PURCHASEORDERWSSERVICE_QNAME, features);
    }

    public PurchaseOrderWSService(URL wsdlLocation) {
        super(wsdlLocation, PURCHASEORDERWSSERVICE_QNAME);
    }

    public PurchaseOrderWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PURCHASEORDERWSSERVICE_QNAME, features);
    }

    public PurchaseOrderWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PurchaseOrderWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PurchaseOrderWS
     */
    @WebEndpoint(name = "PurchaseOrderWSPort")
    public PurchaseOrderWS getPurchaseOrderWSPort() {
        return super.getPort(new QName("http://service.jaxbjaxws.handson.com/", "PurchaseOrderWSPort"), PurchaseOrderWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PurchaseOrderWS
     */
    @WebEndpoint(name = "PurchaseOrderWSPort")
    public PurchaseOrderWS getPurchaseOrderWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.jaxbjaxws.handson.com/", "PurchaseOrderWSPort"), PurchaseOrderWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PURCHASEORDERWSSERVICE_EXCEPTION!= null) {
            throw PURCHASEORDERWSSERVICE_EXCEPTION;
        }
        return PURCHASEORDERWSSERVICE_WSDL_LOCATION;
    }

}
