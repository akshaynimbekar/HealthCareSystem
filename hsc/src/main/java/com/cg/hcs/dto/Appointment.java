package com.cg.hcs.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class Appointment {
//Appointment CLASS
	
	private User user;
	private BigInteger appointmentId;
	private Test test;
	private  LocalDateTime datetime;
	private boolean approved;
	public Appointment() {
		super();
	}
	public Appointment(User user, BigInteger appointmentId, Test test, LocalDateTime datetime, boolean approved) {
		super();
		this.user = user;
		this.appointmentId = appointmentId;
		this.test = test;
		this.datetime = datetime;
		this.approved = approved;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BigInteger getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(BigInteger appointmentId) {
		this.appointmentId = appointmentId;
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
				+ datetime + ", approved=" + approved + "]";
	}
	
}
