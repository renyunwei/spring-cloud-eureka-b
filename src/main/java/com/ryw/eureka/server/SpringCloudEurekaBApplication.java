package com.ryw.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaBApplication.class, args);
	}
}
