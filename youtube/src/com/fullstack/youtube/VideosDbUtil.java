package com.fullstack.youtube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VideosDbUtil {
	
	public static List<Video> getVideosList() throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/YouTube?useSSL=false";
		String userName = "root";
		String password = "";
		
		
		ArrayList<Video> videos = new ArrayList<>();
		
		// load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// get the connection
		Connection con = DriverManager.getConnection(url, userName, password); 
		
		// create a statement
		Statement stmt = con.createStatement();
		
		// execute the statement and look over the result set
		ResultSet rs = stmt.executeQuery("select * from Videos"); 
		
		while (rs.next()) {
			int id = rs.getInt(1);
			String category = rs.getString(2);
			String src = rs.getString(3); 
			Video v = new Video(id, category, src); 
			
			videos.add(v); 
		}
		
		
		return videos; 
	}

}
