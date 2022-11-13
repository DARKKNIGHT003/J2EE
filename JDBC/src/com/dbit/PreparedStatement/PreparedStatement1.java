package com.dbit.PreparedStatement;

import java.sql.*;
public class PreparedStatement1 
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	String sqlQuery ="delete from employees where ename=?";
	PreparedStatement pst = con.prepareStatement(sqlQuery);
	pst.setString(1,"suman");
	int updateCount=pst.executeUpdate();
	System.out.println("The number of rows deleted :"+updateCount);
	System.out.println("Reusing PreparedStatement to delete one more record...");
	pst.setString(1,"Manoj_VS");
	int updateCount1=pst.executeUpdate();
	System.out.println("The number of rows deleted :"+updateCount1);
	con.close();
		
}

}
