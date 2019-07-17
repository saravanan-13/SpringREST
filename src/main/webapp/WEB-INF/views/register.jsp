<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<style>
body {
font-family: Arial, Helvetica, sans-serif;
}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password], input[type=number] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 10px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=number]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
text-align:center;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  width: 20%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

</style>
</head>
<body>

<form:form action="register" method="post" style="border:1px solid #ccc" onsubmit="return passwordCheck()" modelAttribute="employee">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
     <form:label for="name" path="name"><b>Name</b></form:label>
    <form:input type="text" path="name" placeholder="Enter Name" />
    <form:errors path="name" cssStyle="color: #ff0000;"/>
    <br><br>

    <form:label for="password" path="password"><b>Password</b></form:label>
    <form:input type="password" path="password" id="pwd1" placeholder="Enter Password" name="password"  />
    <form:errors path="password" cssStyle="color: #ff0000;" />
    <br><br>
    
    <label for="password-repeat"><b>Confirm Password</b></label>
    <input type="password" id="pwd2" placeholder="Confirm Password" name="password-repeat"  />
    <br><br>
    
    <form:label for="email" path="email"><b>Email</b></form:label>
    <form:input path="email" type="text" placeholder="Enter Email" name="email" />
    <form:errors path="email" cssStyle="color: #ff0000;" />
    <br><br>
    
    <form:label path="age" for="age"><b>Age</b></form:label>
    <form:input path="age" type="number" placeholder="Enter Age" name="age" />
    <form:errors path="age" cssStyle="color: #ff0000;" />
    <br><br>
    
    <form:label for="salary" path="salary"><b>Salary</b></form:label>
    <form:input type="text" path="salary" placeholder="Enter Salary" name="salary" />
    <form:errors path="salary" cssStyle="color: #ff0000;" />
    <br><br>
    
    <form:label for="role" path="name"><b>Role</b></form:label>
    <form:input type="text" path="role" placeholder="Enter Role" name="role" />
    <form:errors path="role" cssStyle="color: #ff0000;" />
    <br><br>
    
    <div class="clearfix">
      <button type="submit" class="signupbtn">SIGN UP</button>
    </div>
        <p>Already have an account ?</p>
      <div class="clearfix">
        <a href="login"><button type="button" class="signupbtn">LOGIN</button></a>
    </div>
  </div>
</form:form>
<script>
	function passwordCheck(){
		var pwd1 = document.getElementById("pwd1").value;
		var pwd2 = document.getElementById("pwd2").value;
		if(pwd1 === pwd2){
			return true;
		}
		else{
			alert("Both the password fields are not same !");
			return false;
		}
	}
</script>
</body>
</html>