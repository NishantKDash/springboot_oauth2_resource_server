package com.nishant.oauth;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@PostMapping("/client")
	public void addClient(@RequestBody ClientDto clientDto)
	{
		RegisteredClient oidcClient = RegisteredClient.withId(UUID.randomUUID().toString())
		.clientId("oidc-client")
		.clientSecret("{noop}secret")
		.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
		.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
		.authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
		.redirectUri("https://oauth.pstmn.io/v1/callback")
		.postLogoutRedirectUri("http://127.0.0.1:8080/")
		.scope(OidcScopes.OPENID)
		.scope(OidcScopes.PROFILE)
		.clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build())
		.build();
		
		System.out.println(oidcClient.getClientSettings());
		Client client = new Client();
		client.setClientId(clientDto.getClientId());
		client.setClientSecret(passwordEncoder.encode(clientDto.getClientSecret()));
		client.setClientAuthenticationMethods(clientDto.getClientAuthenticationMethods());
		client.setAuthorizationGrantTypes(clientDto.getAuthorizationGrantTypes());
		client.setRedirectUris(clientDto.getRedirectUris());
		client.setPostLogoutRedirectUris(clientDto.getPostLogoutRedirectUris());
		client.setScopes(clientDto.getScopes());
		client.setClientSettings(clientDto.getClientSettings());
		client.setClientIdIssuedAt(clientDto.getClientIdIssuedAt());
		client.setClientName(clientDto.getClientName());
		client.setClientSecretExpiresAt(clientDto.getClientSecretExpiresAt());
		client.setTokenSettings(clientDto.getTokenSettings());
        clientRepository.save(client);    
	}

}
