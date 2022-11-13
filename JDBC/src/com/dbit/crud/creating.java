package com.dbit.crud;

import java.sql.*;
public class creating
{
	
	public static void main(String[] args) throws Exception
	{
		String jdbc_url="jdbc:mysql://localhost:3306/root";
		String user="root";
		String pwd="root";
		String sql_query="create table employees(eno int(5) primary key,ename varchar(20),esal double(10,2),eaddr varchar(20))";
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table Created Successfully");
		con.close();
	}
	
	

}