package com.Technosignia.LearningManagementSystem.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Technosignia.LearningManagementSystem.studentDao.AdminRepository;
import com.Technosignia.LearningManagementSystem.studentEntity.AdminEntity;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;

	public AdminEntity createadmin(AdminEntity data) {
		return adminRepository.save(data);
	}

	public AdminEntity getAdminbyId(@PathVariable Long id) {
		return adminRepository.findById(id).get();
	}

	public List<AdminEntity> getAlldata(AdminEntity admin) {
		return adminRepository.findAll();
	}

	public String deletebyid(@PathVariable Long id) {
		 adminRepository.deleteById(id);
		 return "user deleted succefully";
	}
	public String deleteall( ) {
		adminRepository.deleteAll();
		return "all data deleted successfully";
	}
	//update by id
	public AdminEntity updatedata(AdminEntity a,@PathVariable Long id ) {
		AdminEntity admin=adminRepository.findById(id).get();
		if(a.getName()!=null) {
			admin.setName(a.getName());
		}
		if(a.getEmail()!=null) {
			admin.setEmail(a.getEmail());
		}
		return adminRepository.save(admin);
	}
	//update all
	public List<AdminEntity> updateAll(AdminEntity a){
		List<AdminEntity> admins=adminRepository.findAll();
		
		for(AdminEntity admin:admins) {
			if(a.getName() !=null) {
				admin.setName(a.getName());
			}
			if(a.getEmail() !=null) {
				admin.setEmail(a.getEmail());
			}
			
		}
		return adminRepository.saveAll(admins);
	}


}
