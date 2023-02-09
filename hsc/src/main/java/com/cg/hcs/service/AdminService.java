package com.cg.hcs.service;


import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.exceptions.ServiceException;


public interface AdminService {
	String addCenter(DiagnosticCenter center) throws ServiceException;
	boolean removeCenter(DiagnosticCenter center) throws ServiceException;
	String addTest(Test test) throws ServiceException;
	boolean removeTest(Test test) throws ServiceException;
	boolean approveAppointment() throws ServiceException;
	
	
}
