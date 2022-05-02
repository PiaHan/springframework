package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;


@Controller
@RequestMapping("/ch13")
//@Log4j2
public class ch13Controller {
	private static final Logger logger = LoggerFactory.getLogger(ch13Controller.class);
	
	public ch13Controller() {
		logger.info("실행");
	}
	
	@RequestMapping("/content")
	public String content() {
		
		logger.info("실행");
		//log.info("실행.");
		return "ch13/content";
	}

}
