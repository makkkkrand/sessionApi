package com.medSoft.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.medSoft.app.models.Session;
import com.medSoft.app.services.SessionService;

@RestController
public class SessionController {
	@Autowired
	SessionService sessionService;

	@PostMapping(value = "/session/save")
	public String storeSession(@RequestBody Session Session, @RequestHeader Map<String, String> header) {
		String saveSession = sessionService.saveSession(Session);
		return saveSession;
	}

	@GetMapping(value = "/session/fetchAll")
	public List<Session> fetchAllSession() {
		List<Session> findAllSession = sessionService.findAllSession();
		return findAllSession;
	}

	@PutMapping(value = "/session/modify/{id}")
	public String modifySession(@RequestBody Session Session, @PathVariable String id) {
		String modifySession = sessionService.modifySession(Session, id);
		return modifySession;
	}

	@GetMapping(value = "/session/fetch/{id}")
	public Session fetchSession(@PathVariable String id) {
		Session findSession = sessionService.findSession(id);
		return findSession;
	}
}