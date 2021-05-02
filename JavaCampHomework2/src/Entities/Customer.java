package Entities;


import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity {
	private int ID;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityID;
	
	public Customer() {
		
	}

	public Customer(int iD, String firstName, String lastName, Date dateOfBirth, String nationalityID) {
		
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityID = nationalityID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}
	
}
