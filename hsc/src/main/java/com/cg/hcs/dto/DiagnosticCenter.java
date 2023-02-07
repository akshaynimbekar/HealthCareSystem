package com.cg.hcs.dto;

import java.util.List;

public class DiagnosticCenter {
// DIAGNOSTIC CLASS
	private String centerName;
	private int centerId;
	private String address;
	private Integer centerNumber;
	private List<Test> listOfTests;
	private List<Appointment> appointmentList;
	public DiagnosticCenter() {
		super();
	}
	
	public DiagnosticCenter(String centerName, int centerId, String address, int centerNumber,
			List<Test> listOfTests, List<Appointment> appointmentList) {
		super();
		this.centerName = centerName;
		this.centerId = centerId;
		this.address = address;
		this.centerNumber = centerNumber;
		this.listOfTests = listOfTests;
		this.appointmentList = appointmentList;
	}

	public String getCenterName() {
		return centerName;
	}
	public int getCenterNumber() {
		return centerNumber;
	}
	public void setCenterNumber(int centerNumber) {
		this.centerNumber = centerNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public int getCenterId() {
		return centerId;
	}
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	public List<Test> getListOfTests() {
		return listOfTests;
	}
	public void setListOfTests(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [centerName=" + centerName + ", centerId=" + centerId + ", address=" + address
				+ ", centerNumber=" + centerNumber + ", listOfTests=" + listOfTests + ", appointmentList="
				+ appointmentList + "]";
	}
	
	
	
	
}
