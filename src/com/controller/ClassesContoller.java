package com.controller;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.Classes;
import com.service.ClassService;
import com.serviceimpl.ClassServiceImpl;

@Path("/Classes")

public class ClassesContoller {
	
	private ClassService service=new ClassServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Classes createClass(Classes classes) {
		return service.createClass(classes);
		
	}
	
	@Path("/{id}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Classes getClassId(@PathParam("id")int id) {
		return service.getClassId(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Classes> studentALLClass(){
		return service.getAllClass();
	}
	
	@Path("/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeClass(@PathParam("id")int id) {
		service.removeClass(id);
		
	}
	
	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Classes updateClass(Classes classes) {
   
		return service.updateClass(classes);
	}



}
