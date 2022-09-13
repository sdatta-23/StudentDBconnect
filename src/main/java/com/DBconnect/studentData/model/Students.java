
package com.DBconnect.studentData.model;
import javax.persistence.*;

@Entity
@Table(name="STUDENTS")
public class Students {
	
	@Id
	@Column(name= "STUDENTID")
	private Long id;

	@Column(name= "FNAME")	
	private String fname;
	
	@Column(name= "LNAME")	
	private String lname;
	
	@Column(name= "AGE")	
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


}
