
package ru.sentinelcredit.bi12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="removeObjectFromCacheReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeObjectFromCacheReturn"
})
@XmlRootElement(name = "removeObjectFromCacheResponse")
public class RemoveObjectFromCacheResponse {

    protected boolean removeObjectFromCacheReturn;

    /**
     * Gets the value of the removeObjectFromCacheReturn property.
     * 
     */
    public boolean isRemoveObjectFromCacheReturn() {
        return removeObjectFromCacheReturn;
    }

    /**
     * Sets the value of the removeObjectFromCacheReturn property.
     * 
     */
    public void setRemoveObjectFromCacheReturn(boolean value) {
        this.removeObjectFromCacheReturn = value;
    }

}
