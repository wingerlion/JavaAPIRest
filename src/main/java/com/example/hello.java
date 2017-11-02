package com.example;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class hello {

	@GET
	@Path("/get")
	public String sayHello(){
		//"<? xml version = '1.0' ?>" + "<hello> Hi Neel, This is hello from XML </hello> "
		String resource = "yabadu";
		return resource;	
	}
	
	@GET
	@Path("/get2")
	@Produces(MediaType.TEXT_XML)
	public String sayHello2(){
	
		String resource = "<hello>Hi Neel, This is hello from XML</hello> ";
		return resource;	
	}
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "agas0gjqwjqwgqwgqwgj " + msg;

		return Response.status(200).entity(output).build();

	}
	
	
	
}