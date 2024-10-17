
package soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SaludoImplService", targetNamespace = "http://soap/", wsdlLocation = "http://localhost:9999/ws/saludo?wsdl")
public class SaludoImplService
    extends Service
{

    private final static URL SALUDOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SALUDOIMPLSERVICE_EXCEPTION;
    private final static QName SALUDOIMPLSERVICE_QNAME = new QName("http://soap/", "SaludoImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ws/saludo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SALUDOIMPLSERVICE_WSDL_LOCATION = url;
        SALUDOIMPLSERVICE_EXCEPTION = e;
    }

    public SaludoImplService() {
        super(__getWsdlLocation(), SALUDOIMPLSERVICE_QNAME);
    }

    public SaludoImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SALUDOIMPLSERVICE_QNAME, features);
    }

    public SaludoImplService(URL wsdlLocation) {
        super(wsdlLocation, SALUDOIMPLSERVICE_QNAME);
    }

    public SaludoImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SALUDOIMPLSERVICE_QNAME, features);
    }

    public SaludoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SaludoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Saludo
     */
    @WebEndpoint(name = "SaludoImplPort")
    public Saludo getSaludoImplPort() {
        return super.getPort(new QName("http://soap/", "SaludoImplPort"), Saludo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Saludo
     */
    @WebEndpoint(name = "SaludoImplPort")
    public Saludo getSaludoImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap/", "SaludoImplPort"), Saludo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SALUDOIMPLSERVICE_EXCEPTION!= null) {
            throw SALUDOIMPLSERVICE_EXCEPTION;
        }
        return SALUDOIMPLSERVICE_WSDL_LOCATION;
    }

}
