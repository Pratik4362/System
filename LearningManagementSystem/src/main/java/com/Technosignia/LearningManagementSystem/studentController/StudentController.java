package com.Technosignia.LearningManagementSystem.studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.LearningManagementSystem.studentEntity.StudentEntity;
import com.Technosignia.LearningManagementSystem.studentService.StudentService;
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/student")
	public StudentEntity createStudent(@RequestBody StudentEntity student) {
		return studentService.createStudent(student);
	}
	@GetMapping("/get/{id}")
	public StudentEntity abc(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}
	@GetMapping("/getall")
	public List<StudentEntity> getallData1(StudentEntity data){
		return studentService.getalldata(data);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentEntity(id);
		return "data_deleted_sucessfully";
	}
	@DeleteMapping("/deleteAll")
	public String deleteall() {
		studentService.deleteAlldata();
		return "data_deleted";
	}
	@PutMapping("/update/{id}")
	public StudentEntity updateSEntity(@RequestBody StudentEntity s,@PathVariable Long id){
		return studentService.updateStudent(s, id);
		
	}
	
	
}
