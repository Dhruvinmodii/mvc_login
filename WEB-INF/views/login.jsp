<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginprocess" method="post">
	<table align="center">
		<tr>
			<td>
				Email : 
			</td>
			<td>
				<input type="email" name="email" placeholder="enter email" > 
			</td>
		</tr>
		<tr>
			<td>
				Password : 
			</td>
			<td>
				<input type="password" name="password" placeholder="enter password" > 
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Login"> 
			</td>
		</tr>
	</table>
</form>
<table align="center">
	<tr>
		<td style="color:red">
			${message }
		</td>
	</tr>
</table>
</body>
</html>