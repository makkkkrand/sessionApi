package com.medSoft.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medSoft.app.models.Session;

public interface SessionRepository extends JpaRepository<Session, String> {  } 