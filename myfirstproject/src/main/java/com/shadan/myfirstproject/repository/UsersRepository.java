package com.shadan.myfirstproject.repository;
//extend JpaRepository to provide CRUD operations for User entity

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shadan.myfirstproject.model.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users, Long>  {
	
	 Page<Users> findByNameContaining(String name, Pageable pageable);
	
	
	
	
		

}
