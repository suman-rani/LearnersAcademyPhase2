package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/")
public class DisplayController {
	@GET
	public String HelloSubject (){
			
	        System.out.println("This is the Administration Page");		
	    return ("-----------Hello------------ \nTo Learner's Academy Page\nBy Suman Rani");
	}
	
	@PUT
	public String sayHelloPut()
	{
		return ("Thank You for using Learner Academy");
	}

}
