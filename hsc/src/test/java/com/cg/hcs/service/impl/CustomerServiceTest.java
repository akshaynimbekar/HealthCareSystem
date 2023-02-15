package com.cg.hcs.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.hcs.entity.Appointment;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.repository.AppointmentRepository;
import com.cg.hcs.repository.CustomerRepository;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {
	
	@Mock
	private CustomerRepository customerRepository;
	@Mock
	private AppointmentRepository appointmentRepository;
	@InjectMocks
	CustomerServiceImpl customerServiceImpl;
	
	@Test
	@DisplayName("Make Appointment")
	void makeAppointment() throws ServiceException {
		Appointment appointment= createAppointmentMockData();
		when(appointmentRepository.save(appointment)).thenReturn(appointment);
		String response=customerServiceImpl.makeAppointment(appointment);
		assertEquals(response,"Appointment Made");
		
	}

	private Appointment createAppointmentMockData() {
		// TODO Auto-generated method stub
		Appointment appointment=new Appointment();
		appointment.setAppointmentId(101);
		appointment.setApproved(false);
		appointment.setCenters_Id(12);
		appointment.setDatetime(null);
		appointment.setMedicalTests_Id(null);
		appointment.setCustomers_id(1l);
		return null;
	}

}
