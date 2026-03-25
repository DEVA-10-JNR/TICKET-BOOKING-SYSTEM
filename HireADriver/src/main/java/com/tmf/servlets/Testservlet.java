package com.tmf.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class testservlet
 */
@WebServlet("/testservlet")
public class Testservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Testservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response  ) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	PrintWriter out = response.getWriter();
		try {
			Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement();
			
		ResultSet rs=stmt.executeQuery("SELECT * FROM customers");
		
		while(rs.next()) {
			request.getParameter("email");
		}
		
		}catch(Exception e) {
			out.println(e);
		}
	}

	
}