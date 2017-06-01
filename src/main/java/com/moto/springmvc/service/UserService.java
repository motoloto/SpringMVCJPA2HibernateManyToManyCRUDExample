package com.moto.springmvc.service;

import java.util.List;

import com.moto.springmvc.model.User;


public interface UserService {
	
	User findById(Long id);
	
	User findBySSO(String sso);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserBySSO(String sso);

	List<User> findAllUsers(); 
	
	boolean isUserSSOUnique(Long id, String sso);

	boolean isUserExist(User user);

	void deleteAllUsers();
}