//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 07:44:04 PM EST 
//


package com.demo.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarrierCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDXC"/>
 *     &lt;enumeration value="FDXE"/>
 *     &lt;enumeration value="FDXG"/>
 *     &lt;enumeration value="FXCC"/>
 *     &lt;enumeration value="FXFR"/>
 *     &lt;enumeration value="FXSP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarrierCodeType")
@XmlEnum
public enum CarrierCodeType {

    FDXC,
    FDXE,
    FDXG,
    FXCC,
    FXFR,
    FXSP;

    public String value() {
        return name();
    }

    public static CarrierCodeType fromValue(String v) {
        return valueOf(v);
    }

}
