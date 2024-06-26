package com.azvtech.sppo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class SppoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SppoServerApplication.class, args);
	}

}
