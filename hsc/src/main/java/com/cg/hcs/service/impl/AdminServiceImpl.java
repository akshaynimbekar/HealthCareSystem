package com.cg.hcs.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.MedicalTest;
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

	@Override
	public List<DiagnosticCenter> getAllCenters() {
		return diagnosticCenterRespository.findAll();
	}

	public boolean removeCenter(Long center_id) {
		diagnosticCenterRespository.deleteById(center_id);
		return true;
	}

	public String addTest(MedicalTest medicalTest) {
		testRepository.save(medicalTest);
		return "Test added successfully";
	}

	public boolean removeTest(Integer test) throws ServiceException{
		testRepository.deleteById(test);
		return false;
	}

	public boolean approveAppointment() throws ServiceException {
		return true;
	}
	//update the center by ADMIN
		@Override	
		public DiagnosticCenter updateCenter(DiagnosticCenter updatedCenter){
			diagnosticCenterRespository.save(updatedCenter);
			//AdminRepository.save(updatedCenter);
			return updatedCenter;
		}
		//update the MedicalTest by ADMIN
		@Override	
		public MedicalTest updateTest(MedicalTest updatedTest){
			testRepository.save(updatedTest);
			//AdminRepository.save(updatedCenter);
			return updatedTest;
		}

}



