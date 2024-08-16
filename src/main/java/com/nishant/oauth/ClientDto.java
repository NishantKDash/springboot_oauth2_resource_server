package com.nishant.oauth;

import java.time.Instant;


public class ClientDto {
	
 
	private String clientId;
	private Instant clientIdIssuedAt;
	private String clientSecret;
	private Instant clientSecretExpiresAt;
	private String clientName;
	private String clientAuthenticationMethods;
	private String authorizationGrantTypes;
	private String redirectUris;
	private String postLogoutRedirectUris;
	private String scopes;
	private String clientSettings;
	private String tokenSettings;
	
	
	
	public ClientDto()
	{}
	
	
 
	public ClientDto(String clientId, Instant clientIdIssuedAt, String clientSecret,
			Instant clientSecretExpiresAt, String clientName, String clientAuthenticationMethods,
			String authorizationGrantTypes, String redirectUris, String postLogoutRedirectUris, String scopes,
			String clientSettings, String tokenSettings) {
		super();
		this.clientId = clientId;
		this.clientIdIssuedAt = clientIdIssuedAt;
		this.clientSecret = clientSecret;
		this.clientSecretExpiresAt = clientSecretExpiresAt;
		this.clientName = clientName;
		this.clientAuthenticationMethods = clientAuthenticationMethods;
		this.authorizationGrantTypes = authorizationGrantTypes;
		this.redirectUris = redirectUris;
		this.postLogoutRedirectUris = postLogoutRedirectUris;
		this.scopes = scopes;
		this.clientSettings = clientSettings;
		this.tokenSettings = tokenSettings;
		
		
		
	}




	public String getClientId() {
		return clientId;
	}



	public void setClientId(String clientId) {
		this.clientId = clientId;
	}



	public Instant getClientIdIssuedAt() {
		return clientIdIssuedAt;
	}



	public void setClientIdIssuedAt(Instant clientIdIssuedAt) {
		this.clientIdIssuedAt = clientIdIssuedAt;
	}



	public String getClientSecret() {
		return clientSecret;
	}



	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}



	public Instant getClientSecretExpiresAt() {
		return clientSecretExpiresAt;
	}



	public void setClientSecretExpiresAt(Instant clientSecretExpiresAt) {
		this.clientSecretExpiresAt = clientSecretExpiresAt;
	}



	public String getClientName() {
		return clientName;
	}



	public void setClientName(String clientName) {
		this.clientName = clientName;
	}



	public String getClientAuthenticationMethods() {
		return clientAuthenticationMethods;
	}



	public void setClientAuthenticationMethods(String clientAuthenticationMethods) {
		this.clientAuthenticationMethods = clientAuthenticationMethods;
	}



	public String getAuthorizationGrantTypes() {
		return authorizationGrantTypes;
	}



	public void setAuthorizationGrantTypes(String authorizationGrantTypes) {
		this.authorizationGrantTypes = authorizationGrantTypes;
	}



	public String getRedirectUris() {
		return redirectUris;
	}



	public void setRedirectUris(String redirectUris) {
		this.redirectUris = redirectUris;
	}



	public String getPostLogoutRedirectUris() {
		return postLogoutRedirectUris;
	}



	public void setPostLogoutRedirectUris(String postLogoutRedirectUris) {
		this.postLogoutRedirectUris = postLogoutRedirectUris;
	}



	public String getScopes() {
		return scopes;
	}



	public void setScopes(String scopes) {
		this.scopes = scopes;
	}



	public String getClientSettings() {
		return clientSettings;
	}



	public void setClientSettings(String clientSettings) {
		this.clientSettings = clientSettings;
	}



	public String getTokenSettings() {
		return tokenSettings;
	}



	public void setTokenSettings(String tokenSettings) {
		this.tokenSettings = tokenSettings;
	}
}
