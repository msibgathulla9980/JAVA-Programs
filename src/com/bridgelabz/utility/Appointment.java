package com.bridgelabz.utility;
import java.util.ArrayList;
import java.util.List;

public class Appointment {
	private String name;
	
	private List<Patient> listOfPatients = new ArrayList<Patient>();
	
	public String getName() {
		return name;
	}

	public void setName(String docName) {
		this.name = docName;
	}

	
	public List<Patient> getListOfPatients() {
		return listOfPatients;
	}
	
	public void setListOfPatients(List<Patient> listOfPatients) {
		this.listOfPatients = listOfPatients;
	}
	


}


