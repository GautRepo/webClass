package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Address;
import com.nt.model.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			
			Address add = new Address();
			add.setHno("6-A");
			add.setLoc("Patna");
			
			Employee emp = new Employee();
			emp.setEid(1);
			emp.setEname("Gautam");
			emp.setAddr(add);
			
			ObjectMapper om = new ObjectMapper();
			
			String json = om.writeValueAsString(emp);
			
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
