package com.quarntine.restjson;


import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



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
		
	
	
	
}

