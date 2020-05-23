package com.quarntine.restjson;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/quarntine/doctordetails")
public class JsonService {
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Doctor getDoctorById(@PathParam("param") String id) {	
		Doctor doctor =new Doctor();
		doctor.setAddress("Delhi");
		doctor.setDesignation("GynoSpecialist");
		doctor.setEmail("neha@gmail.com");
		doctor.setName("Neha Tyagi");
		return doctor;
		}
		
@POST   
	
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createDoctorInJSON(Doctor doctor) {

		String result = "Doctor Data saved : " + doctor;
		System.out.println(result);
		return Response.status(201).entity(result).build();
	}
	
	
}

