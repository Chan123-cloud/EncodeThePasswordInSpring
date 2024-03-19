package com.example.EncodeThePassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

	@Service
	public class ServiceClass {

	    @Autowired
	    
	    private PasswordEncoder passwordEncoder;

	    public void registerUser(User user) {
	    	
	       
	        String encodedPassword = passwordEncoder.encode(user.getPassword());
	        
	        user.setPassword(encodedPassword);

	     
	       
			userRepository.save(user);
	    }
	}


