package com.nt.restController;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeRestController {
	
	@GET
	public String getEmp() {
		return "GET IS CALLED";
	}
	
	@POST
	public String postEmp() {
		return "POST IS CALLED";
	}
	
	@PUT
	public String updateEmp() {
		return "PUT IS CALLED";
	}
	
	@DELETE
	public String deleteEmp() {
		return "DELETE IS CALLED";
	}

}
