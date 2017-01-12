
package com.demo.fedex.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentEventNotificationSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentEventNotificationSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{http://fedex.com/ws/track/v12}ShipmentNotificationRoleType" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://fedex.com/ws/track/v12}NotificationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotificationDetail" type="{http://fedex.com/ws/track/v12}NotificationDetail" minOccurs="0"/>
 *         &lt;element name="FormatSpecification" type="{http://fedex.com/ws/track/v12}ShipmentNotificationFormatSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentEventNotificationSpecification", propOrder = {
    "role",
    "events",
    "notificationDetail",
    "formatSpecification"
})
public class ShipmentEventNotificationSpecification {

    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected ShipmentNotificationRoleType role;
    @XmlElement(name = "Events")
    @XmlSchemaType(name = "string")
    protected List<NotificationEventType> events;
    @XmlElement(name = "NotificationDetail")
    protected NotificationDetail notificationDetail;
    @XmlElement(name = "FormatSpecification")
    protected ShipmentNotificationFormatSpecification formatSpecification;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotificationRoleType }
     *     
     */
    public ShipmentNotificationRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotificationRoleType }
     *     
     */
    public void setRole(ShipmentNotificationRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationEventType }
     * 
     * 
     */
    public List<NotificationEventType> getEvents() {
        if (events == null) {
            events = new ArrayList<NotificationEventType>();
        }
        return this.events;
    }

    /**
     * Gets the value of the notificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationDetail }
     *     
     */
    public NotificationDetail getNotificationDetail() {
        return notificationDetail;
    }

    /**
     * Sets the value of the notificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationDetail }
     *     
     */
    public void setNotificationDetail(NotificationDetail value) {
        this.notificationDetail = value;
    }

    /**
     * Gets the value of the formatSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotificationFormatSpecification }
     *     
     */
    public ShipmentNotificationFormatSpecification getFormatSpecification() {
        return formatSpecification;
    }

    /**
     * Sets the value of the formatSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotificationFormatSpecification }
     *     
     */
    public void setFormatSpecification(ShipmentNotificationFormatSpecification value) {
        this.formatSpecification = value;
    }

}