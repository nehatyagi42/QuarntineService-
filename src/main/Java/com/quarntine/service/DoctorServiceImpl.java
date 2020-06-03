package com.quarntine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quarntine.dao.DoctorDao;
import com.quarntine.model.Doctor;

public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorDao doctorDaoObj;
	
	
	@Override
	public String getStringTest() {
		
		return doctorDaoObj.getStringTest();
	}
	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorDaoObj.addDoctor(doctor);
	}


	@Override
	public Doctor deleteDoctor(int id) {
		return doctorDaoObj.deleteDoctor(id);
	}

	@Override
	public Doctor getDoctorById(int id) {
		return doctorDaoObj.getDoctorById(id);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorDaoObj.getAllDoctors();
	}
	@Override
	public Doctor updateDoctor(int id, Doctor doctor) {
		
		return doctorDaoObj.updateDoctor(id, doctor);
	}






}
