package com.mycompany.webapp.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mycompany.webapp.dto.ch04Member;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Ch04MemberLoginFormValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		boolean result = ch04Member.class.isAssignableFrom(clazz);
		return result;
	
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		log.info("실행");
		ch04Member member = (ch04Member) target;
		
		if(member.getMid() == null || member.getMid().trim().equals("")) {
			errors.rejectValue("mid", null, "mid는 필수 입력 사항입니다.");
		} else {
			if (member.getMid().length() < 4) {
				errors.rejectValue("mid", null, "mid는 4 글자 이상입니다.");
			} 
		}
		
		if(member.getMpassword() == null || member.getMpassword().trim().equals("")) {
			errors.rejectValue("mpassword", null, "mpassword는 필수 입력 사항입니다.");
		} else {
			if (member.getMpassword().length() < 8) {
				errors.rejectValue("mpassword", null, "mpassword는 8 글자 이상입니다.");
			} 
		}
		
		
		
	}

}
