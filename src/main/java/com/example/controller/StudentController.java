package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {

		return studentService.addStudent(student);

	}

	@GetMapping("/getStudent/{Id}")
	public Student getStudentDetails(@PathVariable(name = "Id") String studentId) {
		return studentService.getdetails(studentId);

	}

	@DeleteMapping("/remove/{Id}")
	public String deleteStudent(@PathVariable(name = "Id") String studentId) {
		return studentService.deleteStudent(studentId);
	}

	@PutMapping("/updateStudent")
	public List<Student> updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@GetMapping("/getall")
	private List<Student> getAllStudents() {
		return studentService.getAllStudentDetails();
	}

}
