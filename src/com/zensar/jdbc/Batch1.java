	/* ORACLE DATABASE CONNECTIVITY
			 *Class.forName("oracle.jdbc.driver.OracleDriver");
			 *con=DriverManager.getConnection("jdbc:oracle:thin:@Windows-PC:1521:XE","system", "manager");	*/		
			  
		    /* MYSQL DATABASE CONNECTIVITY
			 Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "upen");*/



package com.zensar.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		ResultSet rs=null;
		//PreparedStatement pstmt = null;

		try {
			con=ConnectionProvider.getConnection();
			smt = con.createStatement();
			con.setAutoCommit(false);

			smt.addBatch("insert into employee values(1234,'rama',8900)");
			smt.addBatch("insert into employee values(1654,'lakshman',5000)");
			smt.addBatch("insert into employee values(1478,'bharat',6450)");
			smt.addBatch("update employee set id=45 where name like 'rama'");
			System.out.println("updation success");
			smt.executeBatch();
			con.commit();
			System.out.println("insertion success!!");
			rs = smt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
				}
			
		}
	
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
