package com.masai.app.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	
	//a person can have only one type of gender and gender can be associated with multiple students
		@ManyToOne(cascade = CascadeType.ALL)
		private Gender gender;
		
		//a student can have only one address but an address can belong to multiple students
		@ManyToOne(cascade = CascadeType.ALL)
		private Address address;

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

		public LocalDate getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public Person(int id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthDate = birthDate;
			this.gender = gender;
			this.address = address;
		}

		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
					+ birthDate + ", gender=" + gender + ", address=" + address + "]";
		}
		
		
}
