<%@page import="org.springframework.web.servlet.view.RedirectView"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false"%>
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Creative Food Animated Template</title>
 <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
    <style>
        /* Background Gradient */
        body, html {
            height: 100%;
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #ff7e5f, #feb47b);
            overflow: hidden;
            font-family: 'Arial', sans-serif;
        }

		.title
		{font-size:50px;text-align:center;color:white;font-weight:bold;}
       
    </style>
</head>
<body>
    <div class="title">Welcome To Product App </div>

    			<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">
			
			   
			    <a href="index.jsp" style="color:white;font-size:20px;font-weight:bold;"><u>Log Out</u></a>
			   
				 
				<div class="container text-right  ">

					<a href="add_product" class="btn btn-primary" role="button"
						aria-pressed="true">Add Product</a>

				</div>


				<table class="table" style="width: 100%;margin-top: 20px">
					<thead class="thead-dark">
						<tr>
							<th scope="col">S.No.</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>

						</tr>
					</thead>
					<tbody>

						<c:forEach items="${productList }" var="p">

							<tr>
								<th scope="row">${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td class="font-weight-bold">&#8377;${p.price }</td>
								<td><a href="delete/${p.id }" ><i
										class="far fa-trash-alt text-danger" style="font-size: 20px"></i></a>
									<a href="update/${p.id }" ><i class="fas fa-edit"
										style="font-size: 20px"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>


			</div>

		</div>

	</div>
		
     <script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>

	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.1/css/all.min.css"
		integrity="sha512-5Hs3dF2AEPkpNAR7UiOHba+lRSJNeM2ECkwxUIxC1Q/FLycGTbNapWXB4tP889k5T5Ju8fs4b1P5z/iB4nMfSQ=="
		crossorigin="anonymous" referrerpolicy="no-referrer" />
</body>
</html>


 