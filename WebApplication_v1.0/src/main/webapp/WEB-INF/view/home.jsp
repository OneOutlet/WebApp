<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYpE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>OneOutlet-Gonda</title>
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Google Fonts -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css"
	rel="stylesheet">
<!---Custom CSS-->
<link href="Edit/EditHome/custom-home.css" rel="stylesheet">
</head>
<body>


    <!-- Service Error Alert -->
    
    <jsp:include page="Popup/Alert/home-error-alert.jsp"></jsp:include>

    <!-- Service Success Alert -->
    
    <jsp:include page="Popup/Alert/home-success-alert.jsp"></jsp:include>


	<!--Navbar -->
	<jsp:include page="Header/Navbar.jsp"></jsp:include>

	<!-- Body -->
	<div class="container">

		<jsp:include page="Body/Services-Body.jsp"></jsp:include>

	</div>

	<!-- Popups -->

	<jsp:include page="Popup/Service-Body-Popup/Electrician.jsp"></jsp:include>


	<jsp:include page="Popup/Service-Body-Popup/Carpenter.jsp"></jsp:include>


	<jsp:include page="Popup/Service-Body-Popup/EvenPlaning.jsp"></jsp:include>


	<jsp:include page="Popup/Service-Body-Popup/Ironwork.jsp"></jsp:include>


	<jsp:include page="Popup/Service-Body-Popup/Painter.jsp"></jsp:include>


	<jsp:include page="Popup/Service-Body-Popup/Plumber.jsp"></jsp:include>
	
	
	<jsp:include page="Popup/Service-Body-Popup/Contact-us.jsp"></jsp:include>

	<!-- JQuery -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<!-- Bootstrap tooltips -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
	<!-- MDB core JavaScript -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/js/mdb.min.js"></script>
</body>
</html>