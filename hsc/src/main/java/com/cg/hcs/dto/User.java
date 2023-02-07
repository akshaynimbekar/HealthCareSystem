package com.cg.hcs.dto;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

public class User {
//user class
	private int userId;
	private List<DiagnosticCenter> centerList;
	private String userPassword;
	private String userName;
	private BigInteger contactNo;
	private String userRole;
	private String emailId;
	private int age;
	private String gender;
	//private HashMap<User> userList;
	public User(int userId, List<DiagnosticCenter> centerList, String userPassword, String userName,
			BigInteger contactNo, String userRole, String emailId, int age, String gender) {
		super();
		this.userId = userId;
		this.centerList = centerList;
		this.userPassword = userPassword;
		this.userName = userName;
		this.contactNo = contactNo;
		this.userRole = userRole;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<DiagnosticCenter> getCenterList() {
		return centerList;
	}
	public void setCenterList(List<DiagnosticCenter> centerList) {
		this.centerList = centerList;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public BigInteger getContactNo() {
		return contactNo;
	}
	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", centerList=" + centerList + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", contactNo=" + contactNo + ", userRole=" + userRole + ", emailId="
				+ emailId + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
