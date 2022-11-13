package com.dbit.clbl;

import java.io.*;
import java.sql.*;
public class retrieve 
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	
	PreparedStatement ps = con.prepareStatement("select * from bl");
	ResultSet rs =ps.executeQuery();
	
	FileOutputStream os = new FileOutputStream("dcvillian.jpg");
	if(rs.next())
	{
		String name=rs.getString(1);
		InputStream is = rs.getBinaryStream(2);
		byte[] buffer = new byte[2048];
		while(is.read(buffer)>0)
		{
			os.write(buffer);
		}
		os.flush();
		System.out.println("image is available in :tomnnjerry.jpg");
	}
		con.close();
}

	
		
}