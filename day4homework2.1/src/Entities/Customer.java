package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private int   dateOfBirthInYear;
	private String nationalityId;
	
	public Customer( String firstName, String lastName, int dateOfBirthInYear, String nationalityId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthInYear = dateOfBirthInYear;
		this.nationalityId = nationalityId;
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

	public int getDateOfBirth() {
		return dateOfBirthInYear;
	}

	public void setDateOfBirth(int dateOfBirthInYear) {
		this.dateOfBirthInYear = dateOfBirthInYear;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
