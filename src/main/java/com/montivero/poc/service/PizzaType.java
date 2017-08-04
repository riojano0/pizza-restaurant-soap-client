
package com.montivero.poc.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pizzaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="pizzaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MUZZARELA"/>
 *     &lt;enumeration value="ROQUEFORT"/>
 *     &lt;enumeration value="CHAMPINON"/>
 *     &lt;enumeration value="FUGAZZETA"/>
 *     &lt;enumeration value="ANCHOA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pizzaType")
@XmlEnum
public enum PizzaType {

    MUZZARELA,
    ROQUEFORT,
    CHAMPINON,
    FUGAZZETA,
    ANCHOA;

    public String value() {
        return name();
    }

    public static PizzaType fromValue(String v) {
        return valueOf(v);
    }

}
