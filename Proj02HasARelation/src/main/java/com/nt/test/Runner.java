package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Address;
import com.nt.model.Employee;

public class Runner {

	public static void main(String[] args) {
		
		Address add = new Address();
		add.setHno("G-123");
		add.setLoc("Bangalore");
		
		Employee emp = new Employee();
		emp.setAddrs(add);
		emp.setEid(1);
		emp.setEname("Gautam");
		
		try {
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(emp);
			System.out.println(json);
			
		}catch(Exception e ) {
			e.printStackTrace();
		}

	}

}
