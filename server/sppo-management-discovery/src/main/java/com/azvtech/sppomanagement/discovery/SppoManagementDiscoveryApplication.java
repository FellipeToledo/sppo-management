package com.azvtech.sppomanagement.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SppoManagementDiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SppoManagementDiscoveryApplication.class, args);
	}

}
