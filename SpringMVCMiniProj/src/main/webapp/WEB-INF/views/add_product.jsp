<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>


	<h3 class="text-center">Add Product</h3>
	<div class="container">

		<div class="row">

			<div class="col-sm-2"></div>

			<div class="col-sm-8">

				<form action="handle-form" method="post">
					<div class="form-group">
						<label for="exampleFormControlInput1">Product Name</label> <input
							type="text" class="form-control" id="exampleFormControlInput1"
							name="name" placeholder="Enter Product Name">
					</div>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Product
							Description</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							name="description" rows="3"
							placeholder="Enter Product Description"></textarea>
					</div>

					<div class="form-group">
						<label for="exampleFormControlInput1">Product Price</label> <input
							type="text" class="form-control" id="exampleFormControlInput1"
							name="price" placeholder="Enter Product Price">
					</div>

					<a href="${pageContext.request.contextPath }/menus"
						class="btn btn-secondary   active" role="button"
						aria-pressed="true">Back</a>

					<button type="submit" class="btn btn-primary">Add</button>


				</form>

			</div>

			<div class="col-sm-2"></div>

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