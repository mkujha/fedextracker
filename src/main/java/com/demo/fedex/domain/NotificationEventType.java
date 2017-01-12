
package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON_DELIVERY"/>
 *     &lt;enumeration value="ON_ESTIMATED_DELIVERY"/>
 *     &lt;enumeration value="ON_EXCEPTION"/>
 *     &lt;enumeration value="ON_SHIPMENT"/>
 *     &lt;enumeration value="ON_TENDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationEventType")
@XmlEnum
public enum NotificationEventType {

    ON_DELIVERY,
    ON_ESTIMATED_DELIVERY,
    ON_EXCEPTION,
    ON_SHIPMENT,
    ON_TENDER;

    public String value() {
        return name();
    }

    public static NotificationEventType fromValue(String v) {
        return valueOf(v);
    }

}
