<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<h2>User Registration</h2>

		<form action="/HireADriver/register" method="post">

			<label>Full Name</label>
			<input type="text" name="name" required>

			<label>Email</label>
			<input type="email" name="email" required>

			<label>Phone</label>
			<input type="text" name="phone" required>

			<label>Password</label>
			<input type="password" name="password" required>

			<label>Role</label>
			<select name="role">
				<option value="CUSTOMER">Customer</option>
				<option value="DRIVER">Driver</option>
			</select>

			<button type="submit">Register</button>
		</form>
		<%
			String regAck = request.getParameter("regStatus");
			if(null != regAck && regAck.equals("SUCCESS")){
		%>
				<h4> Registration Success. Please try Login with the phone number and password</h4>
				<a href="/HireADrive/login.jsp" />
		<%
			}else if(null == regAck){
		%>
				Registerd User? Try Login<a href="/HireADrive/login.jsp" />
				
		<%
			}else{
		%>
				<h4> Some thing went wrong Try again</h4>
		<%
			}
		%>
	</div>




</body>
</html>