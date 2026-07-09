package com.shadan.myfirstproject.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.shadan.myfirstproject.model.Users;

public interface UsersService {
	
	
	public Users addUser(Users user);
	
	public Users getUserById(Long id);
	
	public Page<Users> getUsers(int page, int size, String sortBy);
	
	public void deleteUserById(Long id);
	
	public Users updateUserRole(Users user);
	
	public void Login(int id, String password);
	
	
	
	

}
