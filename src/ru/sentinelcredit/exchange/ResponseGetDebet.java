
package ru.sentinelcredit.exchange;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseGetDebet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetDebet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PartDebt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetDebet", propOrder = {
    "error",
    "dataList"
})
public class ResponseGetDebet {

    @XmlElement(name = "Error", required = true, nillable = true)
    protected String error;
    @XmlElement(name = "DataList", nillable = true)
    protected List<ResponseGetDebet.DataList> dataList;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the dataList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseGetDebet.DataList }
     * 
     * 
     */
    public List<ResponseGetDebet.DataList> getDataList() {
        if (dataList == null) {
            dataList = new ArrayList<ResponseGetDebet.DataList>();
        }
        return this.dataList;
    }


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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PartDebt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "code",
        "partDebt",
        "value",
        "currency"
    })
    public static class DataList {

        @XmlElement(name = "Code", required = true, nillable = true)
        protected String code;
        @XmlElement(name = "PartDebt", required = true, nillable = true)
        protected String partDebt;
        @XmlElement(name = "Value", required = true, type = Float.class, nillable = true)
        protected Float value;
        @XmlElement(name = "Currency", required = true, nillable = true)
        protected String currency;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the partDebt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartDebt() {
            return partDebt;
        }

        /**
         * Sets the value of the partDebt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartDebt(String value) {
            this.partDebt = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setValue(Float value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

    }

}
