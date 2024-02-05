package com.jpa.repo;

import com.jpa.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AuthorRepo extends JpaRepository<Author, Long> {
	

	
	
	//	select *from author where first_name= 'smi'
	List<Author> findAllByFirstName(String fn);
	
	//	select *from author where first_name= 'sm'
	List<Author> findAllByFirstNameIgnoreCase(String fn);
	
	//	select *from author where first_name like '%sm%'
	List<Author> findAllByFirstNameContainingIgnoreCase(String fn);
	
	//	select *from author where first_name like 'sm%'
	List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);
	
	//	select *from author where first_name like '%sm'
	List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);
	
	//	select *from author where first_name in ('smi' 'ha' 'coding')
	List<Author> findAllByFirstNameInIgnoreCase(List<String> firstName);
	
	
	@Modifying
	@Transactional
	@Query("update  Author  a set  a.age = :age")
	void updateAuthorsAge(int age);
}
