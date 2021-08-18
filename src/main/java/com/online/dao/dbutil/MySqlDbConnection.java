package com.online.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {
	//Its is private constructor as no one should create an object
	private static Connection connection;
	private MySqlDbConnection()
	{
		
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		//Step1 Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/online";
		String user="root";
		String password="AmmaNanna@10";
		connection=DriverManager.getConnection(url,user,password);
		return connection;
		
	}
}
