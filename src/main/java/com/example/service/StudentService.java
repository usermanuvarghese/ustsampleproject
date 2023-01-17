package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public String addStudent(Student student) {

		studentRepository.save(student);
		return "Success";

	}

	public Student getdetails(String studentId) {
		Optional<Student> studentDetails = studentRepository.findById(studentId);
		if (studentDetails.isPresent())
			return studentDetails.get();
		else
			return null;
	}

	public String deleteStudent(String studentId) {
		studentRepository.deleteById(studentId);
		return "success";
	}

	public List<Student> updateStudent(Student stud) {
		Optional<Student> studentDetails = studentRepository.findById(stud.getStudentId());
		if (studentDetails.isPresent())
			studentRepository.save(stud);
		return studentRepository.findAll();
	}

	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
