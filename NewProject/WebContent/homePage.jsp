<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="homePage.css">
<title>Shopping Website</title>
</head>

<body>
	<header class="head">
	<div><box width=20% height=30% float="left">
		<image src="logo.png" id="home" alt="Product1" 
			width=20% align="left"></div>
	</box>	<h1 align=center id="welcome">Welcome to Shopping Cart</h1>
	
	<center>
		<form><div class="search">
			Search: <input type="search" name="Search" id="googlesearch"> <input
				type="submit" value="search">
		</div></form>
		<nav> <pre>
			<a href="#">Home</a>			<a href="#">About</a>			<a href="#">Login</a>			<a
				href="#">Register</a>                <a href="#">Cart</a>
		</pre></nav>
	</center>
	<hr>
	</header>

	<center>
		<table height="100%" width="100%"  id="main">
			<tr class="product1">
				<td ><image src="i11.jpg" alt="Iphone" height=150% width=45% align="left"><image src="i22.jpg" alt="Iphone" height=150% width=45%></td>
				<td ><a href="#">Iphone</a><br>Price:40000<br></td>
				<td ><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product2">
				<td><image src="r11.jpg" alt="Redmi" height=150% width=45% align="left"><image src="r22.jpg" alt="Redmi" height=150% width=45% ></td>
				<td>
					<a href="#">Redmi</a>
					<br>Price:30000<br>
				</td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product1">
				<td><image src="h11.jpg" alt="HONOR" height=150% width=45% align="left" ><image src="h22.jpg" alt="HONOR" height=150% width=45%></td>
				<td><a href="#">HONOR</a><br>Price:60000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product2">
				<td><image src="o11.jpg" alt="OPPO" height=150% width=45% align="left" ><image src="o22.jpg" alt="OPPO" height=150% width=45%></td>
				<td><a href="#">OPPO</a><br>Price:20000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product1">
				<td><image src="iphone.png" alt="MI" height=100 width=100></td>
				<td><a href="#">MI</a><br>Price:4000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product2">
				<td><image src="iphone.png" alt="AMBRANE" height=100 width=100></td>
				<td><a href="#">AMBRANE</a><br>Price:5000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>

		</table>
	</center>
	<a href="Homepage2.jsp"> <input type="button" name="next"
		value="Next" align="right"></a>
	<footer>
	<hr>
	
		<div class=t1>Contact Us:</div>                    <div class=t2>About Us:</div>           

	</footer>
</body>
</html>