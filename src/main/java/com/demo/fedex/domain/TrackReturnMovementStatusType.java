//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 02:27:40 PM EST 
//


package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackReturnMovementStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackReturnMovementStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOVEMENT_OCCURRED"/>
 *     &lt;enumeration value="NO_MOVEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackReturnMovementStatusType")
@XmlEnum
public enum TrackReturnMovementStatusType {

    MOVEMENT_OCCURRED,
    NO_MOVEMENT;

    public String value() {
        return name();
    }

    public static TrackReturnMovementStatusType fromValue(String v) {
        return valueOf(v);
    }

}
