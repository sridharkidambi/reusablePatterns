package com.fmr.fbt.commonLibrary.fbtRateLimitter;

import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterConfig;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import io.vavr.collection.Map;
import io.vavr.collection.Seq;

import java.util.Optional;
import java.util.function.Supplier;

public class fbtCBRegistry implements RateLimiterRegistry {
    @Override
    public Seq<RateLimiter> getAllRateLimiters() {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name) {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name, Map<String, String> tags) {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name, RateLimiterConfig rateLimiterConfig) {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name, RateLimiterConfig rateLimiterConfig, Map<String, String> tags) {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name, Supplier<RateLimiterConfig> rateLimiterConfigSupplier) {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name, Supplier<RateLimiterConfig> rateLimiterConfigSupplier, Map<String, String> tags) {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name, String configName) {
        return null;
    }

    @Override
    public RateLimiter rateLimiter(String name, String configName, Map<String, String> tags) {
        return null;
    }

    @Override
    public void addConfiguration(String configName, RateLimiterConfig configuration) {

    }

    @Override
    public Optional<RateLimiter> find(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<RateLimiter> remove(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<RateLimiter> replace(String name, RateLimiter newEntry) {
        return Optional.empty();
    }

    @Override
    public Optional<RateLimiterConfig> getConfiguration(String configName) {
        return Optional.empty();
    }

    @Override
    public RateLimiterConfig getDefaultConfig() {
        return null;
    }

    @Override
    public Map<String, String> getTags() {
        return null;
    }

    @Override
    public EventPublisher<RateLimiter> getEventPublisher() {
        return null;
    }
}
