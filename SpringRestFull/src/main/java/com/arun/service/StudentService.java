package com.arun.service;

import java.util.List;



import com.arun.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);     
	public Student updateStudent(Student student);     // update
	public void deleteStudent(Integer stdId);   // 
	public Student getStudent(Integer stdId);  // 
	public List<Student> getAllStudent();       // 
	
}
