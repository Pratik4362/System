package com.Technosignia.LearningManagementSystem.studentDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.LearningManagementSystem.studentEntity.StudentEntity;
@Repository
public interface StudentRespository extends JpaRepository<StudentEntity, Long> {

}
