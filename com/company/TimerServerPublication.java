package com.company;

import javax.xml.ws.Endpoint;

/**
 * To test the WebService deployment in development / light prod mode
 */
public class TimerServerPublication {

    /**
     * Publishes the Web Service and exposes the API i.e SIE contract
     * Once published, you can access it via browser - http://localhost:8080/company?wsdl
     * This will show the WSDL document generated, ready to be invoked.
     * @param args
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/company", new TimerServerBean());
    }
}
