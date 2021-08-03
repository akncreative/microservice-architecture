package com.akn.service.common.log;

import org.slf4j.LoggerFactory;

public class AknLogFactory {
	
	public static AknLogger getLogger(Class<?> clazz) {
		return new AknLogger(LoggerFactory.getLogger(clazz));
	}
	
	public static AknLogger getLogger(Class<?> clazz, String eventName, String eventId) {
		return new AknLogger(LoggerFactory.getLogger(clazz), eventName, eventId);
	}
	
	public static AknLogger getLogger(Class<?> clazz, String eventName, long eventId) {
		return new AknLogger(LoggerFactory.getLogger(clazz), eventName, String.valueOf(eventId));
	}

}
