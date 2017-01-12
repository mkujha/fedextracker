
package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentNotificationFormatSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentNotificationFormatSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v12}NotificationFormatType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentNotificationFormatSpecification", propOrder = {
    "type"
})
public class ShipmentNotificationFormatSpecification {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected NotificationFormatType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationFormatType }
     *     
     */
    public NotificationFormatType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationFormatType }
     *     
     */
    public void setType(NotificationFormatType value) {
        this.type = value;
    }

}
