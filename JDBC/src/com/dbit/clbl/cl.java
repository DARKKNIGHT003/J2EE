package com.dbit.clbl;

import java.sql.*;
import java.io.*;
public class cl {
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	
	String sqlQuery="insert into cl values(?,?)";
	PreparedStatement ps = con.prepareStatement(sqlQuery);
	ps.setString(1,"jdbc-1");
	
	File f = new File("jdbc-1.txt");
	FileReader fr = new FileReader(f);
	ps.setCharacterStream(2,fr);
	System.out.println("file is inserting from :"+f.getAbsolutePath());
	
	int updateCount=ps.executeUpdate();
	if(updateCount==1)
	{
		System.out.println("Record Inserted");
	}
	else
	{
		System.out.println("Record Not Inserted");
	}
}
	
}

