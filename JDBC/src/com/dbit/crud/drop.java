package com.dbit.crud;
import java.sql.*;

public class drop {

	public static void main(String[] args)throws Exception
	{
		String jdbc_url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pwd="root";
		String sql_query="drop table employees";
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table deleted successfully..!");
		con.close();
	}

}