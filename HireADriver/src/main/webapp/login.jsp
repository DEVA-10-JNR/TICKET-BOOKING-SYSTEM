<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hire a Driver - Login</title>

<!-- Linking External CSS File -->
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>

 <div class="login-container">
     <h1>Hire a Driver Login Page</h1>

     <form action="http://localhost:8081/HireADriver/login" method="post">
         <label >USERNAME :</label>
         <input type="text" name="user_name"/>

         <label>PASSWORD :</label>
         <input type="password" name="password"/>

        <button type="submit">Login</button>
     </form>
     <p>New user? <a href="registration.jsp">Register</a></p>
     
 </div>

</body>
</html>