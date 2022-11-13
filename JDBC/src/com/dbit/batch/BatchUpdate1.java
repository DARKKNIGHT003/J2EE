package com.dbit.batch;

import java.sql.*;
public class BatchUpdate1 {
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	Statement st = con.createStatement();
	//st.addBatch("select * from employees");
	st.addBatch("insert into employees values(3,'Benedictcumberbatch',60000,'USA')");
	st.addBatch("update employees set esal=esal+1000 where esal<50000");
	st.addBatch("delete from employees where esal>500000");
	int[] count=st.executeBatch();
	int updateCount=0;
	for(int x: count)
	{
		updateCount=updateCount+x;
	}
	System.out.println("The number of rows updated :"+updateCount);
	con.close();
		
}

}