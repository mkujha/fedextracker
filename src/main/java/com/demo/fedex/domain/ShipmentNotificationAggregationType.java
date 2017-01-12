
package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentNotificationAggregationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentNotificationAggregationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PER_PACKAGE"/>
 *     &lt;enumeration value="PER_SHIPMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentNotificationAggregationType")
@XmlEnum
public enum ShipmentNotificationAggregationType {

    PER_PACKAGE,
    PER_SHIPMENT;

    public String value() {
        return name();
    }

    public static ShipmentNotificationAggregationType fromValue(String v) {
        return valueOf(v);
    }

}
