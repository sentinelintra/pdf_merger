
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
 *         &lt;element name="updateReportDefinitionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateReportDefinitionReturn"
})
@XmlRootElement(name = "updateReportDefinitionResponse")
public class UpdateReportDefinitionResponse {

    protected boolean updateReportDefinitionReturn;

    /**
     * Gets the value of the updateReportDefinitionReturn property.
     * 
     */
    public boolean isUpdateReportDefinitionReturn() {
        return updateReportDefinitionReturn;
    }

    /**
     * Sets the value of the updateReportDefinitionReturn property.
     * 
     */
    public void setUpdateReportDefinitionReturn(boolean value) {
        this.updateReportDefinitionReturn = value;
    }

}
