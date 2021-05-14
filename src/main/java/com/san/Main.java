package com.san;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.san.service.HttpClientService;

@SpringBootApplication
public class Main {

	static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Main.class, args);
		ctx.getBean(HttpClientService.class).getData();
		logger.info("Application started.");
	}

}
