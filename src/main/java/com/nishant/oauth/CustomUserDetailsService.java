package com.nishant.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService{
	
 @Autowired
 private UserRepository userRepository;
 
 @Autowired
 private PasswordEncoder encoder;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	  UserEntity userEntity = userRepository.getByUsername(username);
	  //System.out.println(userEntity.getUsername() + "  " +userEntity.getPassword() + " " + encoder.encode(userEntity.getPassword()));
	  
	  return new CustomUserDetails(userEntity);
	}

}
