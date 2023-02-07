package com.cg.hcs.dto;

import java.time.LocalDateTime;

public class Appointment {
//Appointment CLASS
	
	private User user;
	private int appointmentId;
	private Test test;
	private  LocalDateTime datetime;
	private boolean approved;
	private DiagnosticCenter dc;
	public DiagnosticCenter getDc() {
		return dc;
	}
	public void setDc(DiagnosticCenter dc) {
		this.dc = dc;
	}
	public Appointment() {
		super();
	}
	public Appointment(User user, int appointmentId, Test test, LocalDateTime datetime, boolean approved, DiagnosticCenter dc) {
		super();
		this.user = user;
		this.appointmentId = appointmentId;
		this.test = test;
		this.datetime = datetime;
		this.approved = approved;
		this.dc=dc;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int id) {
		this.appointmentId = id;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	@Override
	public String toString() {
		return "Appointment [user=" + user + ", appointmentId=" + appointmentId + ", test=" + test + ", datetime="
				+ datetime + ", approved=" + approved + ", dc=" + dc + "]";
	}
	
	
}
