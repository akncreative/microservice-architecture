package com.akn.service.gateway.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akn.service.common.log.AknLogFactory;
import com.akn.service.common.log.AknLogger;

@CrossOrigin
@RestController
@RequestMapping("/")
public class AknGatewayController {
	
	private static AknLogger logger = AknLogFactory.getLogger(AknGatewayController.class);
	
	@Autowired
	HttpServletRequest httpRequest;
	
	@PostMapping(value = "/getHeaders", produces = "application/json")
	public ResponseEntity<Object> getHeaders() {
		logger.info("Inside controller, method: getHeaders(), class: AknGatewayController ");
		logger.info("HTTP headers :"+httpRequest.getHeader("auth"));
		return new ResponseEntity<Object>("Success", HttpStatus.OK);
	}
	

}
