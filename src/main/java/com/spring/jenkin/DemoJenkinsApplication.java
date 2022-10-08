package com.spring.jenkin;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {
	
	static Logger logger=LoggerFactory.getLogger(DemoJenkinsApplication.class )  ;

	@PostConstruct
	public void init()
	{
		logger.info("Applicatioon started....");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
		logger.info("Application Exectuted....");
	}

}
