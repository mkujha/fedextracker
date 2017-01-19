//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.19 at 12:31:22 PM EST 
//


package com.demo.fedex.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableImagesDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableImagesDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v12}AvailableImageType" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://fedex.com/ws/track/v12}ImageSizeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableImagesDetail", propOrder = {
    "type",
    "size"
})
public class AvailableImagesDetail
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Type")
    protected AvailableImageType type;
    @XmlElement(name = "Size")
    protected ImageSizeType size;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableImageType }
     *     
     */
    public AvailableImageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableImageType }
     *     
     */
    public void setType(AvailableImageType value) {
        this.type = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link ImageSizeType }
     *     
     */
    public ImageSizeType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSizeType }
     *     
     */
    public void setSize(ImageSizeType value) {
        this.size = value;
    }

}
