package com.companyname.bookstore.health;

import com.codahale.metrics.health.HealthCheck;

public class VersionHealthCheck extends HealthCheck {


    private final String version;

    public VersionHealthCheck(String version){

        this.version = version;

    }

    @Override
    protected Result check() {

        if(version.equals("")) {
            return Result.unhealthy("Invalid version");
        }
        return Result.healthy();
    }
}
