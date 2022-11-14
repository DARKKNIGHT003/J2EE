package com.tns.spdicol;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	 private String name;
	 private List<String> Phones;
	 private Set<String> Addresses;
	 private Map<String, String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return Phones;
	}
	public void setPhones(List<String> phones) {
		Phones = phones;
	}
	public Set<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<String> addresses) {
		Addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		Phones = phones;
		Addresses = addresses;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}	 
	 
	 
}


