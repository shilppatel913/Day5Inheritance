package com.masai.app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gender")
public class Gender {
	
	@Id
	private int id;
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "gender")
	private List<Person> persons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Gender(int id, String type, List<Person> persons) {
		super();
		this.id = id;
		this.type = type;
		this.persons = persons;
	}

	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gender [id=" + id + ", type=" + type + ", persons=" + persons + "]";
	}
	
	
}
