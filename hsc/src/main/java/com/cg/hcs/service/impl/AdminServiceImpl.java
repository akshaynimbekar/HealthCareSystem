package com.cg.hcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.repository.DiagnosticCenterRepository;
import com.cg.hcs.repository.TestRepository;
import com.cg.hcs.service.AdminService;
import io.swagger.v3.oas.annotations.servers.Server;


@Service 
public class AdminServiceImpl implements AdminService {
//	@Autowired
//	AdminRepository adminRepository;
	
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRespository;
	
	@Autowired
	TestRepository testRepository;
	
//	@Autowired
//	AppointmentRepository appointmentRepository;

	@Override
	public String addCenter(DiagnosticCenter center) {
		diagnosticCenterRespository.save(center);
		return "Center added successfully";
	}

	public boolean removeCenter(DiagnosticCenter center) {
		diagnosticCenterRespository.delete(center);
		return true;
	}

	public String addTest(Test test) {
		testRepository.save(test);
		return "Test added successfully";
	}

	public boolean removeTest(Test test) throws ServiceException{
		testRepository.delete(test);
		return false;
	}

	public boolean approveAppointment() throws ServiceException {
		return false;
	}

}



