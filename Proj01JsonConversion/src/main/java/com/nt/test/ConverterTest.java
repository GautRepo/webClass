package com.nt.test;

import java.io.File;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Student;

public class ConverterTest {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setSid(1);
		st.setSname("Gautam");
		st.setWt(80.0f);
		
		ObjectMapper om = new ObjectMapper();
		try {
			//String json = om.writeValueAsString(st);
			
			//System.out.println(json);
			
			om.writeValue(new File("E:/stds.json"), st);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
