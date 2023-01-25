package com.mail.service;

import java.util.List;

import com.mail.exception.EmailException;
import com.mail.exception.UserException;
import com.mail.model.Email;
import com.mail.model.User;

public interface UserService {

	
	public User registerUser(User user)throws UserException;
	public User updateUser(User user) throws UserException;
	
	public List<Email> getAllMail(Integer userId) throws EmailException,UserException;
	
	public List<Email> getAllstar(Integer userId) throws UserException,EmailException;
	
	
}
