package com.cg.hcs.entity;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "admin")
public class Admin {
//user class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private String adminId;

	// Mapping required
//	@NotBlank(message = "Name is required")
//	@Column(name = "STUDENT_NAME")
//	private List<DiagnosticCenter> centerList;

	@NotBlank(message = "password is required")
	@Column(name = "admin_password")
	private String adminPassword;

	@NotBlank(message = "User Name is required")
	@Column(name = "admin_name")
	private String adminName;

	@Email(message = "Email must be lxxxx@xxx.xxx")
	@NotBlank(message = "Email is required")
	@Column(name = "admin_email")
	private String adminEmailId;

	// private HashMap<User> userList;

}
