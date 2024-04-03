package com.Technosignia.LearningManagementSystem.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Technosignia.LearningManagementSystem.studentDao.DepartmentRepository;
import com.Technosignia.LearningManagementSystem.studentEntity.DepartmentEntity;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository deptRepository;
	
	public DepartmentEntity addDepartment(@RequestBody DepartmentEntity dept) {
		return deptRepository.save(dept);
	}
	public DepartmentEntity getDatabyID(@PathVariable Long id) {
		return deptRepository.findById(id).get();
	}
	public List<DepartmentEntity> getalldata(DepartmentEntity deptdata){
		List<DepartmentEntity> Depts=(List<DepartmentEntity>) deptRepository.findAll();
		return Depts;
	}
	public void deleteDeptData(@PathVariable Long id) {
		deptRepository.deleteById(id);
	}
	public String deleteAllDept(DepartmentEntity dept) {
		deptRepository.deleteAll();
		return "All_data_deleted";
	}
	

}
