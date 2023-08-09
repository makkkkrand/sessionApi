package com.medSoft.app.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medSoft.app.models.Session;
import com.medSoft.app.repository.SessionRepository;
import com.medSoft.app.services.SessionService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SessionServiceImpl implements SessionService {
	@Autowired
	SessionRepository repo;

	@Override
	public String saveSession(Session session) {
		Session output = repo.save(session);
		log.info("Saved Session:{}", output);
		return null != output ? "Pass" : "Fail";
	}

	@Override
	public List<Session> findAllSession() {
		return repo.findAll();
	}

	@Override
	public String modifySession(Session session, String id) {
		session.setId(id);
		Session output = repo.save(session);
		log.info("Modified Session", output.getId());
		return null != output ? "Pass" : "Fail";
	}

	@Override
	public Session findSession(String id) {
		Optional<Session> output = repo.findById(id);
		log.info("Fetched Session", output.isPresent() ? output.get() : null);
		return output.isPresent() ? output.get() : null;
	}
}