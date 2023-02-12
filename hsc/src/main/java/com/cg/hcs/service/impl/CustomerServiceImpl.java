package com.cg.hcs.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
//import com.cg.hcs.entity.Test;
import com.cg.hcs.entity.Customer;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.repository.AppointmentRepository;
import com.cg.hcs.repository.CustomerRepository;
import com.cg.hcs.repository.DiagnosticCenterRepository;
import com.cg.hcs.repository.TestRepository;
//import com.cg.hcs.repository.TestRepository;
import com.cg.hcs.service.CustomerServices;

@Service
public class CustomerServiceImpl implements CustomerServices{
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRespository;
	
//	@Autowired
//	TestRepository testRepository;
	
	@Override
	public String makeAppointment(Customer user, DiagnosticCenter center,Test test, LocalDateTime datetime)
			throws ServiceException {
		// TODO Auto-generated method stub
//		customerRepository.save(user);
//		diagnosticCenterRespository.save(center);
//		testRepository.save(test);
//		//appointmentRepository.save(datetime);
		
		
		
		return "Appointment Made";
	}

	@Override
	public String register(Customer user) throws ServiceException {
		// TODO Auto-generated method stub
		customerRepository.save(user);
		return "User Registered";
	}
}


