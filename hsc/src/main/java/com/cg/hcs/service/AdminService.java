package com.cg.hcs.service;


import com.cg.hcs.controller.Test;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.exceptions.serviceException;


public interface AdminService {
	String addCenter(DiagnosticCenter center) throws serviceException;
	boolean removeCenter(DiagnosticCenter center) throws serviceException;
	String addTest(Test test) throws serviceException;
	boolean removeTest(Test test) throws serviceException;
	boolean approveAppointment() throws serviceException;
}
