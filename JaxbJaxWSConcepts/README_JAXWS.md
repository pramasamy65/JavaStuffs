
JAX-WS

  Java API for XML web services
	If we are using JAX-WS API then web services uses SOAP messages to communicate each other
	SOAP messages are platform independent
	SOAP is XML based
	This is Java's standard API for working with XML-based web services
	Uses JaxB for marshaling and un marshaling XML
	SOAP(Simple Object Access Protocol) based
	WS communicate via SOAP messages via HTTP Protocol
	SOAP - Structured
	
	Ways to build web services
		TOP-Down
			In a top-down (contract-first) approach, a WSDL document is created, and the necessary Java classes are generated from the WSDL. 
		Bottom-Up
			In a bottom-up (contract-last) approach, the Java classes are written, and the WSDL is generated from the WSDL
	WSDL
		Defines structure of the content of SOAP messages and operations
		Definitions
			 Definitions element is the root element of all WSDL documents. It defines the name, the namespace, etc
		Types
			Data types used by the web service. WSDL uses XSD (XML Schema Definition) as the type
		Messages
			Each message element describes the input or output of a service method and the possible exceptions
		Operations and Port Types
			The portType element describes each operation that can be performed and all the message elements involved
		Bindings
			The binding element provides protocol and data format details for each portType:
		Services and Ports
		
Top-Down (Contract-First) Approach
		Create WSDL and use wsimport to generate WS source files
		
		wsimport http://localhost:8080/purchaseOrder?wsdl
		
		wsimport create interface and implementations based on WSDL Operations
		
Bottom-Up (Contract-Last) Approach
		
	In a bottom-up approach, we have to create both the endpoint interface and the implementation classes. 
	The WSDL is generated from the classes when the web service is published
	
		Example : Purchase order web-service
			Domain Model(POJO)
				- PurchaseOrder
				- Item
				- Customer 
				- Address
				- Loyalty
			
			Operations
				- Get list of order
				- Get specific order info
				- Add an order
				- Delete an order
				
		@WebService
		Class PurchaseOrderWebService
			define operations 
				- Get list of items
				- Delete an item
				
			public static void main(String args[]) {

				Endpoint.publish("http://localhost:8080/PurchaseOrderWS", new PurchaseOrderWebservice());
				System.out.println("PurchaseOrder Webserice is running...");
			}
			
		After publish, WSDL will be accessed using following URL
			http://localhost:8080/PurchaseOrderWS?wsdl
			
	Interface defines an abstract contract for the web service.	
		
	@WebService denotes that it is a web service interface
	@WebMethod is used to customize a web service operation
	@WebResult is used to customize name of the XML element that represents the return value
	
	
	GO to src/main/java
		wsimport -Xnocompile -keep http://localhost:8080/PurchaseOrderWS?wsdl

	Write PurchaseOrderClient to access WS
			
			
