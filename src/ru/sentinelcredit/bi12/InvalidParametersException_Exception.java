
package ru.sentinelcredit.bi12;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "fault2", targetNamespace = "http://xmlns.oracle.com/oxp/service/v2")
public class InvalidParametersException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidParametersException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidParametersException_Exception(String message, InvalidParametersException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidParametersException_Exception(String message, InvalidParametersException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: scm.bi12.InvalidParametersException
     */
    public InvalidParametersException getFaultInfo() {
        return faultInfo;
    }

}
