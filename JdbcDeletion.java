package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDeletion {
	static	String url="jdbc:mysql://localhost:3306/Emp";
	static	String username="root";
	static String password="";
public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = con.prepareStatement("delete employee  where id =? ");
		ps.setInt(5,2);
		int i =ps.executeUpdate();
	     
		
		if(i>0) {
			System.out.println("deleted sucess");
		
		}else {
			System.out.println("delete failed");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
