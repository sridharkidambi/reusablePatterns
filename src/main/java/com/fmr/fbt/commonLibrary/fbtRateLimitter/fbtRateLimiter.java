package com.fmr.fbt.commonLibrary.fbtRateLimitter;

import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterConfig;
import io.vavr.collection.Map;

import java.time.Duration;

public class fbtRateLimiter implements RateLimiter {
    @Override
    public void changeTimeoutDuration(Duration timeoutDuration) {

    }

    @Override
    public void changeLimitForPeriod(int limitForPeriod) {

    }

    @Override
    public boolean acquirePermission(int permits) {
        return false;
    }

    @Override
    public long reservePermission(int permits) {
        return 0;
    }

    @Override
    public void drainPermissions() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public RateLimiterConfig getRateLimiterConfig() {
        return null;
    }

    @Override
    public Map<String, String> getTags() {
        return null;
    }

    @Override
    public Metrics getMetrics() {
        return null;
    }

    @Override
    public EventPublisher getEventPublisher() {
        return null;
    }
}
