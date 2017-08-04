
package com.montivero.poc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PizzaSoap", targetNamespace = "http://service.poc.montivero.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PizzaSoap {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPizza", targetNamespace = "http://service.poc.montivero.com/", className = "com.montivero.poc.service.GetPizza")
    @ResponseWrapper(localName = "getPizzaResponse", targetNamespace = "http://service.poc.montivero.com/", className = "com.montivero.poc.service.GetPizzaResponse")
    @Action(input = "http://service.poc.montivero.com/PizzaSoap/getPizzaRequest", output = "http://service.poc.montivero.com/PizzaSoap/getPizzaResponse")
    public String getPizza(
        @WebParam(name = "arg0", targetNamespace = "")
        PizzaType arg0);

}
