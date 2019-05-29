package com.handson.logging_framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jApi {

	private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jApi.class);

	public static void main(String[] args) {
		LOGGER.info("Hello World!");
	}
}
