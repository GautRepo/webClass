package com.nt.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.nt.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Unmarshaller um=context.createUnmarshaller();
			
			Student std = (Student)um.unmarshal(new File("E:/time.xml"));
			
			System.out.println(std);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public static void main1(String[] args) {
		try {
			
			Student std = new Student();
			std.setStdId(1);
			std.setSname("Gautam");
			std.setStdFee(5000.0);
			
			JAXBContext context = JAXBContext.newInstance(Student.class);
			
			Marshaller m =context.createMarshaller();
			System.out.println(m.getClass().getName());
			
			m.marshal(std, new File("E:/time.xml"));
			
			System.out.println("Done");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
