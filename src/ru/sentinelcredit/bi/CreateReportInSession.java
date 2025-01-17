
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
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folderAbsolutePathURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataModelURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="XLIFFFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XLIFFData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="updateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportName",
    "folderAbsolutePathURL",
    "dataModelURL",
    "templateFileName",
    "templateData",
    "xliffFileName",
    "xliffData",
    "updateFlag",
    "bipSessionToken"
})
@XmlRootElement(name = "createReportInSession")
public class CreateReportInSession {

    @XmlElement(required = true)
    protected String reportName;
    @XmlElement(required = true)
    protected String folderAbsolutePathURL;
    @XmlElement(required = true)
    protected String dataModelURL;
    @XmlElement(required = true)
    protected String templateFileName;
    @XmlElement(required = true)
    protected byte[] templateData;
    @XmlElement(name = "XLIFFFileName", required = true)
    protected String xliffFileName;
    @XmlElement(name = "XLIFFData", required = true)
    protected byte[] xliffData;
    protected boolean updateFlag;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the folderAbsolutePathURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderAbsolutePathURL() {
        return folderAbsolutePathURL;
    }

    /**
     * Sets the value of the folderAbsolutePathURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderAbsolutePathURL(String value) {
        this.folderAbsolutePathURL = value;
    }

    /**
     * Gets the value of the dataModelURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataModelURL() {
        return dataModelURL;
    }

    /**
     * Sets the value of the dataModelURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataModelURL(String value) {
        this.dataModelURL = value;
    }

    /**
     * Gets the value of the templateFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateFileName() {
        return templateFileName;
    }

    /**
     * Sets the value of the templateFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateFileName(String value) {
        this.templateFileName = value;
    }

    /**
     * Gets the value of the templateData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTemplateData() {
        return templateData;
    }

    /**
     * Sets the value of the templateData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTemplateData(byte[] value) {
        this.templateData = ((byte[]) value);
    }

    /**
     * Gets the value of the xliffFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXLIFFFileName() {
        return xliffFileName;
    }

    /**
     * Sets the value of the xliffFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXLIFFFileName(String value) {
        this.xliffFileName = value;
    }

    /**
     * Gets the value of the xliffData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXLIFFData() {
        return xliffData;
    }

    /**
     * Sets the value of the xliffData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXLIFFData(byte[] value) {
        this.xliffData = ((byte[]) value);
    }

    /**
     * Gets the value of the updateFlag property.
     * 
     */
    public boolean isUpdateFlag() {
        return updateFlag;
    }

    /**
     * Sets the value of the updateFlag property.
     * 
     */
    public void setUpdateFlag(boolean value) {
        this.updateFlag = value;
    }

    /**
     * Gets the value of the bipSessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Sets the value of the bipSessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

}
