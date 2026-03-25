package com.tmf.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	public boolean registerUser(String name, String email,
            String phone, String password, String role) {
try {
Connection conn = DBConnection.getConnection();
String sql =
"INSERT INTO users(full_name,email,phno,password,user_type) VALUES(?,?,?,?,?)";
PreparedStatement ps = conn.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, email);
ps.setString(3, phone);
ps.setString(4, password);
ps.setString(5, role);
int rows = ps.executeUpdate();
return rows > 0;
} catch (Exception e) {
e.printStackTrace();
}
return false;
}
public String loginUser(String email, String password) {
try {
Connection conn = DBConnection.getConnection();
String sql =
"SELECT role FROM users WHERE email=? AND password=?";
PreparedStatement ps = conn.prepareStatement(sql);
ps.setString(1, email);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();
if (rs.next()) {
return rs.getString("role");
}
} catch (Exception e) {
e.printStackTrace();
}
return null;
}
}
