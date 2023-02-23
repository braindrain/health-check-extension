package com.workshop.health.check.extension.deployment;

import com.workshop.health.check.extension.runtime.HealthCheckServlet;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.undertow.deployment.ServletBuildItem;

class HealthCheckExtensionProcessor {

    private static final String FEATURE = "health-check-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    ServletBuildItem createServlet() {
        return ServletBuildItem.builder("health", HealthCheckServlet.class.getName())
                .addMapping("/health")
                .build();
    }
}
