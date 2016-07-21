package com.zensar.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CallableTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		int ch=0;
		//ResultSet rs = null;
		CallableStatement cstm=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@Windows-PC:1521:XE","system", "manager");
			System.out.println("Connection Established!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id of employee whose salary you want to increase");
		ch=sc.nextInt();
		
 		try {
 		    cstm = con.prepareCall("{call UpdatePro(?,?)}");
 		    cstm.setInt(1,ch);
 		    cstm.registerOutParameter(2,4 );
			cstm.execute();
			System.out.println("updated!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
