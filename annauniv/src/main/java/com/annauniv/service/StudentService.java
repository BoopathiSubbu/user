package com.annauniv.service;

import java.util.List;

import com.annauniv.model.StudentDetails;

public interface StudentService {

	public int addStudent(StudentDetails studentDetails);

	public List<StudentDetails> getStudentDetails();
	

}
