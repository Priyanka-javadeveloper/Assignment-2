package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ResultSet {
	static	String url="jdbc:mysql://localhost:3306/Emp";
	static	String username="root";
	static String password="";
public static void main(String[] args) {
	try {
		Connection conn = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = conn.prepareStatement("select * from employee");
		java.sql.ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int id1= rs.getInt("id");
			String ename = rs.getString("ename");
			System.out.println(id1+ename);
		}
}catch(Exception e) {
	e.printStackTrace();
}
	//conn.close();
}
}