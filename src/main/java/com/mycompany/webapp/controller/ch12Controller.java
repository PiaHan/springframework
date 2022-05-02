package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;


@Controller
@RequestMapping("/ch12")
//@Log4j2
public class ch12Controller {
	private static final Logger logger = LoggerFactory.getLogger(ch12Controller.class);
	
	@RequestMapping("/content")
	public String content() {
		
		logger.info("실행");
		//log.info("실행.");
		return "ch12/content";
	}
	
	@RequestMapping("/fileList")
	public String fileList() {
		
		logger.info("실행");
		//log.info("실행.");
		return "ch12FileListView";
	}
	
	@RequestMapping("/fileDownload")
	public String fileDownload(@ModelAttribute String fileName, 
			@ModelAttribute("userAgent") @RequestHeader("user=Agent") String userAgent) {
		
		logger.info("실행");
		
		return "ch12FileDownloadView";
	}


}
