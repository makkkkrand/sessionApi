package com.medSoft.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medSoft.app.models.Session;

@Service
public interface SessionService {
	String saveSession(Session session);

	List<Session> findAllSession();

	Session findSession(String id);

	String modifySession(Session session, String id);
}