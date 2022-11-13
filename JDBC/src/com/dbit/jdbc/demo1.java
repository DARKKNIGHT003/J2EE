package com.dbit.jdbc;
import java.sql.*;
public class demo1
{
public static void main(String[] args) throws Exception
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","root");
Statement st = con.createStatement();
ResultSet rs= st.executeQuery("select * from employee ");
while(rs.next())
{
System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(2)+"..");
}
con.close();
}
}