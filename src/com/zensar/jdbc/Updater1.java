package com.zensar.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Updater1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		ResultSet rs=null;
		try {
			con=ConnectionProvider.getConnection();
			smt = con.createStatement(rs.TYPE_SCROLL_SENSITIVE ,rs.CONCUR_UPDATABLE);
			rs = smt.executeQuery("select * from employee");
			rs.next();
			rs.moveToInsertRow();
			rs.updateInt(1, 999);
			rs.updateString(2,"shrey");
			rs.updateInt(1, 1111);
			rs.updateInt(3, 5555);
			rs.insertRow();
			/*rs.updateString(2, "upendra");
			rs.updateRow();
			System.out.println("name updated successfully!!!");*/
			System.out.println("updated successfully");
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
