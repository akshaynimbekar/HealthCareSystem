package com.cg.hcs.service;

import java.time.LocalDateTime;

import com.cg.hcs.controller.Test;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.User;
import com.cg.hcs.exceptions.serviceException;

public interface CustomerServices {
	String makeAppointment(User user, DiagnosticCenter center, Test test, LocalDateTime datetime) throws serviceException;
	String register(User user) throws serviceException;
	
}
