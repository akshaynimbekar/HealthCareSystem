package com.cg.hcs.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.hcs.entity.DiagnosticCenter;
import com.cg.hcs.entity.MedicalTest;

import org.junit.jupiter.api.DisplayName;
//import com.cg.hcs.entity.Test;
import org.junit.jupiter.api.Test;
import com.cg.hcs.exceptions.ServiceException;
import com.cg.hcs.repository.AdminRepository;
import com.cg.hcs.repository.DiagnosticCenterRepository;
import com.cg.hcs.repository.TestRepository;

@ExtendWith(MockitoExtension.class)
public class AdminServiceTest {
	
	@Mock
	private AdminRepository adminRepository;
	
	@Mock
	private DiagnosticCenterRepository diagnosticCenterRepository;
	
	@Mock
	private TestRepository testRepository;
	
	@InjectMocks
	AdminServiceImpl adminServiceImpl;
	
	@Test
	@DisplayName("Add center")
	void addCenter() {
		DiagnosticCenter center = createCenterMockData();
		when(diagnosticCenterRepository.save(center)).thenReturn(center);
		String response =adminServiceImpl.addCenter(center);
		assertEquals(response, "Center added successfully");
	}
	
	private DiagnosticCenter createCenterMockData() {
		// TODO Auto-generated method stub
		DiagnosticCenter center=new DiagnosticCenter();
		center.setCenterName("Mumbai");
		center.setCenterId(101L);
		return null;
	}

	@Test
	@DisplayName("Remove center")
	void removeCenter() {
		Long centerId=101L;
		doNothing().when(diagnosticCenterRepository).deleteById(centerId);
		boolean response = adminServiceImpl.removeCenter(centerId);
		assertEquals(response, true);
	}
	@Test
	@DisplayName("Add Test")
	void addTest() {
		MedicalTest test=createTestMockData();
		when(testRepository.save(test)).thenReturn(test);	
		String response=adminServiceImpl.addTest(test);
		assertEquals(response, "Test added successfully");
		
	}

	private com.cg.hcs.entity.MedicalTest createTestMockData() {
		// TODO Auto-generated method stub
		MedicalTest test = new MedicalTest();
		test.setTestName("ECG");
		test.setTestId(101);
		return null;
	}

	@Test
	@DisplayName("Remove Test")
	void removeTest() throws ServiceException {
		int testId=101;
		doNothing().when(testRepository).deleteById(testId);
		boolean response = adminServiceImpl.removeTest(testId);
		assertEquals(response, false);
		
	}
	@Test
	@DisplayName("Approve Appointment")
	void approveAppointment() {
		
	}
	
	@Test
	@DisplayName("Get All Center")
	void getAllCenters() {
		List<DiagnosticCenter> centers =new ArrayList<>();
		centers.add(createCenterMockData());
		when(diagnosticCenterRepository.findAll()).thenReturn(centers);
		List<DiagnosticCenter> allCenters = adminServiceImpl.getAllCenters();
		
		
	}
	
}

