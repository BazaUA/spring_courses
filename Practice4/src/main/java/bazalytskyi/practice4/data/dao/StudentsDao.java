package bazalytskyi.practice4.data.dao;

import bazalytskyi.practice4.data.entities.Student;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);
}
