package com.altimetrik;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="new")
//(collection = "studentdata")
public class Customer {

	public Customer(int id, String firstName, String lastName) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Id
	private int id;

	private String firstName;
	private String lastName;

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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Object getUserSettings() {
		// TODO Auto-generated method stub
		return null;
	}
}
