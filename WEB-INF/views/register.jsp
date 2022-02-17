<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<center><h1>This is registration form</h1></center>
<center>
	<form action="registerprocess" method="post">
		Name : <input type="text" name="name" placeholder="Enter Name"></br></br>
		
		Email : <input type="email" name="email" placeholder="Enter Name"></br></br>
		
		Password : <input type="password" name="pass" placeholder="Enter Password"></br></br>
		
		Number : <input type="number" name="number" placeholder="Enter Number"></br></br>
		
		Gender : <input type="radio" name="gender" value="male"> Male
				 <input type="radio" name="gender" value="female"> Female
				 
		</br></br>Hobby : 
		  <input type="checkbox" name="hobby" value="cricket" /> Cricket
	      <input type="checkbox" name="hobby" value="watchtv" /> Watch Tv 
	      <input type="checkbox" name="hobby" value="playgame" /> Play Game 
	    
	     
	      </br></br>Course :  
				 <select name="course">
				 	<option value="NONE">--SELECT--</option>
					<option value="JAVA">JAVA</option>
					<option value="C">C</option>
					<option value="C++">C++</option> 
				</select>
				 
		</br></br><input type="submit" value="Register">
		
		
		
		
	</form>
</center>
</head>
<body>

</body>
</html>