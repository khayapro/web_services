package com.company;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by khayapro on 2016/09/29.
 *
 * @WebService defines this as a SEI (Service End-Point Interface)
 * @SOAPBinding defines the construction of the Web Service contract - WSDL
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimerServer {

    /**
     * @WebMethod defines a web service operation
     * @return String
     */
    @WebMethod String getTimerAsString();
    /**
     * @WebMethod defines a web service operation
     * @return long
     */
    @WebMethod long getTimerAsElapse();
}
