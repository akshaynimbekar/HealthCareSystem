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
	private String customerId;
	
	//  Mapping required
//	@NotBlank(message = "Name is required")
//	@Column(name = "STUDENT_NAME")
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
	
	//private HashMap<User> userList;
	
	
}