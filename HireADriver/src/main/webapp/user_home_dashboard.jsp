<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<% int a=10; int b=20; String userName="SATYA"; %>

	<%
		
	
	%>
	<div class="header">
		<h2>
			Hire-A-Driver | Customer Dashboard | Welcome
			<%=userName %></h2>
		<a href="logout">Logout</a>
	</div>

	<div class="container">

		<h3>Book a Driver</h3>

		<div class="card">

			<form action="createBooking" method="post">

				<label>Pickup Location</label> <input type="text" name="pickup"
					required> <label>Drop Location</label> <input type="text"
					name="drop"> <label>Booking Type</label> <select
					name="bookingType">
					<option>Hourly</option>
					<option>Outstation</option>
					<option>Daily</option>
				</select> <label>Date</label> <input type="date" name="date"> <label>Start
					Time</label> <input type="time" name="time">

				<button type="submit">Book Driver</button>

			</form>

		</div>
		<h3>Your Bookings</h3>

		<hd:bookingTable bookings="${bookingsList }" />
		<table border="1" width="100%">
			<tr>
				<th>Booking ID</th>
				<th>Driver</th>
				<th>Status</th>
				<th>Date</th>
			</tr>
			<%
				for(int i=0;i<10;i++){
			%>
			<tr>
				<td><%=i %></td>
				<td>Ramesh</td>
				<td>Accepted</td>
				<td>2026-03-05</td>
			</tr>
			<%
				}
			%>

		</table>
		
		

	</div>





</body>
</html>