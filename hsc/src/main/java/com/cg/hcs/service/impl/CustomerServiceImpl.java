package com.cg.hcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.repository.AppointmentRepository;
import com.cg.hcs.service.CustomerServices;

@Service
public class CustomerServiceImpl implements CustomerServices{
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
//	@Autowired
//	CustomerRepository customerRepository;
//	
//	@Autowired
//	DiagnosticCenterRepository diagnosticCenterRespository;
//	
//	@Autowired
//	TestRepository testRepository;
	

	@Override
	public String makeAppointment(Appointment appointment) throws ServiceException {
		appointmentRepository.save(appointment);
		return "Appointment Made";
	}

//	@Override
//	public String register(Customer user) throws ServiceException {
//		// TODO Auto-generated method stub
//		customerRepository.save(user);
//		return "User Registered";
//	}
}


