package bazalytskyi.practice4.worker;

import org.springframework.beans.factory.annotation.Autowired;

import bazalytskyi.practice4.data.dao.StudentsDao;
import bazalytskyi.practice4.data.entities.Student;

public class WorkWithStudents {
	@Autowired
	private StudentsDao studentsDao;

	public void saveStudentToDb(Student student) {
		if ((student != null) && (student.getPib() != null) && (!"".equals(student.getPib()))
				&& (student.getCourse() > 0)) {
			studentsDao.addStudent(student);
			System.out.println("Student have been saved " + student);
		}
	}
}
