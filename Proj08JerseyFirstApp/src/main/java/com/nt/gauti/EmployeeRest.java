package com.nt.gauti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeRest {
	
	@GET
	@Path("/msg")
	public String getMsg() {
		return "This is my first App";
	}

}
