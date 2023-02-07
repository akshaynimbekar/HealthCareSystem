package com.cg.hcs.service.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.hcs.connect.JDBCConnect;
import com.cg.hcs.controller.Test;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.User;
import com.cg.hcs.exceptions.serviceException;
import com.cg.hcs.repository.AdminRepository;
import com.cg.hcs.service.AdminService;

public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public String addCenter(DiagnosticCenter center) throws serviceException {
		//adding a center to the database
		try {
		JDBCConnect jdbc=new JDBCConnect();
		Connection con=jdbc.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from diagnostic_center where center_name=?");
		ps.setString(1, center.getCenterName());
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			rs.close();
			ps.close();
			con.close();
			throw new serviceException(center.getCenterName()+" already exists");
		}
		rs.close();
		ps.close();
		ps=con.prepareStatement("insert into diagnostic_center (center_name,contact_no,address) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
		ps.setString(1,center.getCenterName());
		ps.setInt(2,center.getCenterNumber());
		ps.setString(3,center.getAddress());
		ps.executeUpdate();
		rs=ps.getGeneratedKeys();
		rs.next();
		int id=rs.getInt(1);
		center.setCenterId(id);
		rs.close();
		ps.close();
		con.close();
		}catch(Exception e) {
			throw new serviceException(e.getMessage());
		}
		//userRepository.save(center.getCenterName());
		return "Center Added Successfully";
	}
	public boolean removeCenter(DiagnosticCenter center) {
		//userRepository.delete(center);
		return true;
	}
	public String addTest(Test test) {
		//userRepository.save(test);
		return "Test added successfully";
	}
	public boolean removeTest(Test test) {
		//userRepository.delete(test);
		return true;
	}
	public boolean approveAppointment() {
		return true;
	}
	public String makeAppointment(User user, DiagnosticCenter center, Test test, LocalDateTime datetime) {
		//userRepository.saveAll(null)
		return "Hello";
	}
	@Override
	public String register(User user) throws serviceException {
		// TODO Auto-generated method stub
		return "Hello2";
	}
}
