package com.tmf.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Bookingservlet
 */
@WebServlet("/Bookingservlet")
public class Bookingservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String pickup = request.getParameter("pickup");
	        String drop = request.getParameter("drop");

	        try {

	            Connection conn = DBConnection.getConnection();

	            String sql =
	                    "INSERT INTO bookings(pickup_location, drop_location, status) VALUES(?,?,?)";

	            PreparedStatement ps = conn.prepareStatement(sql);

	            ps.setString(1, pickup);
	            ps.setString(2, drop);
	            ps.setString(3, "REQUESTED");
	            ps.executeUpdate();

	            response.sendRedirect("user_dashboard.html");

	        } catch (Exception e) {

	            e.printStackTrace();

	        }
	    		
		
		
		
		doGet(request, response);
	}

}