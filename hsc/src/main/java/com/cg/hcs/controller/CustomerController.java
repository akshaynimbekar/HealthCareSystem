package com.cg.hcs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.service.CustomerServices;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	CustomerServices customerServices;
	
	//NOT working error 403
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_CUSTOMER')")	
	@PostMapping("/customers/make_appointments")
	public String makeAppointment(@RequestBody Appointment appointment) {
		try {
			return customerServices.makeAppointment(appointment);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//Adding customer
//	@SecurityRequirement(name = "Bearer Authentication")
//	@PreAuthorize(value = "hasRole('ROLE_CUSTOMER')")
//	@PostMapping("/customer")
//	public String register(@RequestBody Customer user){
//		try {
//			return customerServices.register(user);
//		} catch (ServiceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//		
//	}
//	@GetMapping("/center")
//	public List<DiagnosticCenter> getAllCenters(){		
//		return adminService.getAllCenters();
//	}
}


