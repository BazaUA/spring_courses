package bazalytskyi.practice4.data.dao;

import org.springframework.transaction.annotation.Transactional;

import bazalytskyi.practice4.data.entities.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);

	Teacher getTeacherById(int id);

	void saveTacher(Teacher teacher);

}
