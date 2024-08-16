package com.nishant.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntity {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;
   
   private String username;
   private String password;
   @Enumerated(EnumType.ORDINAL)
   private Role role;
   
   
   
public UserEntity() {
	super();
}
public UserEntity(long id, String username, String password, Role role) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.role = role;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
   
   
   
}
