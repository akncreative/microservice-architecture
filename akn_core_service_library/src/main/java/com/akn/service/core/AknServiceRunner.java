package com.akn.service.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.akn.service.common.log.AknLogFactory;
import com.akn.service.common.log.AknLogger;

@SpringBootApplication
@EnableEurekaClient
public abstract class AknServiceRunner {
	private static AknLogger logger = AknLogFactory.getLogger(AknServiceRunner.class);
	
	protected static void run(Class<?> className, String[] args) {
		logger = AknLogFactory.getLogger(className, className.getCanonicalName(), Thread.currentThread().getId());
		SpringApplication.run(className, args);
		logger.warn("Inside AKN Core Runner --> Running : "+className.getName());

	}
	
	 public abstract String getApplicationName(); 

}
