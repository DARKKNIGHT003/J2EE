package com.dbit.transaction;

import java.sql.*;
import java.util.*;
public class debit
{
public static void main(String[] args)throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	
	Statement st = con.createStatement();
	System.out.println("Data before Transaction");
	System.out.println("-------------------------");
	ResultSet rs =st.executeQuery("select * from account");
	while(rs.next())
	{
		System.out.println(rs.getString(2)+"..."+rs.getInt(3));
	}
	
	System.out.println("Transaction begins...");
	con.setAutoCommit(false);
	st.executeUpdate("update account set balance=balance+100000 where name='Darshan'");
	st.executeUpdate("update account set balance=balance-100000 where name='Appu'");
	System.out.println("Can you please confirm this transaction of 100000....[Yes|No]");
	Scanner sc = new Scanner(System.in);
	String option = sc.next();
	if(option.equalsIgnoreCase("yes"))
	{
		con.commit();
		System.out.println("Transaction Commited");
	}
	else
	{
		con.rollback();
		System.out.println("Transaction Rolled Back");
	}
	
	System.out.println("Data After Transaction");
	System.out.println("-------------------------");
	ResultSet rs1 =st.executeQuery("select * from account");
	while(rs1.next())
	{
		System.out.println(rs1.getString(2)+"..."+rs1.getInt(3));
	}
	con.close();
}

}
