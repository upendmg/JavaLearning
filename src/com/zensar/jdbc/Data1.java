package com.zensar.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Data1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd=null;
		DatabaseMetaData dbmd=null;
		try {
			con=ConnectionProvider.getConnection();
			smt = con.createStatement();
			dbmd=con.getMetaData();
				System.out.println(dbmd.getDatabaseProductName());
				System.out.println(dbmd.getDatabaseProductVersion());
				System.out.println(dbmd.getTypeInfo());
				System.out.println(dbmd.getCatalogTerm());
				
				/*rs=dbmd.getSchemas();
				while(rs.next()){
					System.out.println(rs.getString(1));
				}*/
				 rs = dbmd.getTables(null, null, "%", null);
				while (rs.next()) {
					System.out.println(rs.getString(3));
				}
			
		}
	
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
