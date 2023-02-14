package com.cg.hcs.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.hcs.entity.User;
import com.cg.hcs.repository.UsersRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private UsersRepository usersRepository;
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	@Test
	@DisplayName("User Added")
	void addUser() {
		User user=createUserMockData();
		when(usersRepository.save(user)).thenReturn(user);
		User response=userServiceImpl.addUser(user);
		assertEquals(response, "User added successfully");
}

	private User createUserMockData() {
		// TODO Auto-generated method stub
		User user=new User();
		user.setFirst_name("Yash");
		user.setLast_name("Jaiswar");
		user.setId(1001L);
		user.setRoles("Admin");
		user.setUsername("YashJaiswar");
		user.setPassword("Temp");
		return null;
	}
}
