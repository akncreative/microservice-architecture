package com.akn.service.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

import com.akn.service.core.AknServiceRunner;

@RefreshScope
@ComponentScan("com.akn.service.gateway.*")
public class AknGatewayServiceRunner extends AknServiceRunner{
	
	@Value("${app.description}")
	static String applicationDescription;
	
	public static void main(String[] args) {
		run(AknGatewayServiceRunner.class, args);
	}

	@Override
	public String getApplicationName() {
		return applicationDescription;
	}


}
