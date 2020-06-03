package com.quarntine.config;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.quarntine.service.DoctorService;

@Path("myresource")
public class MyResource {
	 @Autowired
	 DoctorService doctorServiceobj;
	 
	 @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getIt() {
	        return doctorServiceobj.getStringTest();
	    }
	 
}
