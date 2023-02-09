package com.cg.hcs.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hcs.entity.Customer;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
//import com.cg.hcs.entity.Test;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.service.CustomerServices;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServices customerServices;
	
	@PostMapping("/customers/appointments")
	public String makeAppointment(Customer user, DiagnosticCenter center,Test test, LocalDateTime datetime) {
		try {
			return customerServices.makeAppointment(user, center,test, datetime);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/customer")
	public String register(Customer user){
		try {
			return customerServices.register(user);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}

//	$$-----3-----
//	--> Register
//	--> Login
//
//	$$-----4-----
//	--> Create/Boom Appointment
//	--> Check Appointment Status
//
//	$$-----5-----
//	--> View Profile 
//	--> Update Profile (change password, email)

