<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="container-wrapper">
	<div class="row">
		<div class="col-md-6">
			<h2>Product Detail</h2>
			<p>Here is the detail information of the product!</p>
			<c:set var="imageFilename"
				value="/resources/images/${product.name}.jpg" />
			<img src="<c:url value="${imageFilename}" />" alt="image"
				style="width: 50%" />
		</div>
		<div class="col-md-6">
			<h3>${product.name}</h3>
			<p>${product.description}</p>
			<p>Manufacturer : ${product.manufacturer}</p>
			<p>Category : ${product.category}</p>
			<p>${product.price}원</p>
		</div>
	</div>
</div>