
package ru.sentinelcredit.exchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Agreements" type="{http://exchange.sentinelcredit.ru}ArrayOfAgreements"/>
 *         &lt;element name="Stamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fio",
    "agreements",
    "stamp"
})
@XmlRootElement(name = "GetReference")
public class GetReference {

    @XmlElement(name = "FIO", required = true)
    protected String fio;
    @XmlElement(name = "Agreements", required = true)
    protected ArrayOfAgreements agreements;
    @XmlElement(name = "Stamp", required = true, type = Boolean.class, nillable = true)
    protected Boolean stamp;

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the agreements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgreements }
     *     
     */
    public ArrayOfAgreements getAgreements() {
        return agreements;
    }

    /**
     * Sets the value of the agreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgreements }
     *     
     */
    public void setAgreements(ArrayOfAgreements value) {
        this.agreements = value;
    }

    /**
     * Gets the value of the stamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStamp() {
        return stamp;
    }

    /**
     * Sets the value of the stamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStamp(Boolean value) {
        this.stamp = value;
    }

}
