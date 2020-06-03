package com.quarntine.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.quarntine.model.Doctor;


public class DoctorDaoImpl implements DoctorDao  {
	@Autowired
	  SessionFactory sessionFactory;
	
	
	
	@Override
	public String getStringTest() {
		  String save = "Doctor Information are saved";
		    return save;
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		try {
			session.save(doctor);
			transaction.commit();
			return doctor;
		} catch (Exception e) {
			transaction.rollback();
			return null;
		}
	}

	@Override
	public Doctor deleteDoctor(int id) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		try {
			
			Doctor doctor= session.get(Doctor.class,id);
			session.delete(doctor);
			transaction.commit();
			return doctor;
		} catch (Exception e) {
			transaction.rollback();
			return null;
		}
	}

	@Override
	public Doctor getDoctorById(int id) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		try {
			
			Doctor doctor = session.get(Doctor.class, id);
			transaction.commit();
			session.close();
			return doctor;
		} catch (Exception e) {
			transaction.rollback();
			session.close();
			return null;
		}
	}

	
	@Override
	 public List<Doctor> getAllDoctors() {
		Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    try{
	        Query query = session.createQuery("from doctor");
	        List<Doctor> doctor = query.list();
	        transaction.commit();
	        session.close();
	        return doctor;
	    }catch(Exception e){
	    	transaction.rollback();
	        session.close();
	        return null;
	    }       
	}

	@Override
	public Doctor updateDoctor(int id, Doctor doctorinfo) {
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		try {
			Doctor doctor= doctorinfo;
			doctor.setId(id);
			session.update(doctor);
			transaction.commit();
			return doctor;
		} catch (Exception e) {
			transaction.rollback();
			return null;
		}
	}

	

	

}
