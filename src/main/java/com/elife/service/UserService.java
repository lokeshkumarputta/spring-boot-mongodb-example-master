package com.elife.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elife.converters.UserDataToUsersConverter;
import com.elife.documents.Users;
import com.elife.models.UserData;
import com.elife.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDataToUsersConverter converter;	
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(UserData userData) {
 		Users users  = converter.convert(userData);
		userRepository.save(users);
	}
	
	public List<Users> showAllUsers(){
		List<Users> users = new ArrayList<Users>();
		for(Users user : userRepository.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
	public void deleteMyUser(int id) {
		userRepository.delete(id);
	}
	
	public Users editUser(int id) {
		return userRepository.findOne(id);
	}
	
	/*public Users findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}*/
	
	}

	