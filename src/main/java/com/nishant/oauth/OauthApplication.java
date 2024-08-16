package com.nishant.oauth;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;

@SpringBootApplication
public class OauthApplication implements CommandLineRunner{
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private JpaRegisteredClientRepository jpaRegisteredClientRepository;

	public static void main(String[] args) {
		SpringApplication.run(OauthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//			RegisteredClient oidcClient = RegisteredClient.withId(UUID.randomUUID().toString())
//					.clientName("PostMan Client")
//					.clientId("postman-client")
//					.clientSecret(encoder.encode("secret"))
//					.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//					.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//					.authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
//					.redirectUri("https://oauth.pstmn.io/v1/callback")
//					.postLogoutRedirectUri("http://127.0.0.1:8080/")
//					.scope(OidcScopes.OPENID)
//					.scope(OidcScopes.PROFILE)
//					.clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build())
//					.build();
//			
//			      jpaRegisteredClientRepository.save(oidcClient);
		
	}

}
