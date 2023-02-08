package com.cg.hcs.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
@Entity
@Table(name = "diagnostic_center")
public class DiagnosticCenter implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// DIAGNOSTIC CLASS
	
	@NotBlank(message = "Center Name is required")
	@Column(name = "center_name")
	private String centerName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "center_id")
	private int centerId;

	
	@NotBlank(message = "Tests are required")
	@Column(name = "test_list")
	private List<Test> listOfTests;
	
	// ???????????? foreign key Required ?????????????
//	@NotBlank(message = "Appointments required")
//	@Column(name = "appointment")
//	private List<Appointment> appointmentList;
//	
}
