package com.cg.hcs.service;
import java.util.List;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.MedicalTest;
import com.cg.hcs.exceptions.ServiceException;


public interface AdminService {
	String addCenter(DiagnosticCenter center) throws ServiceException;
	boolean removeCenter(Long center_id) throws ServiceException;
	String addTest(MedicalTest medicalTest) throws ServiceException;
	boolean removeTest(Integer test) throws ServiceException;
	boolean approveAppointment() throws ServiceException;
	DiagnosticCenter updateCenter(DiagnosticCenter updatedCenter) throws ServiceException;
	MedicalTest updateTest(MedicalTest updatedTest) throws ServiceException;
	List<DiagnosticCenter> getAllCenters();
	List<Appointment> getAllAppointment();

	
}
