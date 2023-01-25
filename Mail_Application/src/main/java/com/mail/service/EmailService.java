package com.mail.service;

import com.mail.dto.EmailDTO;
import com.mail.exception.EmailException;
import com.mail.exception.UserException;
import com.mail.model.Email;

public interface EmailService {

	
	public Email sendMail(EmailDTO emailDTO,Integer userId) throws EmailException,UserException;
	
	public Email starMail(Integer emailId,Integer userId) throws EmailException,UserException;

	public String deleteMail(Integer emailId,Integer userId) throws EmailException,UserException;
	
	
}
