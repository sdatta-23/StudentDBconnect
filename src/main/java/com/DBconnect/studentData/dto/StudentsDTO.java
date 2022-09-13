package com.DBconnect.studentData.dto;

import javax.persistence.Column;


import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentsDTO {
	
	//@NotBlank
	@JsonProperty("studentId")
	private Long studentId;

	@Column(name= "fName")	
	private String fName;
	
	@Column(name= "lName")	
	private String lName;
	
	@Column(name= "age")	
	private Integer age;

	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
