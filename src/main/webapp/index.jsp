<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<link rel="stylesheet" href="index.css">
</head>
<body>

	<form action="login" method="post" class="loginpage">
		<section class="lable">
			<h1>Welcome back!</h1>
            <p>Enter your cerdential to access your account</p> <br> <br>
            
			<label>email : </label>
			<input type="text" placeholder="Eneter email" required="required" class="input-field" name="u_email"> <br> <br>
			<label>password : </label> 
			<input type="password" placeholder="Enter Password" required="required" class="input-field" name="u_password"> <br> <br>
			
			<div class="submit_btn">
				<button>login</button>
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
                    <span>Don't have an account?</span>
                <a href="signup.jsp">Sign Up</a>
                </div>
            </div>
		</section>
		
	</form>


</body>
</html>