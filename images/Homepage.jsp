<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="homePgae.css">
<title>Insert title here</title>
</head>

<body>
	<header class="head">
	<div>
		<image src="oppo.png" id="home" alt="Product1" height=100
			width=100></div>
		<h1 align=center id="welcome">Welcome to ShoppingCart</h1>
	
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
				<td><image src="iphoneXMax.png" alt="Iphone" height=100 width=100 ></td>
				<td><a href="#">Iphone</a><br>Price:40000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product2">
				<td><image src="redmi.png" alt="Redmi" height=100 width=100></td>
				<td>
					<a href="#">Redmi</a>
					<br>Price:30000<br>
				</td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product1">
				<td><image src="honor.png" alt="HONOR" height=100 width=100></td>
				<td><a href="#">HONOR</a><br>Price:60000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product2">
				<td><image src="oppo.png" alt=" OPPO " height=100 width=100></td>
				<td><a href="#">OPPO</a><br>Price:20000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product1">
				<td><image src="Desert.jpg" alt="MI" height=100 width=100></td>
				<td><a href="#">MI</a><br>Price:4000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>
			<tr class="product2">
				<td><image src="Desert.jpg" alt="AMBRANE" height=100 width=100></td>
				<td><a href="#">AMBRANE</a><br>Price:5000<br></td>
				<td><input type="button" name="Add to cart" value="Add to cart"></td>
			</tr>

		</table>
	</center>
	<a href="Homepage2.jsp"> <input type="button" name="next"
		value="Next" align="right"></a>
	<footer>
	<hr>
	<center>
		<h2>Thank you for shopping</h2>
	</center>
	</footer>
</body>
</html>