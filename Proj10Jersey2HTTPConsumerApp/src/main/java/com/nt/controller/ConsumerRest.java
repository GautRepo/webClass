package com.nt.controller;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ConsumerRest {

	public static void main(String[] args) {
		String uri="http://localhost:7070/Proj09JerseyHTTPMethod/";
		String path= "/rest/emp";
		
		try {
			Client c =ClientBuilder.newClient();
			
			WebTarget wt = c.target(uri).path(path);
			
			Invocation.Builder builder = wt.request();
			
			Response res = builder.delete();
			
			System.out.println(res.getStatus());
			System.out.println(res.getStatusInfo());
			System.out.println(res.readEntity(String.class));
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
