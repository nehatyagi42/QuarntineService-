package com.quarntine.dao;



import java.util.List;

import com.quarntine.model.Doctor;


public interface DoctorDao {
	String getStringTest();
	Doctor addDoctor(Doctor doctor);
	Doctor deleteDoctor(int id);
	Doctor getDoctorById(int id);
	List<Doctor> getAllDoctors();
	Doctor updateDoctor(int id, Doctor doctor);

	
	
	
	/*private Map<String, Doctor> doctormap;

	public DoctorDao() {
		doctormap = new HashMap<String, Doctor>();
		Doctor doctor1 = new Doctor("Neha", "neha@gmail.com", "MBBS", "Delhi");
		Doctor doctor2 = new Doctor("mahi", "neha@gmail.com", "MBBS", "Haryana");
		Doctor doctor3 = new Doctor("rinku", "neha@gmail.com", "BMS", "Delhi");

		doctormap.put(doctor1.getName(), doctor1);
		doctormap.put(doctor2.getName(), doctor2);
		doctormap.put(doctor3.getName(), doctor3);
	}

	public Doctor getDoctor(String Name) {
		return doctormap.get(Name);
	}

	public Doctor addDoctor(Doctor doctor) {
		doctormap.put(doctor.getName(), doctor);
		return doctor;
	}

	public Doctor updateDoctor(Doctor doctor) {
		doctormap.put(doctor.getName(), doctor);
		return doctor;
	}

	public void deleteDoctor(String Name) {
		doctormap.remove(Name);
	}

	public List<Doctor> getAllDoctors() {
		Collection<Doctor> collection = doctormap.values();
		List<Doctor> list = new ArrayList<Doctor>();
		list.addAll(collection);
		return list;
	}

	List<Doctor> list;*/

}
