package com.cg.hcs.controller;
import com.cg.hcs.connect.*;

import java.sql.Connection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hcs.connect.JDBCConnect;

@RestController
public class InitialTest {
		@RequestMapping("/")
		// @ResponseBody
		public String hello() {
			return "Hello!";
		}
		@GetMapping("/J")
		public String con() {
			JDBCConnect jd=new JDBCConnect();
			Connection con=jd.getConnection();
			if(con!=null)return "Connection";
			else return "connection failed";
		}
		
}
