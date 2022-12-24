package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	private int id;
	String licensePlate;
	
	@OneToOne
	private Teacher teacher;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Vehicle(int id, String licensePlate, Teacher teacher) {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
		this.teacher = teacher;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", licensePlate=" + licensePlate + ", teacher=" + teacher + "]";
	}
	
	
}
