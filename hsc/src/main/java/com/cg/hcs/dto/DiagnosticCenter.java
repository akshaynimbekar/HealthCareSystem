package com.cg.hcs.dto;

import java.util.List;

public class DiagnosticCenter {
// DIAGNOSTIC CLASS
	private String centerName;
	private String centerId;
	private List<Test> listOfTests;
	private List<Appointment> appointmentList;
	public DiagnosticCenter() {
		super();
	}
	public DiagnosticCenter(String centerName, String centerId, List<Test> listOfTests,
			List<Appointment> appointmentList) {
		super();
		this.centerName = centerName;
		this.centerId = centerId;
		this.listOfTests = listOfTests;
		this.appointmentList = appointmentList;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
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
		return "DiagnosticCenter [centerName=" + centerName + ", centerId=" + centerId + ", listOfTests=" + listOfTests
				+ ", appointmentList=" + appointmentList + "]";
	}
	
	
	
	
}
