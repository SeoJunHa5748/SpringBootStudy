package com.example.demo.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SiteUserRepository;
import com.example.demo.entity.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SiteUserService {
	
	public final SiteUserRepository siteUserRepository;
	public final PasswordEncoder passwordEncoder;
	
	public SiteUser create(String username, String email, String password) {
		SiteUser user = new SiteUser();
		user.setUsername(username);
		user.setEmail(email);
		
		user.setPassword(passwordEncoder.encode(password));
		this.siteUserRepository.save(user);
		return user;
		
	}
}
