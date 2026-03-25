package com.tmf.servlets;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        UserDao dao = new UserDao();

        boolean success = dao.registerUser(name, email, phone, password, role);

        if (success) {
            response.sendRedirect("registration.jsp?regStatus=SUCCESS");
        } else {
            response.getWriter().println("Registration Failed");

        }
    }
}