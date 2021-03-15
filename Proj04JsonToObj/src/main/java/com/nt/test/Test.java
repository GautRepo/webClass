package com.nt.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Employee;

public class Test {

	public static void main(String[] args) {
		
	
		String json = "{\"uid\":10,\"uname\":\"gautam\",\"usal\":150.0}";
		try {
			ObjectMapper om = new ObjectMapper();
			Employee emp=om.readValue(json, Employee.class);
			System.out.println(emp);
			System.out.println(json);
			
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
