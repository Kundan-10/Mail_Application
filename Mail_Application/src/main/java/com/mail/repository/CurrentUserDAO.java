package com.mail.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mail.model.CurrentUserSession;

@Repository
public interface CurrentUserDAO extends JpaRepository<CurrentUserSession, Integer>{


	public CurrentUserSession findByUuid(String uuid);

}
