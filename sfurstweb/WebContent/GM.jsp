<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="style3.css" />
<title>Gestion de medicament-Connexion</title>
</head>
<body>
	<div class="lg-container">
		<h1>Admin</h1>
		<form action="mesetuser" id="lg-form" name="lg-form" method="post">
			
			<div>
				<label for="username">Username:</label>
				<input type="text" name="user" id="username" placeholder="username"/>
			</div>
			
			<div>
				<label for="password">Password:</label>
				<input type="password" name="pas" id="password" placeholder="password" />
			</div>
			
			<div>				
				<button type="submit" id="login" value="Connecter">Login</button>
			</div>
			
		</form>
		<div id="message"></div>
	</div>
</body>
</html>