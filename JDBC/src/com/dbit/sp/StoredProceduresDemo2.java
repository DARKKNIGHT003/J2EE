package com.dbit.sp;

import java.sql.*;
public class StoredProceduresDemo2
{
public static void main(String[] args)throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	CallableStatement cst=con.prepareCall("{call getSal(?,?)}");
	cst.setInt(1,8);
	cst.registerOutParameter(2,Types.FLOAT);
	cst.execute();
	System.out.println("Salary ..."+cst.getFloat(2));
	con.close();
}

}