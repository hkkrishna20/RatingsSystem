//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.10 at 11:24:40 AM IST 
//


package com.example.review.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The publisher entity.
 *             
 * 
 * <p>Java class for publisherType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publisherType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{}nonEmptyStringType"/>
 *         &lt;element name="favicon" type="{}httpUrlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publisherType", propOrder = {
    "name",
    "favicon"
})
public class PublisherType {

    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "anyURI")
    protected String favicon;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the favicon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavicon() {
        return favicon;
    }

    /**
     * Sets the value of the favicon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavicon(String value) {
        this.favicon = value;
    }

}
