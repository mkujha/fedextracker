//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.19 at 12:31:22 PM EST 
//


package com.demo.fedex.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Begins" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Ends" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRange", propOrder = {
    "begins",
    "ends"
})
public class DateRange
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Begins")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar begins;
    @XmlElement(name = "Ends")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ends;

    /**
     * Gets the value of the begins property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegins() {
        return begins;
    }

    /**
     * Sets the value of the begins property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegins(XMLGregorianCalendar value) {
        this.begins = value;
    }

    /**
     * Gets the value of the ends property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnds() {
        return ends;
    }

    /**
     * Sets the value of the ends property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnds(XMLGregorianCalendar value) {
        this.ends = value;
    }

}
