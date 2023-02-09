package com.sharedservices.ratelimiter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class RateLimitRequest {

    public static RateLimitRequest builder(String bucketKey) {
        // TODO - implement this
        return builder(bucketKey);
    }

    public RateLimitRequest bucketLimit(long bucketKey) {
        // TODO - implement this
        return null;
    }

    public RateLimitRequest policyName(String rateLimitPolicyJwtAndService) {
        // TODO - implement this
        return null;
    }

    public RateLimitRequest ipAddress(String ip) {
        // TODO - implement this
        return null;
    }

    public RateLimitRequest build() {
        // TODO - implement this
        return null;
    }

    public RateLimitRequest bucketTimeWindow(long timeWindow) {
        // TODO - implement this
        return null;
    }
}
