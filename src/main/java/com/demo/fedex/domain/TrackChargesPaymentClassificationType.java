
package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackChargesPaymentClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackChargesPaymentClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUTIES_AND_TAXES"/>
 *     &lt;enumeration value="TRANSPORTATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackChargesPaymentClassificationType")
@XmlEnum
public enum TrackChargesPaymentClassificationType {

    DUTIES_AND_TAXES,
    TRANSPORTATION;

    public String value() {
        return name();
    }

    public static TrackChargesPaymentClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
