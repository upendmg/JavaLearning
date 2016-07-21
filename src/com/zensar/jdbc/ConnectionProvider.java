package com.zensar.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionProvider {
		
	    private static Connection con=null;
		public static Connection getConnection() {
			String driver=null;
			String url=null;
			String username=null;
			String password=null;
		try {
			FileReader fr=new FileReader(".\\src\\resources\\db.properties");
			    Properties pr=new Properties();
			    pr.load(fr);
			    driver=pr.getProperty("driver");
			    url=pr.getProperty("url");
			    username=pr.getProperty("username");
			    password=pr.getProperty("password");
			    Class.forName(driver);
				con=DriverManager.getConnection(url,username,password);
				System.out.println("connected!!!!");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			} catch (FileNotFoundException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return con;	
}
}
