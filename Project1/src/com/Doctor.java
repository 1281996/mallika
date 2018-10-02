package com;

public class Doctor {
	int id;
	String name;
	String specialization;
	int getId()
	{
      return id;
	}
	void setId(int id) {
		this.id=id;
		
	}
	String getName()
	{
      return name;
	}
	void setName(String name) {
		this.name=name;
		
	}
	
	String getSpecialization()
	{
      return specialization;
	}
	void setSpecialization(String specialization) {
		this.specialization=specialization;
		
	}
	Doctor(int id,String name,String specialization)
	{
		 
		id=getId();
		name=getName();
		specialization=getSpecialization();
	}
}
