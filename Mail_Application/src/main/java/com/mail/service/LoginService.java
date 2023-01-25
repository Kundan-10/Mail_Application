package com.mail.service;

import com.mail.dto.LoginDTO;
import com.mail.exception.CurrentUserSessionException;
import com.mail.exception.UserException;
import com.mail.model.CurrentUserSession;

public interface LoginService {

	public CurrentUserSession loginUser(LoginDTO login) throws UserException,CurrentUserSessionException;
	public String logoutUser(String key) throws CurrentUserSessionException;
}
