package com.ron.SpringBootConsul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ApplicationConfig {

    @Value("${spring.consul.testKey}")
    private String testKey;

    @EventListener
    public void handleContextStart(EnvironmentChangeEvent event) {
        System.out.println("Value Changed to "+testKey);

    }



}
