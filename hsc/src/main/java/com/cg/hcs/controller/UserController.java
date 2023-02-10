package com.cg.hcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hcs.entity.User;
import com.cg.hcs.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {	
	
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) throws Exception {
        return ResponseEntity.ok(userService.addUser(user));
    }

	
}
