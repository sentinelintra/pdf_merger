
package ru.sentinelcredit.bi;

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
 *         &lt;element name="removeTemplateForReportReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeTemplateForReportReturn"
})
@XmlRootElement(name = "removeTemplateForReportResponse")
public class RemoveTemplateForReportResponse {

    protected boolean removeTemplateForReportReturn;

    /**
     * Gets the value of the removeTemplateForReportReturn property.
     * 
     */
    public boolean isRemoveTemplateForReportReturn() {
        return removeTemplateForReportReturn;
    }

    /**
     * Sets the value of the removeTemplateForReportReturn property.
     * 
     */
    public void setRemoveTemplateForReportReturn(boolean value) {
        this.removeTemplateForReportReturn = value;
    }

}
