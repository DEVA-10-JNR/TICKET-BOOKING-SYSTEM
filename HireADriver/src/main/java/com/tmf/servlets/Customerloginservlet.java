package com.tmf.servlets;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Customerloginservlet
 */
@WebServlet("/Customerloginservlet")
public class Customerloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customerloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email= request.getParameter("email");
		String password=request.getParameter("password");
		
		if(email.equals("admin")&& password.equals("admin"))
		{
			response.sendRedirect("customerdashboard.jsp");
		}
		else {
			response.getWriter().println("invalid email or password");
		}
	}
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.sendRedirect("customerlogin.jsp");
		
		
	}}
