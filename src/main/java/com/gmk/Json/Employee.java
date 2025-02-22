package com.gmk.Json;

public class Employee {

	private String firstName;
	private String lastName;
	private String designation;
	private Integer age;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String designation, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.age = age;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation + ", age="
				+ age + "]";
	}
}
