package com.cg.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.MedicalTest;
//import com.cg.hcs.entity.Test;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.service.AdminService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired
	AdminService adminService;
	
	//post mapping for Adding Center
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@Validated
	@PostMapping("/center")
	public String addCenter(@RequestBody DiagnosticCenter center) {
		try {
			return adminService.addCenter(center);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}

	// To Show All available Centers 
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@GetMapping("/center")
	public List<DiagnosticCenter> getAllCenters(){		
		return adminService.getAllCenters();
	}
	
	// To Show All available All Appointment
		@SecurityRequirement(name = "Bearer Authentication")
		@PreAuthorize(value = "hasRole('ROLE_ADMIN')")
		@GetMapping("/availableAppointment")
		public List<Appointment> getAllAppointment() {
			return adminService.getAllAppointment();
		}	
	
	//delete center by center_id 
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@DeleteMapping("/center/{center_id}")
	public boolean removeCenter(@PathVariable("center_id") Long center_id) {
		try {
			return adminService.removeCenter(center_id);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	
	// ADDING Test 
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@Validated
	@PostMapping("/test")
	public String addTest(@RequestBody @Valid MedicalTest medicalTest) {
		try {
			adminService.addTest(medicalTest);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	//Show test by providing Id
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@DeleteMapping("/test/{test_id}")
	public boolean removeTest(@PathVariable("test_id") Integer test_id) {
		try {
			return adminService.removeTest(test_id);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	//update the center by ADMIN
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@Validated
	@PutMapping("/center")
	public DiagnosticCenter updateCenter(@RequestBody DiagnosticCenter updatedCenter) {
		try {
			return adminService.updateCenter(updatedCenter);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updatedCenter;
		
	}
	
	//update the test by ADMIN
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@Validated
	@PutMapping("/test")
	public MedicalTest updateTest(@RequestBody MedicalTest updatedTest) {
		try {
			return adminService.updateTest(updatedTest);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updatedTest;
		
	}
	
	//Approve Appointment
	@SecurityRequirement(name = "Bearer Authentication")
	@PreAuthorize(value = "hasRole('ROLE_ADMIN')")	
	@Validated
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
