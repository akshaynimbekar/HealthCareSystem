package com.cg.hcs.service;

import java.time.LocalDateTime;

import com.cg.hcs.entity.Test;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.entity.Customer;
import com.cg.hcs.entity.DiagnosticCenter;

public interface CustomerServices {
	String makeAppointment(Customer user, DiagnosticCenter center, Test test, LocalDateTime datetime) throws ServiceException;
	String register(Customer user) throws ServiceException;
}
