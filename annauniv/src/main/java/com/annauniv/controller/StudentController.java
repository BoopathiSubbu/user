package com.annauniv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.annauniv.model.StudentDetails;
import com.annauniv.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studService;
	
	@RequestMapping("/")
	public String display()
	{
		return"index";
	}
	
	@PostMapping("/save")
	public String addDetails(StudentDetails studentDetails) {
		studService.addStudent(studentDetails);
		return "redirect:/students/getStdentId";
	}

	@RequestMapping("/getalldata")
	public String getalldata(Model mode){
		List<StudentDetails> listad=studService.getStudentDetails();
		mode.addAttribute("datas", listad);
		return "index";
		
	}
	
	@RequestMapping("/getStdentId")
	public String getStudeentId(StudentDetails studentDetails,Model mode){
		int stud=studService.addStudent(studentDetails);
		System.out.println(stud);
		mode.addAttribute("data", stud);
		return "view";
	}
	
	@GetMapping("/addstudent")
	private String addStudents(Model model) {
		StudentDetails student= new StudentDetails();
		model.addAttribute("register", student);
		return "addstudent";
	}
	
	
	
	

}
