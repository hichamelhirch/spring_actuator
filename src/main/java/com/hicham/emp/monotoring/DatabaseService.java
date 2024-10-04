package com.hicham.emp.monotoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {
    public final String Database_Service="DatabaseService";
    @Override
    public Health health() {
        if (isDatabaseHealthGood()){
            return Health.up().withDetail(Database_Service,"service is running").build();
        }
        return Health.down().withDetail(Database_Service,"service is not aviable").build();
    }
    public boolean isDatabaseHealthGood(){
        //logic
        return true;
    }
}
