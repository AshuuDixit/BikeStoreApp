package com.bike.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

public static boolean insertUserToDB( User st)
{
	boolean f=false;
	//jdbc code...
	try {
		Connection con=CP.createC();
		String q="insert into user(user_name,user_mobile,user_email,user_address) values(?,?,?,?)";
		
	//PreparedStatement	
		PreparedStatement pstmt=con.prepareStatement(q);
		
		// set the values of parameters
		pstmt.setString(1,st.getUserName());
		pstmt.setString(2,st.getUserMobile());
		pstmt.setString(3,st.getUserEmail());
		pstmt.setString(4,st.getUserAddress());
		
		//execute
		pstmt.executeUpdate();
		f=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	
	
	
}

public static boolean deleteStudent(int userId) {
	boolean f=false;
	//jdbc code...
	try {
		Connection con=CP.createC();
		String q="delete from user where user_id=?";
		
	//PreparedStatement	
		PreparedStatement pstmt=con.prepareStatement(q);
		
		// set the values of parameters
		pstmt.setInt(1,userId);
		
		
		//execute
		pstmt.executeUpdate();
		f=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	
	
	
}

public static void showAllUser() {
	boolean f=false;
	//jdbc code...
	try {
		Connection con=CP.createC();
		String q="select * from user";
		
	//Statement	
		Statement stmt=con.createStatement();
		
		ResultSet set=stmt.executeQuery(q);
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			String mobile=set.getString(3);
			String email=set.getString(4);
			String address=set.getString(5);
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("Mobile : "+mobile);
			System.out.println("Email : "+email);
			System.out.println("Address : "+address);
			System.out.println("+++++++++++++++++++++++++");
			
		}
		
	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
}

}
