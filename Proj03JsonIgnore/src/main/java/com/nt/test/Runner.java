package com.nt.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.User;

public class Runner {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.setUid(1);
		user.setUname("Gautam");
		user.setRole("Admin");
		user.setUpwd("1234");
		
		
		try {
			ObjectMapper om = new ObjectMapper();
			String json=om.writeValueAsString(user);
			System.out.println(json);
			
			
			om.writeValue(new File("E:/user.json"),user);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
