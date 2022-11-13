package com.dbit.clbl;

import java.sql.*;
import java.io.*;
public class cl2
{
public static void main(String[] args)throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	
	PreparedStatement ps = con.prepareStatement("select * from cl");
	ResultSet rs =ps.executeQuery();
	
	FileWriter fw = new FileWriter("output.txt");
	if(rs.next())
	{
		String name=rs.getString(1);
		Reader r = rs.getCharacterStream(2);
	int i=r.read();
	while(i != -1)
	{
		fw.write(i);
		i = r.read();
	}
	fw.flush();
	System.out.println("Retrieved Successfully file :output.txt");
	}
	con.close();
}
		
}
