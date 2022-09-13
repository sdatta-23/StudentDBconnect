package com.DBconnect.studentData.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DBconnect.studentData.model.Students;

@Repository
public interface StudentRepository extends  CrudRepository<Students, Long>{

	List<Students> findAll();
	
	Optional<Students> findById(Long Id);
	
	@Query("SELECT students FROM Students students "
			+ "where students.fname= :fname")
	Students findByFname(String fname);
	
	@Query("SELECT students FROM Students students "
			+ "where students.lname= :lname")
	Students findByLname(String lname);
	
}
