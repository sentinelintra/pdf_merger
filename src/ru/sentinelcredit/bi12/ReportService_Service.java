
package ru.sentinelcredit.bi12;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ReportService", targetNamespace = "http://xmlns.oracle.com/oxp/service/v2", wsdlLocation = "http://prodbi12:9502/xmlpserver/services/v2/ReportService?wsdl")
public class ReportService_Service
    extends Service
{

    private final static URL REPORTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ru.sentinelcredit.bi12.ReportService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ru.sentinelcredit.bi12.ReportService_Service.class.getResource(".");
            url = new URL(baseUrl, "http://prodbi12:9502/xmlpserver/services/v2/ReportService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://prodbi12:9502/xmlpserver/services/v2/ReportService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        REPORTSERVICE_WSDL_LOCATION = url;
    }

    public ReportService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportService_Service() {
        super(REPORTSERVICE_WSDL_LOCATION, new QName("http://xmlns.oracle.com/oxp/service/v2", "ReportService"));
    }

    /**
     * 
     * @return
     *     returns ReportService
     */
    @WebEndpoint(name = "ReportService")
    public ReportService getReportService() {
        return super.getPort(new QName("http://xmlns.oracle.com/oxp/service/v2", "ReportService"), ReportService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportService
     */
    @WebEndpoint(name = "ReportService")
    public ReportService getReportService(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/oxp/service/v2", "ReportService"), ReportService.class, features);
    }

}
