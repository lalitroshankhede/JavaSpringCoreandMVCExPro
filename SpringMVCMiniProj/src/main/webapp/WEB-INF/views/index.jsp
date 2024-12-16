<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login & Register</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  
    <style>
        body {
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
            position: relative;
        }
        .btn-toggle {
            position: absolute;
            top: -30px;
            left: 50%;
            transform: translateX(-50%);
        }
    </style>
</head>
<body>
    <div class="form-container">
        

<!-- Login Form -->
        <div id="loginForm" class="form-content">
            <h3 class="text-center">Login</h3>
      
            <form action="loginForm" method="post">
                <div class="form-group">
                    <label for="loginEmail">Email</label>
                    <input type="email" class="form-control" id="loginEmail" name="email" placeholder="Enter your email">
                </div>
                <div class="form-group">
                    <label for="loginPassword">Password</label>
                    <input type="password" class="form-control" id="loginPassword" name="password" placeholder="Enter your password">
                </div>
                <button type="submit" class="btn btn-primary btn-block">Login</button>
                <a href="index.jsp">Back To Main</a>
            </form>
        </div>

 
     

    
   
    <script>
     
       if (${message }>0) {
    	   alert('User ${message } Added Successfully');
	}
      
    
        $(document).ready(function () {
            $('#btnLogin').click(function () {
                $('#loginForm').removeClass('d-none');
                $('#registerForm').addClass('d-none');
                $('#btnLogin').removeClass('btn-outline-primary').addClass('btn-primary');
                $('#btnRegister').removeClass('btn-primary').addClass('btn-outline-primary');
            });

            $('#btnRegister').click(function () {
                $('#registerForm').removeClass('d-none');
                $('#loginForm').addClass('d-none');
                $('#btnRegister').removeClass('btn-outline-primary').addClass('btn-primary');
                $('#btnLogin').removeClass('btn-primary').addClass('btn-outline-primary');
            });
        });
    </script>
    
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
</body>
</html>
 