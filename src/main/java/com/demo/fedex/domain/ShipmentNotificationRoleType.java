
package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentNotificationRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentNotificationRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SHIPPER"/>
 *     &lt;enumeration value="THIRD_PARTY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentNotificationRoleType")
@XmlEnum
public enum ShipmentNotificationRoleType {

    BROKER,
    OTHER,
    RECIPIENT,
    SHIPPER,
    THIRD_PARTY;

    public String value() {
        return name();
    }

    public static ShipmentNotificationRoleType fromValue(String v) {
        return valueOf(v);
    }

}
