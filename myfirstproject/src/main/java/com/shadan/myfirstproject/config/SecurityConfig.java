package com.shadan.myfirstproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
	@EnableWebSecurity
	public class SecurityConfig {

	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            // 1. Disable CSRF for stateless REST APIs
	            .csrf(csrf -> csrf.disable()) 
	            
	            // 2. Configure endpoint permissions
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/api/**").permitAll() // Public endpoints
	                .anyRequest().authenticated()                  // Secured endpoints
	            )
	            .httpBasic(Customizer.withDefaults()); // Or your JWT filter config

	        return http.build();
	    }
	}

