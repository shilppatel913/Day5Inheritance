package com.masai.app.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher extends Person{

	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "teacher")
	List<Course> courses;
	
	@OneToOne(mappedBy = "teacher")
	private Vehicle vehicle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Teacher(int id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address,
			int id2, String name, List<Course> courses, Vehicle vehicle) {
		super(id, firstName, lastName, birthDate, gender, address);
		id = id2;
		this.name = name;
		this.courses = courses;
		this.vehicle = vehicle;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address) {
		super(id, firstName, lastName, birthDate, gender, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", courses=" + courses + ", vehicle=" + vehicle + "]";
	}
	
	
}
