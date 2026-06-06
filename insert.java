package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
	static	String url="jdbc:mysql://localhost:3306/Emp";
	static	String username="root";
	static String password="";
	public static void main(String[] args) throws SQLException {
		try {
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null) {
			System.out.println("connected to database");
		
		}
		}catch(Exception e) {
		     e.printStackTrace();
	      }
		
		String sql = "insert into Emp values(6,'Sujana')";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = con.prepareStatement(sql);
		int i= ps.executeUpdate(sql);
		if(i>0) {
			System.out.println("success");
		}
		else{
			System.out.println("fail");
		}
	}
}
