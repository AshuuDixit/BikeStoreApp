package com.bike.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	 static Connection con;
	public static Connection createC()
	{
		try
		{
			//loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/bikestore";
			String username="root";
			String password="root";
			
			 con=DriverManager.getConnection(url,username,password);
			
		

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return con;

}
}
