package com.Technosignia.LearningManagementSystem.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.Technosignia.LearningManagementSystem.studentDao.StudentRespository;
import com.Technosignia.LearningManagementSystem.studentEntity.StudentEntity;

@Service
public class StudentService {
	@Autowired
	StudentRespository studentRepository;
	
	public StudentEntity createStudent(StudentEntity student)
	{
		return studentRepository.save(student);
	}
	
	public StudentEntity getStudentById(@PathVariable Long id) {
		return studentRepository.findById(id).get();
	}
	
	public List<StudentEntity> getalldata(StudentEntity data){
		return studentRepository.findAll();
	}
	public void deleteStudentEntity(@PathVariable Long id) {
	 	 studentRepository.deleteById(id);
	}
	public void deleteAlldata() {
		studentRepository.deleteAll();
	}
	public StudentEntity updateStudent(StudentEntity s, @PathVariable Long id) {
		StudentEntity student=studentRepository.findById(id).get();
		if(s.getName()!=null){
			student.setName(s.getName());
		}
		if(s.getAddress()!=null) {
			student.setAddress(s.getAddress());
		}
		if(s.getContact()!=null) {
			student.setContact(s.getContact());
		}
		if(s.getCourse()!=null) {
			student.setCourse(s.getCourse());
		}
		return studentRepository.save(student);
	}
}