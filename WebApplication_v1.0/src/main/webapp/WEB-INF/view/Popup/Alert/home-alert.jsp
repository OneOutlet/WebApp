<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Carpenter Service Error Alert -->
<c:if test="${act eq'reqCarpenter'}">
	<div class="alert alert-danger" role="alert">
		Dear User your request is not Completed <a
			data-target="#modalCarpenterForm" data-toggle="modal"
			class="alert-link">Please Click here </a>. To Complete your Request.
	</div>
</c:if>


<!-- Electrician Service Error Alert -->
<c:if test="${act eq'reqElectrician'}">
	<div class="alert alert-danger" role="alert">
		Dear User your request is not Completed <a
			data-target="#modalElectricianForm" data-toggle="modal"
			class="alert-link">Please Click here </a>. To Complete your Request.
	</div>
</c:if>


<!-- Event Service Error Alert -->
<c:if test="${act eq'reqEvent'}">
	<div class="alert alert-danger" role="alert">
		Dear User your request is not Completed <a
			data-target="#modalEventForm" data-toggle="modal"
			class="alert-link">Please Click here </a>. To Complete your Request.
	</div>
</c:if>


<!-- Painter Service Error Alert -->
<c:if test="${act eq'reqPainter'}">
	<div class="alert alert-danger" role="alert">
		Dear User your request is not Completed <a
		data-target="#modalPainterForm" data-toggle="modal"
			class="alert-link">Please Click here </a>. To Complete your Request.
	</div>
</c:if>


<!-- IronWork Service Error Alert -->
<c:if test="${act eq'reqIronWork'}">
	<div class="alert alert-danger" role="alert">
		Dear User your request is not Completed <a
		data-target="#modalironworkForm" data-toggle="modal"
			class="alert-link">Please Click here </a>. To Complete your Request.
	</div>
</c:if>

<!-- Plumber Service Error Alert -->
<c:if test="${act eq'reqPlumber'}">
	<div class="alert alert-danger" role="alert">
		Dear User your request is not Completed <a
			data-target="#modalPlumberForm" data-toggle="modal"
			class="alert-link">Please Click here </a>. To Complete your Request.
	</div>
</c:if>