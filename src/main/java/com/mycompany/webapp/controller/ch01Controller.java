package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ch01Controller {
	private static final Logger logger = LoggerFactory.getLogger(ch01Controller.class);
	
	@RequestMapping("/ch01/content")
	public String content() {
		
		logger.info("실행");
		return "ch01/content";
	}

}
