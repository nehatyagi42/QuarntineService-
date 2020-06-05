package com.quarntine.config;

import java.util.List;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.quarntine.model.Doctor;
import com.quarntine.service.DoctorService;

@Path("doctorinfo")
public class DoctorResource {

	@Autowired
	DoctorService doctorServiceobj;

	@GET
	public List<Doctor> getDoctor() {
		return doctorServiceobj.getAllDoctors();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Doctor getdoctor(@PathParam("id") int id) {
		return doctorServiceobj.getDoctorById(id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Doctor saveDoctor(Doctor doctor) {
		return doctorServiceobj.addDoctor(doctor);
	}

	@PUT
	@Path("{id}")
	public Doctor updateDoctor(@PathParam("id") int id, Doctor doctor) {	
		return doctorServiceobj.updateDoctor(id, doctor);
	}

	@DELETE
	@Path("/{id}")
	public Doctor removeDoctor(@PathParam("id") int id) {
		return doctorServiceobj.deleteDoctor(id);
	}

}
