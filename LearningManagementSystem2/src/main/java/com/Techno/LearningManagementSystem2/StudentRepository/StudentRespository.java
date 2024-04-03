package com.Techno.LearningManagementSystem2.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Techno.LearningManagementSystem2.StudentEntity.StudentEntity;

@Repository
public interface StudentRespository extends JpaRepository<StudentEntity, Long> {

}
