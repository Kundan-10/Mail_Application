package com.mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mail.model.Email;

@Repository
public interface EmailDAO extends JpaRepository<Email, Integer>{

	
	public Email findByEmail(String email);
	
	
}
