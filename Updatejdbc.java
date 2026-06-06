package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatejdbc {
	static	String url="jdbc:mysql://localhost:3306/Emp";
	static	String username="root";
	static String password="";
	public static void main(String[] args) {
		//update
		String ename="monalisa";
		int id =3;
		
		try {
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = con.prepareStatement("update employee set ename=? where id =? ");
		ps.setString(1, ename);
		ps.setInt(2, id);
		int i =ps.executeUpdate();
	     
		
		if(i>0) {
			System.out.println("updated sucess");
		
		}else {
			System.out.println("update failed");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
