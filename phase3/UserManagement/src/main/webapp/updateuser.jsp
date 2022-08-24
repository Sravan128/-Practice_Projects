<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update user</h2>
${requestScope.msg}
<form action="updateUser" method="post">
<table>
<tr>
<td> User Id : </td>
<td><input type="text"  name="id"/></td>
</tr>
<tr>
<td> User Name : </td>
<td><input type="text"  name="name"/></td>
</tr>
<td> Address : </td>
<td><input type="text"  name="address"/></td>
</tr>
<tr>
<td><input type="submit"  value="submit"/></td>
<td><input type="reset"  value="Reset"/></td>
</tr>
<tr><a href="index.jsp">Back</a></tr>
</table>
</form>
</body>
</html>