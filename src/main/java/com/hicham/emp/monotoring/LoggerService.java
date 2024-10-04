package com.hicham.emp.monotoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {
    public final String LOGGER_SERVICE="Logger Service";
    @Override
    public Health health() {
        if (isLoggerHealthGood()){
            return Health.up().withDetail(LOGGER_SERVICE,"service is running").build();
        }
        return Health.down().withDetail(LOGGER_SERVICE,"service is not aviable").build();
    }
    private boolean isLoggerHealthGood(){
        return false;
    }

}
