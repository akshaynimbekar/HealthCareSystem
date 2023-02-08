package com.cg.hcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.exceptions.serviceException;
import com.cg.hcs.repository.AdminRepository;
import com.cg.hcs.service.AdminService;

public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Override
	public String addCenter(DiagnosticCenter center) throws serviceException {
		adminRepository.save(center);
		return "Test added successfully";
	}

	public boolean removeCenter(DiagnosticCenter center) {
		adminRepository.delete(center);
		return true;
	}

	public String addTest(Test test) {
		adminRepository.save(test);
		return "Test added successfully";
	}

	public boolean removeTest(Test test) {
		adminRepository.delete(test);
		return true;
	}

	public boolean approveAppointment() {
		return true;
	}

}
