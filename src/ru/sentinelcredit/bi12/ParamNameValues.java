
package ru.sentinelcredit.bi12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamNameValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamNameValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfParamNameValues" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfParamNameValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamNameValues", propOrder = {
    "listOfParamNameValues"
})
public class ParamNameValues {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfParamNameValue listOfParamNameValues;

    /**
     * Gets the value of the listOfParamNameValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParamNameValue }
     *     
     */
    public ArrayOfParamNameValue getListOfParamNameValues() {
        return listOfParamNameValues;
    }

    /**
     * Sets the value of the listOfParamNameValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParamNameValue }
     *     
     */
    public void setListOfParamNameValues(ArrayOfParamNameValue value) {
        this.listOfParamNameValues = value;
    }

}
