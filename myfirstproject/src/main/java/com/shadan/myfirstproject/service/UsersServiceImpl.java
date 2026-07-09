package com.shadan.myfirstproject.service;
	
	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.shadan.myfirstproject.model.Users;
import com.shadan.myfirstproject.repository.UsersRepository;


	@Service
	public class UsersServiceImpl implements UsersService {
		
		@Autowired
		private UsersRepository usersRepository;

		@Override
		public Users addUser(Users user) {
			
		return	usersRepository.save(user);
			// TODO Auto-generated method stub
			
		}

		@Override
		public Users getUserById(Long id) {
			// TODO Auto-generated method stub
			return usersRepository.findById(id).orElse(null);
		}

		@Override
		public Page<Users> getUsers(int page, int size, String sortBy) {
	        // Page index is 0-based
	        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
	        
	        return usersRepository.findAll(pageable);
	        
		}

		@Override
		public void deleteUserById(Long id) {
			// TODO Auto-generated method stub
			
			usersRepository.deleteById(id);
			
		}

		@Override
		public Users updateUserRole(Users user) {
			// TODO Auto-generated method stub
			return usersRepository.save(user);
		}

		@Override
		public void Login(int id, String password) {
			// TODO Auto-generated method stub
			
			
		}

}
