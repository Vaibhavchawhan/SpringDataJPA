<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index page</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body class="body_bg">

	<h1>Welcome TO Register Page</h1>
	
	<h4> Register Here</h4>
	
	<c:if test="${not empty successMsg}">
	<h4 style="color:green"> ${successMsg} </h4>
	</c:if>
	
	
	<c:if test="${not empty errorMsg}">
	<h4 style="color:red"> ${errorMsg} </h4>
	</c:if>
	
	
	
	<form action="regForm" method="post">
	
	Name : <input type="text" name="name"/> <br/> <br/>
	Email : <input type="text" name="email"/> <br/> <br/>
	Password : <input type="text" name="password"/> <br/> <br/>
	Phone No : <input type="text" name="phoneno"/> <br/> <br/>
	          <input type="submit" value="Register"/>
	
	
	</form>
	
	<br/><br/>
	
	If Alreadu Registered ..<a href="loginPage">Click Here</a>

	

</body>
</html>