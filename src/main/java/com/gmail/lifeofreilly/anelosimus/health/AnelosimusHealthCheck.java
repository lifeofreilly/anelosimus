package com.gmail.lifeofreilly.anelosimus.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * TODO
 */
public class AnelosimusHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy(); //TODO
    }
}
