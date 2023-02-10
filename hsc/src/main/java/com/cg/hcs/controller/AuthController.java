package com.cg.hcs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hcs.config.JwtUtils;
import com.cg.hcs.entity.LoginRequest;
import com.cg.hcs.entity.LoginResponse;
import com.cg.hcs.service.impl.JpaUserDetailsService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
    private JpaUserDetailsService userDetailsService;


	@Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/authenticate")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginRequest request, HttpServletResponse response) {
        try {
            authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword(),
                            new ArrayList<>()));
            final UserDetails user = userDetailsService.loadUserByUsername(request.getUsername());
            if (user != null) {
                String jwt = jwtUtils.generateToken(user);
                Cookie cookie = new Cookie("jwt", jwt);
                cookie.setMaxAge(7 * 24 * 60 * 60); // expires in 7 days
//                cookie.setSecure(true);
                cookie.setHttpOnly(true);
                cookie.setPath("/"); // Global
                response.addCookie(cookie);
                return ResponseEntity.ok(new LoginResponse(request.getUsername(), jwt));
            }
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }
    }
	
}
