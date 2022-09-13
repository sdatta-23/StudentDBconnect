package com.DBconnect.studentData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DBconnect.studentData.dto.StudentsDTO;
import com.DBconnect.studentData.model.Students;
import com.DBconnect.studentData.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	@Autowired	
	StudentService studentService; 



	@GetMapping("/getAllStudents")
	public List<Students> getStudents()
	{
		return  studentService.getStudents();

	}

	@GetMapping("/getStudentsById/{id}")
	public Optional<Students> getStudents(@PathVariable Long id)
	{
		return  studentService.getStudentById(id);

	}

	@PostMapping("/updateStudents")
	public String updateStudents(@RequestBody List<StudentsDTO> studentsDTO)
	{
		return  studentService.updateStudents(studentsDTO);
	}
	
	@PostMapping("/updateSingleStudent")
	public  String updateSingleStudent(@RequestBody StudentsDTO singlestudentDTO)
	{
		return studentService.updateSingleStudent(singlestudentDTO);
	}


	 
//	public void run(String...args) throws Exception{
//		String sql= "SELECT * FROM STUDENTS";
//
//	}

}
