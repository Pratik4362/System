package com.Technosignia.LearningManagementSystem.studentEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
//@Table
//@Data
//@NoArgsConstructor
////@AllArgsConstructor
//@Setter
//@Getter
public class DepartmentEntity {
	
	@Id
	@GeneratedValue
	private Long deptId;
	private String deptname;
	private String deptemail;
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptemail() {
		return deptemail;
	}
	public void setDeptemail(String deptemail) {
		this.deptemail = deptemail;
	}
	
}
