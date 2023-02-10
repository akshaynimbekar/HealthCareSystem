//package com.cg.hcs.connect;
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class JDBCConnect {
//	public Connection getConnection() {
//		Connection con=null;
//		try {
//			Class.forName("org.postgresql.Driver");
//			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/HCS_DB","postgres","7295");
//			Statement stm=con.createStatement();
//			stm.executeUpdate("insert into test(test_id,test_name) values(2)");
//			System.out.println("record inserted");
//		} catch (Exception e) {
//			System.out.println("Connection failed");
//		}
//		return con;
//	}
//}

