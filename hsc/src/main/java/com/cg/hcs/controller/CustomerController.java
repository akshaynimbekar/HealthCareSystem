package com.cg.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.MedicalTest;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.service.CustomerServices;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	CustomerServices customerServices;

	// To Show All available Centers
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_CUSTOMER')")
	@GetMapping("/availableCenters")
	public List<DiagnosticCenter> getAllCenters() {
		return customerServices.getAllCenters();
	}
	
	// To Show All available All Medical Tests
		@SecurityRequirement(name = "Bearer Authentication")
		@PreAuthorize(value = "hasRole('ROLE_CUSTOMER')")
		@GetMapping("/availableMedicalTests")
		public List<MedicalTest> getAllMedicalTest() {
			return customerServices.getAllTest();
		}
	
	
	// make Appointment
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

}
