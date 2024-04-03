package com.Technosignia.LearningManagementSystem.studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.LearningManagementSystem.studentEntity.DepartmentEntity;
import com.Technosignia.LearningManagementSystem.studentService.DepartmentService;
@RequestMapping("/department")
@RestController
public class DepartmentController {
	@Autowired
	DepartmentService deptservice;
	
	@PostMapping("/dept")
	public DepartmentEntity deptdata(@RequestBody DepartmentEntity departmentEntity)
	{
		return deptservice.addDepartment(departmentEntity);
	}
	@GetMapping("/get/{id}")
	public DepartmentEntity getDeptData(@PathVariable Long id) {
		return deptservice.getDatabyID(id);
	}
//	@GetMapping("/getAll")
//	public List<DepartmentEntity> getalldata() {
//		return deptservice.getalldata(null);
//	}
	
//	@DeleteMapping("/delete/{id}")
//	public String deletedeptdata(@PathVariable Long id) {
//		 deptservice.deleteDeptData(id);
//		 return "data_deleted";
//	}

}
