package com.arun.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.model.Student;
import com.arun.repo.StudentRepo;
    
@Service
public class StudentServiceImp implements StudentService {
	    @Autowired
       private StudentRepo stdRepo;

		@Override
		public Student saveStudent(Student student) {
			Student student1=stdRepo.save(student);
			return student1;
		}
		
		@Override
		public Student updateStudent(Student student) {
			Student student1=stdRepo.save(student);
			return student1;
		}

		@Override
		public void deleteStudent(Integer stdId) {
			stdRepo.deleteById(stdId);
			
		}

		@Override
		public Student getStudent(Integer stdId) {
			Optional<Student>student=stdRepo.findById(stdId);
			Student studentResponse=student.get();
			return studentResponse;
		}

		@Override
		public List<Student> getAllStudent() {
			List<Student>studentList=stdRepo.findAll();
			return studentList;
		}
}
