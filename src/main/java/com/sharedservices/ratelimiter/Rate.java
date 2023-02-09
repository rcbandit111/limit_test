package com.sharedservices.ratelimiter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rate {

    private Integer limitCeiling;

    private Integer remainingRequests;

    private Integer timeWindowReset;

    public boolean isExceeded(){
        // TODO - implement this
        return false;
    }
}
