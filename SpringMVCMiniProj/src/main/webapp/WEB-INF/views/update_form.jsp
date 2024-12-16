<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


	<h3 class="text-center">Update Product Details</h3>
	<div class="container">

		<div class="row">

			<div class="col-sm-2"></div>

			<div class="col-sm-8">

				<form action="${pageContext.request.contextPath }/handle-form"
					method="post">

                 <!-- Note: here we have to add "name" property and passing "id" because of we have to fetch exact product which is choose by particular id.  -->
					
					<input type="hidden" value="${productUpdate.id }" name="id">

					<div class="form-group">
						<label for="exampleFormControlInput1">Product Name</label> <input
							type="text" class="form-control" id="exampleFormControlInput1"
							name="name" placeholder="Enter Product Name"
							value="${productUpdate.name }">
					</div>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Product
							Description</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							name="description" rows="3"
							placeholder="Enter Product Description">${productUpdate.description }</textarea>
					</div>

					<div class="form-group">
						<label for="exampleFormControlInput1">Product Price</label> <input
							type="text" class="form-control" id="exampleFormControlInput1"
							name="price" placeholder="Enter Product Price"
							value="${productUpdate.price }">
					</div>

					<a href="${pageContext.request.contextPath }/menus"
						class="btn btn-secondary   active" role="button"
						aria-pressed="true">Back</a>

					<button type="submit" class="btn btn-warning">Update</button>


				</form>

			</div>

			<div class="col-sm-2"></div>

		</div>


	</div>





<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</body>
</html>