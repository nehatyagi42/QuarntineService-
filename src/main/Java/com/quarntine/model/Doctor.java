package com.quarntine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
 @Id
 @Column(name="id")
 private int id;
 
 @Column(name="NAME")
private String Name;

 @Column(name="email")
private String  Email;
 
 @Column(name="designation")
private String Designation;

 @Column(name="address")
private String Address;

/*public Doctor() {
	 
}

public Doctor(String Name, String Email, String Designation,String Address) {
  this.Address=Address;
  this.Designation=Designation;
  this.Email=Email;
  this.Name=Name;
  
}*/


public String getName() {
	return Name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	Name = name;
}



public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getDesignation() {
	return Designation;
}

public void setDesignation(String designation) {
	Designation = designation;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;          
}

@Override
public String toString() {
	return "Doctor [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Designation=" + Designation + ", Address="
			+ Address + "]";
}




}
