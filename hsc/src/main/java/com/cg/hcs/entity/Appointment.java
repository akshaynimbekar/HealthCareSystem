package com.cg.hcs.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "appointment")
public class Appointment implements Serializable{
//Appointment CLASS
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appointment_id")
	private Integer appointmentId;
	
	//@NotBlank(message = "center Id ")
	@Column(name = "center_id")
	private Integer centers_Id;
	
	//@NotBlank(message = "user_Id is required")
//	@OneToOne
//	@JoinColumn(name = "customer_id")
	@Column(name = "customers_id")
	private Long customers_id;
	
	
	//@NotBlank(message = "test_Id is required")
//	@OneToOne
//	@JoinColumn(name = "test_id")
	@Column(name = "MedicalTests_id")
	private Long medicalTests_Id;
	
	//@NotBlank(message = "Date & Time is required")
	@Column(name = "date_time")
	private  LocalDateTime datetime;
	
	
	@Column(name = "appointment_status")
	private boolean approved;
	
	
}
