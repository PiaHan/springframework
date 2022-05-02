package com.mycompany.webapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Ch04Dto;
import com.mycompany.webapp.dto.ch04Member;
import com.mycompany.webapp.validator.Ch04MemberEmailValidator;
import com.mycompany.webapp.validator.Ch04MemberIdValidator;
import com.mycompany.webapp.validator.Ch04MemberJoinFormValidator;
import com.mycompany.webapp.validator.Ch04MemberLoginFormValidator;
import com.mycompany.webapp.validator.Ch04MemberPasswordValidator;
import com.mycompany.webapp.validator.Ch04MemberTelValidator;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/ch04")
@Log4j2
public class Ch04Controller {
	@RequestMapping("/content")
	public String content() {
		return "ch04/content";
	}
	
	@PostMapping("/method1")
	public String method1(Ch04Dto dto) {
		
		return "ch04/content";
	}
	
	//DTO와 유효성 검사기를 연결
	@InitBinder("ch04Member")
	public void bindCh04MemberJoinFormValidator(WebDataBinder binder) {
		binder.addValidators(
			new Ch04MemberJoinFormValidator(),
			new Ch04MemberIdValidator(),
	        new Ch04MemberPasswordValidator(),
	        new Ch04MemberEmailValidator(),
	        new Ch04MemberTelValidator()
        );
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute("ch04Member") @Valid ch04Member member, Errors errors) {
		//회원 가입 처리
		log.info(member);
		
		//유효성 검사 확인
		if(errors.hasErrors()) {
			return "ch04/content";	
		}
		
		//회원 가입 처리
		
		//홈페이지로 이동
		return "redirect:/";
	}
	
	@InitBinder("loginForm")
	public void bindCh04MemberLoginFormValidator(WebDataBinder binder) {
		binder.setValidator(new Ch04MemberLoginFormValidator());
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("loginForm") @Valid ch04Member member, Errors errors) {
		//회원 가입 처리
		log.info(member);
		
		//유효성 검사 확인
		if(errors.hasErrors()) {
			return "ch04/content";	
		}
		
		//회원 가입 처리
		
		//홈페이지로 이동
		return "redirect:/";
	}

}
