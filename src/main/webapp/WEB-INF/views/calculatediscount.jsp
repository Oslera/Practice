<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="formlib"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><spring:message code="welcome.message"/></h1>
	<a href="http://localhost:8088/getDiscountedPrice?language=us">Anglis</a>
	<a href="http://localhost:8088/getDiscountedPrice?language=fr">Francais</a>
	<a href="http://localhost:8088/getDiscountedPrice?language=jp">Nihonjin</a>
	<formlib:form action="/calculateDiscountedPrice" method="post" modelAttribute="product">
		<table>
			<tr>
				<td>Product price</td>
				<td><formlib:input type="text" path="productPrice"/></td>
				<td><formlib:errors path="productPrice"/></td>
			</tr>
			<tr>
				<td>Product type</td>
				<td><formlib:select path="productType">
					<formlib:options items="${productTypeList}"/></formlib:select></td>
			</tr>
			<tr>
				<td><input type="submit" value="calculate"></td>
				<td><input type="reset" value="clear"></td>
			</tr>
		</table>
	</formlib:form>
</body>
</html>