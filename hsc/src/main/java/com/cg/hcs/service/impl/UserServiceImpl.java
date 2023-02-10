package com.cg.hcs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.hcs.entity.User;
import com.cg.hcs.repository.UsersRepository;
import com.cg.hcs.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
   
	@Autowired
	private final UsersRepository usersRepository;

   
	@Override
	public User addUser(User user) {
		String encryptedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
		user.setPassword(encryptedPassword);
		return usersRepository.save(user);
	}

	
}
