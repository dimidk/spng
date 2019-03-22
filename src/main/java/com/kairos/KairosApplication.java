package com.kairos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class KairosApplication {
	
	@Autowired
	private KairosRest kairos;
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(KairosApplication.class, args);
	}

	public void run(String...args) throws Exception {
	
		logger.info(">Calling Kairos");
		
		Kairos resRest=kairos.getTheUrl();
		logger.info("kairos Rest called");
		logger.info("<Ending Kairos");
	}
}
