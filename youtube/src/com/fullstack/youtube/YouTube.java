package com.fullstack.youtube;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/YouTube")
public class YouTube extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		String[] videoCategories = {"sports", "finance", "software developments"};
//		request.setAttribute("videoCategories", videoCategories);
		
		
		try {
			List<Video> videoItems = VideosDbUtil.getVideosList();
			request.setAttribute("videoItems", videoItems);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("youtube.jsp");
		dispatcher.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
