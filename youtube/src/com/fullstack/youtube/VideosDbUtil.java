package com.fullstack.youtube;

import java.util.ArrayList;
import java.util.List;

public class VideosDbUtil {
	
	public static List<Video> getVideoList() 
	{
		String url = "jdbc:mysql://localhost:3306/YouTube?useSSL=false";
		String userName = "root";
		String password = "";
		
		
		ArrayList<Video> video = new ArrayList<>();
		
		// load mysql driver
		
		// get the connection
		
		// create a statement
		
		// execute the statement and look over the result set
		return video; 
	}

}
