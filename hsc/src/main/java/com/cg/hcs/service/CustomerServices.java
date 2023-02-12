package com.cg.hcs.service;


import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.entity.Appointment;

public interface CustomerServices {
	String makeAppointment(Appointment appointment) throws ServiceException;
	//String makeAppointment(User Roles, DiagnosticCenter center, MedicalTest medicalTest, LocalDateTime datetime) throws ServiceException;
	//String register(User Roles) throws ServiceException;
}
