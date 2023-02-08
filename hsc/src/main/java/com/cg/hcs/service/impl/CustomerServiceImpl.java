package com.cg.hcs.service.impl;

import java.time.LocalDateTime;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.Test;
import com.cg.hcs.entity.Customer;
import com.cg.hcs.exceptions.serviceException;
import com.cg.hcs.service.CustomerServices;

public class CustomerServiceImpl implements CustomerServices{

	@Override
	public String makeAppointment(Customer user, DiagnosticCenter center, Test test, LocalDateTime datetime)
			throws serviceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String register(Customer user) throws serviceException {
		// TODO Auto-generated method stub
		return null;
	}

}
