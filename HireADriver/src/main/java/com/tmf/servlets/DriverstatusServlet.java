package com.tmf.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DriverstatusServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String status = request.getParameter("status");

        try {

            Connection conn = DBConnection.getConnection();

            String sql =
                    "UPDATE drivers SET availability_status=? WHERE driver_id=1";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, status);
            ps.executeUpdate();
            response.sendRedirect("driver_dashboard.html");

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
