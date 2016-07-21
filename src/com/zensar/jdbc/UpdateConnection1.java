package com.zensar.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateConnection1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd=null;
		int count=0;
		try {
			con=ConnectionProvider.getConnection();
			smt = con.createStatement();
			rs=smt.executeQuery("select * from employee");
			rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			for(int i=1;i<=rsmd.getColumnCount();i++){
				
				System.out.println(rsmd.getColumnLabel(i));
				System.out.println(rsmd.getColumnTypeName(i));
				System.out.println(rsmd.getColumnDisplaySize(i));
				
				
			}
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

	

