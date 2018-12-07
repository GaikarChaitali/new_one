<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="login.css">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Page</h1>
<form action="/action_page.php">
  <div class="imgcontainer">
   
  </div>

  <div class="container">
    
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
    
    <label for="fname"><b>First Name:</b></label>
    <input type="text" placeholder="Enter First Name" name="fname" required>

    <label for="lname"><b>Last Name:</b></label>
    <input type="text" placeholder="Enter Last Name" name="lname" required>
    
    <label for="email"><b>Email Id:</b></label>
    <input type="email" placeholder="Enter Email-Id" name="email" required>
    
    <label for="phone"><b>Phone No: </b></label>
    <input type="number" placeholder="Enter phone no." name="phone" required>
    
        
    <button type="submit">Register</button>
    
  </div>

  <div class="container" style="background-color:#f1f1f1">

    <span class="login"><a href="login.jsp">Login</a></span>
  </div>
</form>

</body>
</html>