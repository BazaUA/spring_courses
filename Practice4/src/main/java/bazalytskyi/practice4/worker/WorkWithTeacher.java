package bazalytskyi.practice4.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import bazalytskyi.practice4.data.dao.TeachersDao;
import bazalytskyi.practice4.data.entities.Teacher;

@Transactional
public class WorkWithTeacher {
	@Autowired
	private TeachersDao teachersDao;

	public Teacher addTeacher(Teacher teacher) {
		teachersDao.addTeacher(teacher);
		System.out.println("Teacher has been added " + teacher);
		return teacher;
	}

	public Teacher getTeacherById(int id) {
		return teachersDao.getTeacherById(id);
	}

	public void saveTacher(Teacher teacher) {
		teachersDao.saveTacher(teacher);
		System.out.println("Teacher has been saved " + teacher);
	}
}