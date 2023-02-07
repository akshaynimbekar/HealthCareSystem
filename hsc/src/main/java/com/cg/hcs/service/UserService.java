package com.cg.hcs.service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import com.cg.hcs.controller.Test;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.User;


public interface UserService {
	String addCenter(DiagnosticCenter center);
	boolean removeCenter(DiagnosticCenter center);
	String addTest(Test test);
	boolean removeTest(Test test);
	boolean approveAppointment();
	String makeAppointment(User user, DiagnosticCenter center, Test test, LocalDateTime datetime);
	String register(User user);
	
}
