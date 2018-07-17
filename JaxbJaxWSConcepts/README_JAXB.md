
JAXB - Java Architecture for XML Binding
	
	XML - Extensible Markup Language
	Storing data in structured way
	NameSpace 
		Like similar to packages in Java
		XML Namespaces provide a method to avoid element name conflicts
	XML Schema -> Data model for XML, Specifies what valid XML doc look like
		XML Schema Language 
			DTD(Document Type Definition)
				NOT SUPPORT NAMESPACE and Data Types
			XSD (SML Schema) --> Itself an XML Document
			
	  XML Scheme Type
		Simple Type - Single element like java value types
		Complex Type - Nested element like class within class object(java class types)
		
	JAXB is used to convert Java objects to XML and vice versa
	
	DOM API - Document Object Model
		DOM API to read XML file then building in-memory tree which contains nodes
		Package org.w3C.dom in JDK -> contains Document, Element, Attribute ....
		Easy to use but due to memory contrains its not scaleable for large Docs
				
	SAX API - Simple API for XML
		Event Based API
		PUSH based
		package org.xml.sax in JDK
		
	
	STAX API - Streaming API for XML
		Event Based API
		Pull Based
		package javax.xml.stream
		Interfaces -> XMLStreamReader, XMLStreamWriter
	
	The above 3 are low-level API. So need to write more code. 
	Low level API gives more control
	
	JAXB - High-Level API. Avoid boiler-plate codes
		package javax.xml.bind
		Two Approach 
			Code-First Approach: Java -> XSD schema (Start Java & Generate XSD)
			Schema-First: XSD -> Java (Start XSD & Generate Java)
			
	Marshalling -> Java to XML
	UnMarshalling -> XML to Java
	JAXB other Implementation -> EclipseLink MOXy
	
	Marshalling (Java Objects to XML Elements)
	
		JAXBContext context = JAXBContext.newInstance(PurchaseOrder.class);
		Marshaller marshall = context.createMarshaller();
		marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshall.marshal(createOrder(), new File("PurshaseOrder.xml"));
		
		
	UnMarshalling (XML Elements to Java Objects)
	
		JAXBContext context = JAXBContext.newInstance(PurchaseOrder.class);
		Unmarshaller unMarshall = context.createUnmarshaller();
		PurchaseOrder order = (PurchaseOrder) unMarshall.unmarshal(new File("PurshaseOrder.xml"));
	
	JAXB Annotations
	
		@XmlRootElement - Use class level or Enum level
			@XmlElement(name="xyz")
		@XmlAttribute
			Attributes not a element
		@XmlAccessorType - Use class level or package
			Automatically map all non-static and non-transient fields
			@XmlAccessorType(XmlAccesType.NONE)
				Explicitly annotate the fields.
			XmlAccesType.FIELD - map Only Fields
				Simple Types - Value Type(Just Simple String)
				Class Types - Complex types(Other Classes as types)
			XmlAccesType.PROPERTY -> map only setter and getter
			XmlAccesType.PUBLIC_MEMBER
		@XmlElement - To annotate Fields
			@XmlElement(defaultValue='XXXXX', required=true)
		@XmlTransient - Exclude elements
		
	Annotations for ordering Elements
	
		@XmlAccessorOder(XmlAccessorOrder.ALPHABETICAL) - To order elements 
			Class level or Package level
			
		@XMLType - Order by field names.So Xml elements will be generated in the order
			class level and enum
			@XmlType(propOrder={"name", "Customer", "item"})
				Will throw error if we missed to mention any fields
		
	Annotations for Simple Types
	
		@XmlSchemaType
			@XmlSchemaType(name="date") - Field Level
			@XmlSchemaType(type= Date.class. name="date") - Package Level
		@XmlValue
			Nested fields are mapped to class but need to use only once in the class
			
			@XmlValue
			private String code;
			
			Before
			<Country>
				<code>USA</code>
			</country>
			
			After <Country>USA</country>
			
			
	Annotations for Collections
	
		@XmlElement(name="item")
		Private List<Item> items; --> <item>.....</item> <item>.....</item> <item>.....</item> etc...
		
		Private Items items; So this Items class will have list of item
			Items class is a wrapper class for list of items
			<items>
				<item>.....</item> <item>.....</item>
			</items>
			
		Alternate way
		@xmlElementWrapper(name="items")
		@XmlElement(name="item")
		Private List<Item> items;
			
			This will create 
			<items>
				<item>.....</item> <item>.....</item>
			</items>
			
		Map
		
		Map<String,String> items = new HashMap<>();
		map.put("10123", items1);map.put("5603", items2);
		
		<items>
			<entry>
				<key>10123</key>
				<value>...Item..</value
			</entry>
			
	Custom mapping with adapters
		 Class having map but we want generate the list of items then we write adapters to convert map to list 
		 while marshaling and list to map while un-marshaling
		 
		 @XmlJavaTypeAdapter(ItemsAdapter.class)
		 private Map<String, Item> items;
		 
		 
		 public class ItemsAdapter extends XMLAdapter<ItemsWrapper, Map<String, Item>> {
		 
		 	Override marshall and un-marshal
		 	
		 ItemsWrapper - will 	
		 	Private List<Item> items;
		 	
		 	
	Generate an XML Schema from Java Object(XSD File)
		Using the Schemagen Tool --> Using schemagen JDK tool in the commandline
		Generate Schema programmatically 
			JAXBContext.generateSchema()
		
	Generate Java classes using XSD
	
	
