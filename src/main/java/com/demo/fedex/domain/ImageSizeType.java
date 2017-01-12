
package com.demo.fedex.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageSizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageSizeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LARGE"/>
 *     &lt;enumeration value="SMALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageSizeType")
@XmlEnum
public enum ImageSizeType {

    LARGE,
    SMALL;

    public String value() {
        return name();
    }

    public static ImageSizeType fromValue(String v) {
        return valueOf(v);
    }

}
