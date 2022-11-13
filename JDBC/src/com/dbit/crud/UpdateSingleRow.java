package com.dbit.crud;
import java.sql.*;
public class UpdateSingleRow
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	String sql_query="update employees set esal=70000 where ename='Yash'";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	Statement st = con.createStatement();
	int updateCount=st.executeUpdate(sql_query);
	System.out.println("The number of rows updated :"+updateCount);
	con.close();
		
}

}