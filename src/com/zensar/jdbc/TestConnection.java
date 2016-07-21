	/* ORACLE DATABASE CONNECTIVITY
			 *Class.forName("oracle.jdbc.driver.OracleDriver");
			 *con=DriverManager.getConnection("jdbc:oracle:thin:@Windows-PC:1521:XE","system", "manager");	*/		
			  
		    /* MYSQL DATABASE CONNECTIVITY
			 Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "upen");*/
package com.zensar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		ResultSet rs = null;
	
		try {
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@Windows-PC:1521:XE","system", "manager");
			System.out.println("connected!!!!");*/
			con=ConnectionProvider.getConnection();
     		smt = con.createStatement();
			rs = smt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
				}
		
		}/* catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		/*} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (smt != null) {
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

*/	
			}

}
}
