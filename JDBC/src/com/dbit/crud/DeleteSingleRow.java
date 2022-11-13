package com.dbit.crud;
import java.sql.*;
public class DeleteSingleRow
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	String sqlQuery="delete from employees where ename='yash'";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	Statement st = con.createStatement();
	int updateCount=st.executeUpdate(sqlQuery);
	System.out.println("The number of rows deleted :"+updateCount);
	con.close();	
}

}