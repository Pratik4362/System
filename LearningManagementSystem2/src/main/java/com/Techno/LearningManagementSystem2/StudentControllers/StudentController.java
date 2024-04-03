package com.Techno.LearningManagementSystem2.StudentControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Techno.LearningManagementSystem2.StudentEntity.StudentEntity;
import com.Techno.LearningManagementSystem2.StudentServices.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/student")
	public StudentEntity CreateStudent(@RequestBody StudentEntity studententity ) {
		return studentservice.CreateStudentdata(studententity);
	}
}
