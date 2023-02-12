package com.cg.hcs.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.repository.AdminTest;
import com.cg.hcs.service.impl.AdminServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AdminServiceImplTest {
	@Mock
	private AdminTest adminTest;
	@Mock
	private DiagnosticCenter center;
	
	private AdminServiceImpl adminServiceImpl; 
	
	@Test
	void addCenter()
	{
		
	}
	void getAllCenters() {
		
	}
	void removeCenter() {
		
	}
	void addTest() {
		
	}
	void removeTest() {
		
	}
	void approveAppointment() {
		
	}
	

}
