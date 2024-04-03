package com.Techno.LearningManagementSystem2.StudentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Techno.LearningManagementSystem2.StudentEntity.StudentEntity;
import com.Techno.LearningManagementSystem2.StudentRepository.StudentRespository;

@Service
public class StudentService {
	@Autowired
	StudentRespository studentRespository;
	
	public StudentEntity CreateStudentdata(StudentEntity studententity) {
		return studentRespository.save(studententity);
	}

}
