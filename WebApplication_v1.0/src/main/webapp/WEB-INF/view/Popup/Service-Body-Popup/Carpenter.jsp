<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!----SignUp Model---->
<div class="modal fade" id="modalCarpenterForm" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header text-center">
				<h4 class="modal-title w-100 font-weight-bold">BOOK CARPENTER</h4>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form:form action="regitercarpenterservice"
				modelAttribute="serviceCarpenter" class="needs-validation">
				<div class="modal-body mx-3">
					<div class="md-form mb-5">
						<i class="fas fa-user prefix grey-text"></i>
						<form:input type="text" path="Customer_Name"
							id="validationServerUsername55"
							class="form-control is-invalid validate" required="required" />
						<label data-error="wrong" data-success="right"
							for="validationServerUsername55">Your Name</label>

						<form:errors class="invalid-feedback" path="Customer_Name" />

					</div>
					<div class="md-form mb-5">
						<i class="fas fa-mobile-alt prefix grey-text"></i>
						<form:input path="mobile" type="text" id="orangeForm-name" placeholder="9111111111"
							class="form-control is-invalid  validate" required="required" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Mobile Number</label>
							
						<form:errors class="invalid-feedback" path="mobile" />
					</div>
					<div class="md-form mb-5">
						<i class="fas fa-envelope prefix grey-text"></i>
						<form:input path="email" type="email" id="orangeForm-email"
							class="form-control is-invalid  validate" required="required" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-email">Your Email</label>
							
						<form:errors class="invalid-feedback" path="email" />
					</div>

					<div class="md-form mb-5">
						<i class="fas fa-user prefix grey-text"></i>
						<form:input type="text" path="Address" id="orangeForm-name"
							class="form-control is-invalid  validate" required="required" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Your Address</label>
							
						<form:errors class="invalid-feedback" path="Address" />
					</div>

				</div>
				<div class="modal-footer d-flex justify-content-center">
					<button type="submit" class="btn btn-deep-orange">BOOK NOW</button>
				</div>
			</form:form>
		</div>
	</div>
</div>
