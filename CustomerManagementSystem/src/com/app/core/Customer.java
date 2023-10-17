package com.app.core;

import java.time.LocalDate;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	public static int idGenerator= 0;
	
	
	public Customer( String firstName, String lastName, String email, String password,
			double registrationAmount, LocalDate dob, ServicePlan plan) {
		super();
	
		this.customerId = ++idGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	
	
	public Customer(String email) {
		super();
		this.email=email;
	}
	

	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in customer eq");
		if (o instanceof Customer) {
			Customer anotherEmail = (Customer) o;
			return this.email.equals(anotherEmail.email) ;
		}
		return false;

	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getRegistrationAmount() {
		return registrationAmount;
	}
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public ServicePlan getPlan() {
		return plan;
	}
	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob
				+ ", plan=" + plan + "]";
	}
	
	
	

}
