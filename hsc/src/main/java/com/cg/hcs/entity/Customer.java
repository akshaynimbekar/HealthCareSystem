package com.cg.hcs.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "customer")
public class Customer {
//user class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;
	
	//  Mapping required
//	@NotBlank(message = "Center Name is required")
//	@Column(name = "center_id")
//	private List<DiagnosticCenter> centerList;
	
	@NotBlank(message = "password is required")
	@Column(name = "customer_password")
	private String customerPassword;
	
	@NotBlank(message = "User Name is required")
	@Column(name = "customer_name")
	private String ucustomerName;

	
	@Email(message = "Email must be lxxxx@xxx.xxx")
	@NotBlank(message = "Email is required")
	@Column(name = "customer_email")
	private String customerEmailId;
	

	
	
}
