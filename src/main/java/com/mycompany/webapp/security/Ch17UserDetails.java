package com.mycompany.webapp.security;

import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class Ch17UserDetails extends User {
	private String memail;
	private String mname;
	
	public Ch17UserDetails(
			String mid, 
			String mname,
			String mpassword, 
			boolean menabled, 
			List<GrantedAuthority> mauthorities,
			String memail) {
		super(mid, mpassword, menabled, true, true, true, mauthorities);
		this.mname = mname;
		this.memail = memail;
	}

	public String getMemail() {
		return memail;
	}

	public String getMname() {
		// TODO Auto-generated method stub
		return mname;
	}

}

