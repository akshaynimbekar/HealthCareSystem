package com.cg.hcs.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.hcs.controller.Test;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.User;
import com.cg.hcs.repository.UserRepository;
import com.cg.hcs.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public String addCenter(DiagnosticCenter center) {
		userRepository.save(center.getCenterName());
		return "Center Added Successfully";
	}
	public boolean removeCenter(DiagnosticCenter center) {
		userRepository.delete(center);
		return true;
	}
	public String addTest(Test test) {
		userRepository.save(test);
		return "Test added successfully";
	}
	public boolean removeTest(Test test) {
		userRepository.delete(test);
		return true;
	}
	public boolean approveAppointment() {
		return true;
	}
	public String makeAppointment(User user, DiagnosticCenter center, Test test, LocalDateTime datetime) {
		userRepository.saveAll(null)
	}
}
