<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>
	<h1>Product Details are:</h1>
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>ProductCost</th>
			<th>Product Stock</th>
		</tr>
		
	<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.productId}</td>
				<td>${product.productname}</td>
				<td>${product.productcost}</td>
				<td>${product.productstock}</td>
			</tr>
			
			
		</c:forEach>
	</table>
	<br/>
<a href="index.html">Home</a>
</body>
</html>