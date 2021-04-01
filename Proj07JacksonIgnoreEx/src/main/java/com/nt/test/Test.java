package com.nt.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.User;

public class Test {

	public static void main(String[] args) {
		try {
			
			User usr = new User();
			usr.setUid(1);
			usr.setUname("SAMPLE");
			usr.setUpwd("abc");
			usr.setUrole("admin");
			
			ObjectMapper om = new ObjectMapper();
			
			String json = om.writeValueAsString(usr);
			
			System.out.println(json);
			om.writeValue(new File("E:/testing.json"), usr);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
