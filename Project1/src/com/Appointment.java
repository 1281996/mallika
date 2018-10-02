package com;

public class Appointment {
	static int uniqueID=0;
	int appointmentId;
	int doctorId;
	int patientId;
	Appointment(int doctorId,int patientId){
		uniqueID=uniqueID+1;
		appointmentId=uniqueID;
	}
	int getDoctorId()
	{
      return doctorId;
	}
	void setDoctorId(int doctorId) {
		this.doctorId=doctorId;
		
	}
	
	int getPatientId()
	{
      return patientId;
	}
	void setPatientId(int patientId) {
		this.patientId=patientId;
		
	}
	//public String toString()
	//{
		
	//}
}
