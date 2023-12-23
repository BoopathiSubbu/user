package com.annauniv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.annauniv.dao.StudentRepository;
import com.annauniv.model.StudentDetails;

@Service
public class StudentServiceImpl implements StudentService{
	
@Autowired
private StudentRepository stuRepository;
	
	public int addStudent(StudentDetails studentDetails) {
		StudentDetails stud=stuRepository.save(studentDetails);
		return stud.getsId();
	}

	@Override
	public List<StudentDetails> getStudentDetails() {
		List<StudentDetails> stu=new ArrayList<StudentDetails>();
		stuRepository.findAll().forEach(data->stu.add(data));
		return stu;
	}

}
