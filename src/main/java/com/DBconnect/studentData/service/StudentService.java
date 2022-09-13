package com.DBconnect.studentData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.DBconnect.studentData.dto.StudentsDTO;
import com.DBconnect.studentData.model.Students;
import com.DBconnect.studentData.repositories.StudentRepository;



@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Students> getStudents()
	{
		List<Students> allStudents = studentRepository.findAll();
		return allStudents;

	}

	public Optional<Students> getStudentById(Long id)
	{
		Optional<Students> student = studentRepository.findById(id);
		//		String firstName= student.get().getFname();
		//		String lastName=student.get().getLname();
		//		String fullName= "Student's Full Name is = "+firstName+ " "+ lastName;

		return student;

	}

	public String updateStudents(List<StudentsDTO> studentsDTO) {

		for(StudentsDTO student : studentsDTO) {

			Students students = new Students();			
			students.setId(student.getStudentId());
			students.setFname(student.getfName());
			students.setLname(student.getlName());
			students.setAge(student.getAge());

			studentRepository.save(students);

		}	
	
		return "Students Table Updated";
	}

	public String updateSingleStudent(StudentsDTO singlestudentDTO) {
		Students students = new Students();			
		students.setId(singlestudentDTO.getStudentId());
		students.setFname(singlestudentDTO.getfName());
		students.setLname(singlestudentDTO.getlName());
		students.setAge(singlestudentDTO.getAge());

		studentRepository.save(students);
		return "Updated single student";
	}

}

