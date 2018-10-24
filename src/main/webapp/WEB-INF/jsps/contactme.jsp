<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONTACT ME</title>
</head>
<body>

<h2 align="center">
	<i>
		SEND ME A MESSAGE, EXPECT QUICK RESPONSE
	</i>
</h2>
<hr>
<div align="center">
	<form action="/sendMeMails" method="POST">
		ENTER YOUR FULLNAME: <input type="text" placeholder="Type your fullname here" name="fullname"><br>
		ENTER YOUR EMAIL ADDR.: <input type="text" placeholder="Type your email here" name="email"><br>
		ENTER MESSAGE SUBJECT: <input type="text" placeholder="Type message subject" name="subject"><br>
		ENTER YOUR MESSAGE HERE: <input type="text" placeholder="Type your message here" name="body">
		<br>
		<input type="submit" name="submit">
	</form>
</div>
<div align="center" style="color: green">
	<h3>
		<i>
			${message}
		</i>
	</h3>
</div>
</body>
</html>