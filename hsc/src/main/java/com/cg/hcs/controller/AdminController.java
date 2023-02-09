package com.cg.hcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
//import com.cg.hcs.entity.Test;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.service.AdminService;

public class AdminController {
//	$$------1-------->
//	Add DiagnosticCenter-->
//	Update DiagnosticCenter-->
//	Delete DiagnosticCenter 
//	
//	$$------2-------->
//	Add Test-->
//	Update Test-->
//	Delete Test
	
	@Autowired
	AdminService adminService;

	@PostMapping("/center")
	public String addCenter(DiagnosticCenter center) {
		try {
			return adminService.addCenter(center);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@DeleteMapping("/center")
	public boolean removeCenter(DiagnosticCenter center) {
		try {
			return adminService.removeCenter(center);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	@PostMapping("/test")
	public String addTest(Test test) {
		try {
			adminService.addTest(test);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@DeleteMapping("/test")
	public boolean removeTest(Test test) {
		try {
			return adminService.removeTest(test);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@PostMapping("/appointment")
	public boolean approveAppointment() {
		try {
			return adminService.approveAppointment();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}
