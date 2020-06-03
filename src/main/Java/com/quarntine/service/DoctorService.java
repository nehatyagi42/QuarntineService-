package com.quarntine.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quarntine.dao.DoctorDao;
import com.quarntine.model.Doctor;


public interface DoctorService {
String getStringTest();



Doctor addDoctor(Doctor doctor);
Doctor updateDoctor(int id ,Doctor doctor);
Doctor deleteDoctor(int id);
Doctor getDoctorById(int id);
 public List<Doctor> getAllDoctors();
	
}
