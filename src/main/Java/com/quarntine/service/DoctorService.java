package com.quarntine.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.quarntine.dao.DoctorDao;
import com.quarntine.model.Doctor;


@Path("/doctordetails")
public class DoctorService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Doctor> getDoctor_JSON() {
        List<Doctor> listOfDoctorinfo = DoctorDao.getAllDoctors();
        return listOfDoctorinfo;
    }
	
	  @GET
	    @Path("/{name}")
	    @Produces({ MediaType.APPLICATION_JSON })
	    public Doctor getDoctor(@PathParam("name") String name) {
	        return DoctorDao.getDoctor(name);
	    }
	
	  // URI:
	    // /contextPath/servletPath/employees
	    @POST
	    @Path("/")
	    @Produces({ MediaType.APPLICATION_JSON })
	    public Doctor addDoctor(Doctor doctor) {
	        return DoctorDao.addDoctor(doctor);
	    }
	    
	    @PUT
	    @Path("/")
	    @Produces({ MediaType.APPLICATION_JSON })
	    public Doctor updateDoctor(Doctor doctor) {
			return DoctorDao.updateDoctor(doctor);
	    }
	    
	    
	    
}
