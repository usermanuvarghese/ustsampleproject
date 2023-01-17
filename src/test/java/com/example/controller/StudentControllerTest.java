package com.example.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.model.Student;

@SpringBootTest
class StudentControllerTest {
	
	@Autowired
	private StudentController studentController;

	@Test
	void getStudentTest() {
		Student student = new Student();
		student.setStudentId("1001");
		student.setFirstName("Manu");
		student.setLastname("varghese");
		student.setCourseName("Computer Science");
		assertEquals("Success",studentController.addStudent(student));
	}
	
	

}
