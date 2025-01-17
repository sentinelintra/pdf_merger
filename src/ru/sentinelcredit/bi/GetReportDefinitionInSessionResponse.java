
package ru.sentinelcredit.bi;

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
 *         &lt;element name="getReportDefinitionInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportDefinition"/>
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
    "getReportDefinitionInSessionReturn"
})
@XmlRootElement(name = "getReportDefinitionInSessionResponse")
public class GetReportDefinitionInSessionResponse {

    @XmlElement(required = true)
    protected ReportDefinition getReportDefinitionInSessionReturn;

    /**
     * Gets the value of the getReportDefinitionInSessionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getGetReportDefinitionInSessionReturn() {
        return getReportDefinitionInSessionReturn;
    }

    /**
     * Sets the value of the getReportDefinitionInSessionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setGetReportDefinitionInSessionReturn(ReportDefinition value) {
        this.getReportDefinitionInSessionReturn = value;
    }

}
