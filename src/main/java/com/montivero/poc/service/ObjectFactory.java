
package com.montivero.poc.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.montivero.poc.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPizza_QNAME = new QName("http://service.poc.montivero.com/", "getPizza");
    private final static QName _GetPizzaResponse_QNAME = new QName("http://service.poc.montivero.com/", "getPizzaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.montivero.poc.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPizza }
     * 
     */
    public GetPizza createGetPizza() {
        return new GetPizza();
    }

    /**
     * Create an instance of {@link GetPizzaResponse }
     * 
     */
    public GetPizzaResponse createGetPizzaResponse() {
        return new GetPizzaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPizza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.poc.montivero.com/", name = "getPizza")
    public JAXBElement<GetPizza> createGetPizza(GetPizza value) {
        return new JAXBElement<GetPizza>(_GetPizza_QNAME, GetPizza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPizzaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.poc.montivero.com/", name = "getPizzaResponse")
    public JAXBElement<GetPizzaResponse> createGetPizzaResponse(GetPizzaResponse value) {
        return new JAXBElement<GetPizzaResponse>(_GetPizzaResponse_QNAME, GetPizzaResponse.class, null, value);
    }

}
