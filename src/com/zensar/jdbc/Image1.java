package com.zensar.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

/*
 * Defininmg the table  in oracle and mysql
 * create table image(
 * id int primary key,
 * name varchar(20),
 * photo longblob
 * );
 */
public class Image1 {
public static void main(String[] args) {
	Connection con = null;
	PreparedStatement pstmt = null;
	//ResultSet rs=null;
	//int count=0;
	String INSERT_PICTURE="insert into image(id,name,photo)values(?,?,?)";
	con=ConnectionProvider.getConnection();
	File f=null;
	
	try {
		f=new File("abc.jpg");
		FileInputStream fis=new FileInputStream(f);
		pstmt=con.prepareStatement(INSERT_PICTURE);
		pstmt.setInt(1,1);
		pstmt.setString(2,"name");
		pstmt.setBinaryStream(3,fis,(int)f.length());
		pstmt.executeUpdate();
		System.out.println("picture inserted");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	
		
	

}
}
