package com.mycompany.webapp.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mycompany.webapp.dto.ch04Member;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ch04MemberJoinFormValidator implements Validator{

	//유효성 검사가 가능한 객체인지를 조사
	@Override
	public boolean supports(Class<?> clazz) {
		log.info("실행");
		boolean result = ch04Member.class.isAssignableFrom(clazz);
		return result;
	}

	//위가 false 나왔을 때만 실행함
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		log.info("실행");
		ch04Member member = (ch04Member) target;
		
		if(member.getMid() == null || member.getMid().trim().equals("")) {
			errors.rejectValue("mid", "errors.mid.required", "mid는 필수 입력 사항입니다.");
		} else {
			if (member.getMid().length() < 4) {
				errors.rejectValue("mid", "errors.mid.minlength", new Object[] {4}, "mid는 4 글자 이상입니다.");
			} 
		}
		
		if(member.getMpassword() == null || member.getMpassword().trim().equals("")) {
			errors.rejectValue("mpassword", "errors.mpassword.required", "mpassword는 필수 입력 사항입니다.");
		} else {
			if (member.getMpassword().length() < 8) {
				errors.rejectValue("mpassword", "errors.mpassword.minlength", "mpassword는 8 글자 이상입니다.");
			} 
		}
		
		if(member.getMemail() == null || member.getMemail().trim().equals("")) {
			errors.rejectValue("memail", "errors.memail.required", "memail는 필수 입력 사항입니다.");
		} else {
			String regex = "^([\\w-]+(?:\\.[\\w-]+)*)@((?:[\\w-]+\\.)*\\w[\\w-]{0,66})\\.([a-z]{2,6}(?:\\.[a-z]{2})?)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(member.getMemail());
			if(!matcher.matches()) {
				errors.rejectValue("memail", "errors.memail.invalid", "memail은 이메일 형식이 아닙니다.");
			}
		}
		
		
		if(member.getMtel() == null || member.getMtel().trim().equals("")) {
			errors.rejectValue("mtel", "errors.mtel.required", "mtel는 필수 입력 사항입니다.");
		} else {
			String regex = "/^(010|011)-[0-9]{3,4}-[0-9]{4}$/";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(member.getMemail());
			if(!matcher.matches()) {
				errors.rejectValue("mtel", "errors.mtel.invalid", "mtel은 전화번호 형식이 아닙니다.");
			}
		}
		
		
		
	}
	

}
