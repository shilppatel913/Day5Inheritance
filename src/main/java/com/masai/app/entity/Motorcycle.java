package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "motorcycle")
public class Motorcycle extends Vehicle{
	@Id
	private int id;
	
	boolean sideCar;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSideCar() {
		return sideCar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	public Motorcycle(int id, String licensePlate, Teacher teacher, int id2, boolean sideCar) {
		super(id, licensePlate, teacher);
		id = id2;
		this.sideCar = sideCar;
	}

	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(int id, String licensePlate, Teacher teacher) {
		super(id, licensePlate, teacher);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", sideCar=" + sideCar + "]";
	}
	
	
}
