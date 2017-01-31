package com.bootcampjava.electricityservice.models.fileprocessor;


/**
 * @author Jagan Reddy
 * Customer entity class
 */
public class Customer {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	private Service serviceInfo;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Service getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(Service serviceInfo) {
		this.serviceInfo = serviceInfo;
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
}
