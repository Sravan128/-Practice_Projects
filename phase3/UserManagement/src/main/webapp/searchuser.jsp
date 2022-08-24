<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action ="searchUser" method="post">
<h2>Search User</h2>
<table>
<tr>
<td>User Id : </td>
<td><input type="text" name="id"/></td>
</tr>
<tr>
<td><input type="submit"  value="submit"/></td>
</tr>
</table>
</br>
${requestScope.msg}
</form>
</body>
</html>