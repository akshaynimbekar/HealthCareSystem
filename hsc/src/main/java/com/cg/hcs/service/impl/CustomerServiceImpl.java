package com.cg.hcs.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.MedicalTest;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.repository.AppointmentRepository;
import com.cg.hcs.repository.DiagnosticCenterRepository;
import com.cg.hcs.repository.TestRepository;
import com.cg.hcs.service.CustomerServices;

@Service
public class CustomerServiceImpl implements CustomerServices{
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
//	@Autowired
//	CustomerRepository customerRepository;
	
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRespository;

	@Autowired
	TestRepository testRepository;
	
	@Override
	public List<DiagnosticCenter> getAllCenters() {
		return diagnosticCenterRespository.findAll();
		
	}

	@Override
	public List<MedicalTest> getAllTest() {
		return testRepository.findAll();
	}
	
	@Override
	public String makeAppointment(Appointment appointment) throws ServiceException {
		appointmentRepository.save(appointment);
		return "Appointment Made";
	}

}


