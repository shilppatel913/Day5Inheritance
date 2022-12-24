package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_courses")
public class Student_Courses {

	@Id
	private int id;
	
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private Course course;

}
