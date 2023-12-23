package com.annauniv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annauniv.model.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{

}
