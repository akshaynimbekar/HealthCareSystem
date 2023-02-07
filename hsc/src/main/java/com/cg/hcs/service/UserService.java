package com.cg.hcs.service;


import java.time.LocalDateTime;
import java.util.List;

import com.cg.hcs.controller.Test;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.User;
import com.cg.hcs.exceptions.serviceException;


public interface UserService {
	String addCenter(DiagnosticCenter center) throws serviceException;
	boolean removeCenter(DiagnosticCenter center) throws serviceException;
	String addTest(Test test) throws serviceException;
	boolean removeTest(Test test) throws serviceException;
	boolean approveAppointment() throws serviceException;
	String makeAppointment(User user, DiagnosticCenter center, Test test, LocalDateTime datetime) throws serviceException;
	String register(User user) throws serviceException;
	
}
