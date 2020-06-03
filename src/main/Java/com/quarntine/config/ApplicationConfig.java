package com.quarntine.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.quarntine.dao.DoctorDao;
import com.quarntine.dao.DoctorDaoImpl;
import com.quarntine.model.Doctor;

import com.quarntine.service.DoctorService;
import com.quarntine.service.DoctorServiceImpl;

public class ApplicationConfig extends ResourceConfig {

	
	public ApplicationConfig() {
	/*	register(DoctorService.class);
		register(Doctor.class);
		register(DoctorDao.class);
		register(DoctorDaoImpl.class);
		register(DoctorServiceImpl.class);*/
		register(DoctorResource.class);
		register(MyResource.class);
	}
}
