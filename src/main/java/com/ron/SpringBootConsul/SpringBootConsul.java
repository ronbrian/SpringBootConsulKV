package com.ron.SpringBootConsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;
import java.net.URISyntaxException;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootConsul {

    public static void main(String[] args) throws URISyntaxException, IOException {
        SpringApplication.run(SpringBootConsul.class, args);

    }

}
