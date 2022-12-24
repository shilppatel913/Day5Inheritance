package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends Vehicle {

	@Id
	private int id;
	 boolean ipg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isIpg() {
		return ipg;
	}
	public void setIpg(boolean ipg) {
		this.ipg = ipg;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", ipg=" + ipg + "]";
	}
	public Car(int id, String licensePlate, Teacher teacher, int id2, boolean ipg) {
		super(id, licensePlate, teacher);
		id = id2;
		this.ipg = ipg;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String licensePlate, Teacher teacher) {
		super(id, licensePlate, teacher);
		// TODO Auto-generated constructor stub
	}
	 
	 
}
