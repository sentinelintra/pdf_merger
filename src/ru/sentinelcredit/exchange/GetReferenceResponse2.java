
package ru.sentinelcredit.exchange;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetReferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReferenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="return" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id_Agreements" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Form" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
@XmlType(name = "GetReferenceResponse", propOrder = {
    "message",
    "_return"
})
public class GetReferenceResponse2 {

    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "return", required = true, nillable = true)
    protected List<GetReferenceResponse2 .Return> _return;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetReferenceResponse2 .Return }
     * 
     * 
     */
    public List<GetReferenceResponse2 .Return> getReturn() {
        if (_return == null) {
            _return = new ArrayList<GetReferenceResponse2 .Return>();
        }
        return this._return;
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
     *         &lt;element name="Id_Agreements" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Form" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
        "idAgreements",
        "message",
        "form"
    })
    public static class Return {

        @XmlElement(name = "Id_Agreements", required = true)
        protected String idAgreements;
        @XmlElement(name = "Message", required = true, nillable = true)
        protected String message;
        @XmlElement(name = "Form", required = true, nillable = true)
        protected byte[] form;

        /**
         * Gets the value of the idAgreements property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdAgreements() {
            return idAgreements;
        }

        /**
         * Sets the value of the idAgreements property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdAgreements(String value) {
            this.idAgreements = value;
        }

        /**
         * Gets the value of the message property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Sets the value of the message property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
        }

        /**
         * Gets the value of the form property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getForm() {
            return form;
        }

        /**
         * Sets the value of the form property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setForm(byte[] value) {
            this.form = ((byte[]) value);
        }

    }

}
