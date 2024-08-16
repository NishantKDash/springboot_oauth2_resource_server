package com.nishant.oauth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class CustomUserDetails implements UserDetails{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserEntity userEntity;
	private String username;
	private String password;
	private Long userId;
	private boolean accountNonExpired = true;
	private boolean accountNonLocked = true;
	private boolean credentialsNonExpired = true;
	private boolean enabled = true;
	private List<CustomGrantedAuthority> authorities;
	
	public CustomUserDetails()
	{
		
	}
	
	
	
	public UserEntity getUserEntity() {
		return userEntity;
	}



	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}



	public CustomUserDetails(UserEntity userEntity)
	{
		this.userEntity = userEntity;
		this.username = userEntity.getUsername();
		this.password = userEntity.getPassword();
		this.userId = userEntity.getId();
		this.authorities = new ArrayList<>();
		authorities.add(new CustomGrantedAuthority(userEntity.getRole()));
	}
	


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	     return authorities;
	}

	@Override
	public String getPassword() {
		return userEntity.getPassword();
	}

	@Override
	public String getUsername() {
		return userEntity.getUsername();
	}
	
	public Long getUserId()
	{
		return this.userId;
	}



	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return this.accountNonExpired;
	}



	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}



	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}



	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
	
	

}
