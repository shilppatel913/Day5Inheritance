package com.masai.app.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends Person {

	@Id
	private int id;
	boolean wantsNewsLetter;
	
	@OneToMany(mappedBy = "student")
	List<Student_Courses> student_courses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isWantsNewsLetter() {
		return wantsNewsLetter;
	}

	public void setWantsNewsLetter(boolean wantsNewsLetter) {
		this.wantsNewsLetter = wantsNewsLetter;
	}

	public List<Student_Courses> getStudent_courses() {
		return student_courses;
	}

	public void setStudent_courses(List<Student_Courses> student_courses) {
		this.student_courses = student_courses;
	}

	public Student(int id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address,
			int id2, boolean wantsNewsLetter, List<Student_Courses> student_courses) {
		super(id, firstName, lastName, birthDate, gender, address);
		id = id2;
		this.wantsNewsLetter = wantsNewsLetter;
		this.student_courses = student_courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String firstName, String lastName, LocalDate birthDate, Gender gender, Address address) {
		super(id, firstName, lastName, birthDate, gender, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", wantsNewsLetter=" + wantsNewsLetter + ", student_courses=" + student_courses
				+ "]";
	}
	
	
}
