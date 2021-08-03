package com.akn.service.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AknEurekaServiceRunner {
	public static void main(String[] args) {
		SpringApplication.run(AknEurekaServiceRunner.class, args);
	}
}
