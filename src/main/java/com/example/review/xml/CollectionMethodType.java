//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 11:24:40 AM IST 
//


package com.example.review.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collectionMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="collectionMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unsolicited"/>
 *     &lt;enumeration value="post_fulfillment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "collectionMethodType")
@XmlEnum
public enum CollectionMethodType {


    /**
     * 
     *                         The user was not responding to a specific
     *                         solicitation when they submitted the review.
     *                     
     * 
     */
    @XmlEnumValue("unsolicited")
    UNSOLICITED("unsolicited"),

    /**
     * 
     *                         The user submitted the review in response
     *                         to a solicitation after fulfillment of the
     *                         user's order.
     *                     
     * 
     */
    @XmlEnumValue("post_fulfillment")
    POST_FULFILLMENT("post_fulfillment");
    private final String value;

    CollectionMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollectionMethodType fromValue(String v) {
        for (CollectionMethodType c: CollectionMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
