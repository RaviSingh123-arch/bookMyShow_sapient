package com.sapient.bookMyShow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BookMyShowApplication {

	private static Logger logger= LoggerFactory.getLogger(BookMyShowApplication.class);
	public static void main(String[] args) {
		logger.info("Starting Book My Show Application");
		SpringApplication.run(BookMyShowApplication.class, args);
	}

}
