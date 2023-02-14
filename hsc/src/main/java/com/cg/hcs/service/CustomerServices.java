package com.cg.hcs.service;


import com.cg.hcs.exceptions.ServiceException;

import java.util.List;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.MedicalTest;

public interface CustomerServices {
	List<DiagnosticCenter> getAllCenters();
	List<MedicalTest> getAllTest();
	String makeAppointment(Appointment appointment) throws ServiceException;
	//String makeAppointment(User Roles, DiagnosticCenter center, MedicalTest medicalTest, LocalDateTime datetime) throws ServiceException;
	//String register(User Roles) throws ServiceException;
}
