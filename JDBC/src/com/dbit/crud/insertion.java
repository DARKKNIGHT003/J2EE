package com.dbit.crud;
import java.sql.*;
public class insertion
{
	public static void main(String[] args) throws Exception
	{
		String jdbc_url="jdbc:mysql://localhost:3306/root";
		String user="root";
		String pwd="root";
		String sql_query="insert into employees values(100,'Yash',10000,'KGF')";
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		int updateCount=st.executeUpdate(sql_query);
		System.out.println("The number of rows inserted :"+updateCount);
		con.close();
		
	}

}
