package com.tmf.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class UserDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserDashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Booking> bookingsList = new ArrayList<>();
		//write code to get bookingsList
		request.setAttribute("bookingsList", bookingsList);
		request.getRequestDispatcher("user_dashboard.jsp");
	}

}