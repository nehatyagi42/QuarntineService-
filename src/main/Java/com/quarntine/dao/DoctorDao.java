package com.quarntine.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.quarntine.model.Doctor;

public class DoctorDao {
	 private static final Map<String, Doctor> doctormap = new HashMap<String, Doctor>();
	 
	 static {
	        initDoctor();
	    }

	
	private static void initDoctor() {
		 Doctor doctor1 = new Doctor ("Neha", "neha@gmail.com", "MBBS", "Delhi");
	        Doctor doctor2 = new Doctor("mahi", "neha@gmail.com", "MBBS", "Haryana");
	        Doctor doctor3 = new Doctor("rinku", "neha@gmail.com", "BMS" ,"Delhi");
	        
	        doctormap.put(doctor1.getName(), doctor1);
	        doctormap.put(doctor2.getName(), doctor2);
	        doctormap.put(doctor3.getName(), doctor3);
	}
	  public static  Doctor getDoctor(String Name) {
	        return doctormap.get(Name);
	    }
	 
	    public static  Doctor addDoctor(Doctor doctor) {
	    	doctormap.put(doctor.getName(), doctor);
	        return doctor;
	    }
	 
	    public static  Doctor updateDoctor(Doctor doctor) {
	    	doctormap.put(doctor.getName(), doctor);
	        return doctor;
	    }
	 
	    public  void deleteDoctor(String Name) {
	    	doctormap.remove(Name);
	    }
	 
	    public static List<Doctor> getAllDoctors() {
	        Collection<Doctor> collection = doctormap.values();
	        List<Doctor> list = new ArrayList<Doctor>();
	        list.addAll(collection);
	        return list;
	    }
	     
	    List<Doctor> list;
	 
}
