
package ru.sentinelcredit.exchange;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "mxs_ExchangePortType", targetNamespace = "http://exchange.sentinelcredit.ru")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MxsExchangePortType {


    /**
     * 
     * @param guid
     * @return
     *     returns ru.sentinelcredit.exchange.ResponseGetDebet
     */
    @WebMethod(operationName = "GetDebet", action = "http://exchange.sentinelcredit.ru#mxs_Exchange:GetDebet")
    @WebResult(targetNamespace = "http://exchange.sentinelcredit.ru")
    @RequestWrapper(localName = "GetDebet", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetDebet")
    @ResponseWrapper(localName = "GetDebetResponse", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetDebetResponse")
    public ResponseGetDebet getDebet(
        @WebParam(name = "GUID", targetNamespace = "http://exchange.sentinelcredit.ru")
        String guid);

    /**
     * 
     * @param stamp
     * @param agreements
     * @param fio
     * @return
     *     returns ru.sentinelcredit.exchange.GetReferenceResponse2
     */
    @WebMethod(operationName = "GetReference", action = "http://exchange.sentinelcredit.ru#mxs_Exchange:GetReference")
    @WebResult(targetNamespace = "http://exchange.sentinelcredit.ru")
    @RequestWrapper(localName = "GetReference", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetReference")
    @ResponseWrapper(localName = "GetReferenceResponse", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetReferenceResponse")
    public GetReferenceResponse2 getReference(
        @WebParam(name = "FIO", targetNamespace = "http://exchange.sentinelcredit.ru")
        String fio,
        @WebParam(name = "Agreements", targetNamespace = "http://exchange.sentinelcredit.ru")
        ArrayOfAgreements agreements,
        @WebParam(name = "Stamp", targetNamespace = "http://exchange.sentinelcredit.ru")
        Boolean stamp);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPayment", action = "http://exchange.sentinelcredit.ru#mxs_Exchange:GetPayment")
    @WebResult(targetNamespace = "http://exchange.sentinelcredit.ru")
    @RequestWrapper(localName = "GetPayment", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetPayment")
    @ResponseWrapper(localName = "GetPaymentResponse", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetPaymentResponse")
    public String getPayment();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPayment_test", action = "http://exchange.sentinelcredit.ru#mxs_Exchange:GetPayment_test")
    @WebResult(targetNamespace = "http://exchange.sentinelcredit.ru")
    @RequestWrapper(localName = "GetPayment_test", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetPaymentTest")
    @ResponseWrapper(localName = "GetPayment_testResponse", targetNamespace = "http://exchange.sentinelcredit.ru", className = "ru.sentinelcredit.exchange.GetPaymentTestResponse")
    public String getPaymentTest();

}
