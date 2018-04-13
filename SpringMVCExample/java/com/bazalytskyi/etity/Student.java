package com.bazalytskyi.etity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "students")
@NamedQueries({ @NamedQuery(name = Student.getAllStudents, query = "SELECT student FROM Student student"),
		@NamedQuery(name = Student.getStudentByPib, query = "SELECT student FROM Student student WHERE student.pib = :pib"),
		@NamedQuery(name = Student.getStudentsByCourse, query = "SELECT student FROM Student student WHERE student.course = :course") })
public class Student implements Serializable {
	public static final String getAllStudents = "Student.getAllStudents";
	public static final String getStudentByPib = "Student.getStudentByPib";
	public static final String getStudentsByCourse = "Student.getStudentsByCourse";
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int studentId;

	private String pib;
	private int course;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}

}
