package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Student;

@Controller
@ResponseBody
public class StudentController 
{
	@GetMapping("/student")
	public Student getStudent() {
	Student student1=new Student(101,"Kanchan","Vairal");
    return student1;
}
	
	@GetMapping("/studentList")
	public List<Student> getStudents()
	{
		List<Student>studentList=new ArrayList();
		Student student1=new Student(105,"Priyanka","Shinde");
		Student student2=new Student(106,"Rachana","Vare");
		Student student3=new Student(107,"Payal","Phapale");
		Student student4=new Student(108,"Kishori","Bhalerao");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		return studentList;
		
	}
	
	
}
