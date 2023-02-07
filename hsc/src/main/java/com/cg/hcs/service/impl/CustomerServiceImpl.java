package com.cg.hcs.service.impl;
import java.time.LocalDateTime;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cg.hcs.connect.JDBCConnect;
import com.cg.hcs.controller.Test;
import com.cg.hcs.dto.Appointment;
import com.cg.hcs.dto.DiagnosticCenter;
import com.cg.hcs.dto.User;
import com.cg.hcs.exceptions.serviceException;
import com.cg.hcs.service.AdminService;

public class CustomerServiceImpl {
	public String makeAppointment(User user, DiagnosticCenter center, Test test, LocalDateTime datetime) throws serviceException{
		//booking an appointment
		try {
			JDBCConnect jd=new JDBCConnect();
			Connection con=jd.getConnection();
			String username=user.getUserName();
			int centerId=center.getCenterId();
			int testId=test.getTestId();
			LocalDateTime dt=datetime.now();
			AdminServiceImpl as=new AdminServiceImpl();
			boolean canBeBooked=as.approveAppointment();
			if(canBeBooked) {
				PreparedStatement ps=con.prepareStatement("insert into appointment () values()");
				ps.setInt(1,user.getUserId());
				ps.executeUpdate();
				ResultSet rs=ps.getGeneratedKeys();
				rs.next();
				int id=rs.getInt(1);
				Appointment ap=new Appointment();
				ap.setAppointmentId(id);
				rs.close();
				ps.close();
				con.close();
				
			}
			
			
		} catch (Exception e) {
			throw new serviceException(e.getMessage());
		}
		
		
		
		return "Appointment booked successfully";
	}
}
