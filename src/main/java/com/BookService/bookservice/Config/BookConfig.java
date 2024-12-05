package com.BookService.bookservice.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class BookConfig {
	
	
	
	
	public SecurityFilterChain securityfilterchain(HttpSecurity http)
	{
		
		
		http.authorizeRequests().anyRequest().authenticated().and().oauth2ResourceServer().jwt();
		
		return http.build();
	}
	
	

}
