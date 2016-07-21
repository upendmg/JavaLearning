package com.zensar.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateConnection2 {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		//ResultSet rs = null;
		int count=0;
		int id=0 , sal=0;
		String Name=null;
		String query=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id of employee");
		id=sc.nextInt();
		System.out.println("enter the Name of employee");
		Name=sc.next();
		System.out.println("enter the sal of employee");
		sal=sc.nextInt();
		query="insert into employee values("+id+ ",'" +Name +"'," +sal+")";
			try {
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			/* ORACLE DATABASE CONNECTIVITY
			 *Class.forName("oracle.jdbc.driver.OracleDriver");
			 *con=DriverManager.getConnection("jdbc:oracle:thin:@Windows-PC:1521:XE","system", "manager");	*/		
			  
		    /* MYSQL DATABASE CONNECTIVITY
			 Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "upen");*/
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "upen");
			System.out.println("connected!!!!");
			smt = con.createStatement();
			
			System.out.println(query);
			count= smt.executeUpdate(query);
			if(count>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not inserted");
		/*} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		/*	if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		*/	if (smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


			}

}


