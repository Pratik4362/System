package com.Technosignia.LearningManagementSystem.studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.LearningManagementSystem.studentDao.AdminRepository;
import com.Technosignia.LearningManagementSystem.studentEntity.AdminEntity;
import com.Technosignia.LearningManagementSystem.studentService.AdminService;
@RequestMapping("/admin")
@RestController
public class AdminController {
@Autowired
AdminService adminService;

@PostMapping("/saveadmin")
public AdminEntity createAdmin(@RequestBody AdminEntity savedata) {
	return adminService.createadmin(savedata);
}
@GetMapping("/admins/{id}")
public AdminEntity getByid(@PathVariable Long id) {
	return adminService.getAdminbyId(id);
}
@GetMapping("/adminAll")
public List<AdminEntity> getAll(AdminEntity all) {
	return adminService.getAlldata(all);
}
@DeleteMapping("/deleteId/{id}")
public String deletebyId(@PathVariable Long id) {
	return adminService.deletebyid(id);
}
@DeleteMapping("/deleteAll")
public String deleteAll(){
	return adminService.deleteall();	
}
@PutMapping("/update/{id}")
public String updatedata(@RequestBody AdminEntity a,@PathVariable Long id) {
	adminService.updatedata(a, id);
	return "data updated";
}
@PutMapping("/updateAll")
public List<AdminEntity> updateAll(@RequestBody AdminEntity a){
	return adminService.updateAll(a);
}

}
