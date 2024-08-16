package com.nishant.oauth;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class CustomGrantedAuthority implements GrantedAuthority{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String authority;
	
	public CustomGrantedAuthority()
	{
		
	}
	public CustomGrantedAuthority(Role role)
	{
		this.authority = role.name();
	}

	

	@Override
	public String getAuthority() {
	 return authority;
	}

}
