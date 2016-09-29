package com.company;

import javax.jws.WebService;
import java.util.Calendar;

/**
 * Created by khayapro on 2016/09/29.
 * SEI - Service End-Point Interface
 * SIB - Service Implementation Interface
 * @WebService - endpointInterface property - links the Bean(SIB) implementation with the contracts (SEI)
 * i.e TimerServiceBean to TimerServer
 */
@WebService(endpointInterface = "com.company.TimerServer")
public class TimerServerBean implements TimerServer {

    private static final Calendar cal;

    /**
     * Init calendar instance on creation / instantiation
     */
    static {
        cal = Calendar.getInstance();
    }

    /**
     * Default no-args constructor required for @WebService
     */
    public TimerServerBean(){
        super();
    }

    @Override
    public String getTimerAsString() {
        return cal.getTime().toString();
    }

    @Override
    public long getTimerAsElapse() {
        return cal.getTime().getTime();
    }
}
