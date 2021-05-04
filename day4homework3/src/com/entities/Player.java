package com.entities;

public class Player{
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int dateOfBirthInYear;
	
	public Player(int id, String firstName, String lastName, String nationalityId, int dateOfBirthInYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirthInYear = dateOfBirthInYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getDateOfBirthInYear() {
		return dateOfBirthInYear;
	}
	public void setDateOfBirthInYear(int dateOfBirthInYear) {
		this.dateOfBirthInYear = dateOfBirthInYear;
	}
	
	

}
