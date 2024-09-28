<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index page</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body class="body_bg">

	<h1>Welcome TO LOGIN Page</h1>
	
	<h4> LOGIN Here</h4>
	
	
	<c:if test="${not empty errorMsg}">
	<h4 style="color:red"> ${errorMsg} </h4>
	</c:if>
	
	
	
	<form action="loginForm" method="post">
	

	Email : <input type="text" name="email"/> <br/> <br/>
	Password : <input type="text" name="password"/> <br/> <br/>
	
	          <input type="submit" value="login"/>
	
	
	</form>
	
	<br/><br/>
	
	If YOU ARE Not Registered ..<a href="regPage">Click Here</a>

	

</body>
</html>