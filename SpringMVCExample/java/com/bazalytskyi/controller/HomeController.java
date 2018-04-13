package com.bazalytskyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bazalytskyi.etity.Student;
import com.bazalytskyi.service.StudentsService;

@Controller
public class HomeController {
	public static final int STUDENTS_ON_THE_PAGE = 25;
	@Autowired
	private StudentsService studentsService;

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Model model) {
		Student st = new Student();
		st.setCourse(2);
		st.setPib("Bazalytskyi Vitaliy");
		st.setStudentId(1);
		studentsService.saveStudent(st);
		model.addAttribute("mainText", "Hello World");
		model.addAttribute("studentsList", studentsService.getAllStudents());
		return "home";
	}
}
