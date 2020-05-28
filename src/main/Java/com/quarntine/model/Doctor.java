package com.quarntine.model;


public class Doctor {
	
private String Name;

private String  Email;
private String Designation;

private String Address;

public Doctor() {
	 
}

public Doctor(String Name, String Email, String Designation,String Address) {
  this.Address=Address;
  this.Designation=Designation;
  this.Email=Email;
  this.Name=Name;
  
}


public String getName() {
	return Name;
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
	return "Doctor [Name=" + Name + ", Email=" + Email + ", Designation=" + Designation + ", Address=" + Address + "]";
}


}
