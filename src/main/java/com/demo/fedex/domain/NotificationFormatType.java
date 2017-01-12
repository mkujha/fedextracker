
package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationFormatType")
@XmlEnum
public enum NotificationFormatType {

    HTML,
    TEXT;

    public String value() {
        return name();
    }

    public static NotificationFormatType fromValue(String v) {
        return valueOf(v);
    }

}
