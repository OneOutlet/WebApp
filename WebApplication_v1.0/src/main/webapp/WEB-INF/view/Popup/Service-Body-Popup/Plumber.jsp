<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!----SignUp Model---->
<div class="modal fade" id="modalPlumberForm" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header text-center">
				<h4 class="modal-title w-100 font-weight-bold">BOOK Plumber</h4>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form:form action="#" modelAttribute="serviceElectrician">
				<div class="modal-body mx-3">
					<div class="md-form mb-5">
						<i class="fas fa-user prefix grey-text"></i>
						<form:input type="text" path="name" id="orangeForm-name"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Your name</label>
					</div>
					<div class="md-form mb-5">
						<i class="fas fa-mobile-alt prefix grey-text"></i>
						<form:input path="mobile" type="text" id="orangeForm-name"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Mobile Number</label>
					</div>
					<div class="md-form mb-5">
						<i class="fas fa-envelope prefix grey-text"></i>
						<form:input path="email" type="email" id="orangeForm-email"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-email">Your email</label>
					</div>

		           <div class="md-form mb-5">
						<i class="fas fa-user prefix grey-text"></i>
						<form:input type="text" path="name" id="orangeForm-name"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Your Address</label>
					</div>

				</div>
				<div class="modal-footer d-flex justify-content-center">
					<button type="submit" class="btn btn-deep-orange">BOOK NOW</button>
				</div>
			</form:form>
		</div>
	</div>
</div>
