package com;

import java.util.ArrayList;

public class ABCHospitalManagement implements HospitalManagement {

	ArrayList<Appointment> appointments= new ArrayList<Appointment>();

	public int bookAnAppointment(Doctor d,Patient p){
		d.setId(1);
		d.setName("mallika");
		d.setSpecialization("kindy");
		p.setId(1);
		p.setName("thiy");
		p.setDisease("kindy");
		Appointment a1=new Appointment(1, 1);
		return 0;
		
	}

}
