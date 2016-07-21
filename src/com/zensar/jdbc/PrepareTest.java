package com.zensar.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareTest {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		CallableStatement cstm=null;
		int count=0;
		int id=0 , sal=0 ;
		String Name=null;
		int s1=0;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("enter the id of employee");
		id=sc.nextInt();
		System.out.println("enter the Name of employee");
		Name=sc.next();
		System.out.println("enter the sal of employee");
		sal=sc.nextInt();
		
		try {
			con=ConnectionProvider.getConnection();
			pstmt=con.prepareStatement("insert into employee values(?, ?, ?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, Name);
			pstmt.setInt(3, sal);
			count= pstmt.executeUpdate();
			if(count>0){
				System.out.println("Record Inserted.");
			   
			}
			else
				System.out.println("Record not inserted");
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			/*if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			if (pstmt != null) {
				try {
					pstmt.close();
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
		
		
		
		System.out.println("Do you want to continue?,press 1 to continue"); 
		s1=sc.nextInt();
		}while(s1>0);
	}
	
	
	
	
}
	


