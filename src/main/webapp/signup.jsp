<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign-up page</title>
<link rel="stylesheet" href="signup.css">
</head>
<body>

	<%@page import="hotel.SaveUser" %>
	<% int result = SaveUser.result(); %>

	<form action="signup" class="signup-page">
	<section class="lable">
		<h1>Welcome back!</h1>
            <p>Enter your cerdential</p> <br>
		<label>name : </label>
		<input type="text" placeholder="Enter Your Name" class="input-field" name="userName"> <br> <br>
		<label>email : </label>
		<input type="text" placeholder="Enter Email" class="input-field" name="userEmail"> <br> <br>
		<label>contact : </label>
		<input type="number" placeholder="Enter Mobile Number" class="input-field" name="userContact"> <br> <br>
		<label>password : </label>
		<input type="password" placeholder="Enter Password" class="input-field" name="userPwd">
		<br> <br>
		<div id="submit_btn"> 
			<button>submit</button> 
		</div>
		<br>
		
		<section id="or-ln"><p id="or-cnt">or</p></section>
		
		<div id="last">
                <div id="button">
                    <button class="btn">
                        <span id="google-img">
                            <i class="fa-brands fa-google"></i>
                        </span>
                        Sign in with Google
                    </button>
        
                    <button class="btn">
                        <span>
                            <i class="fa-brands fa-apple"></i>
                        </span>
                        Sign in with Apple
                    </button>
                </div>
    
                <script src="https://kit.fontawesome.com/c4f74c5bca.js" crossorigin="anonymous"></script>
                <br>
    
                <div id="signup">
                    <span>Have an account?</span>
                <a href="index.jsp">Login</a>
                </div>
            </div>
	</section>
	</form>

</body>
</html>