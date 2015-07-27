<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table, th, td {
    border: 2px solid black;
    border-collapse: collapse;
}
td {
	color: blue;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr><th>NOMBRE</th>
		<td> <s:property value="empleado.FIRST_NAME"/><br /></td>
	</tr>
	
	<tr><th>APELLIDO </th>
		<td> <s:property value="empleado.LAST_NAME"/><br /></td>
	</tr>
	
	<tr><th>ID</th>
		<td> <s:property value="empleado.EMPLOYEE_ID"/><br /></td>
	</tr>
	
	<tr><th>EMAIL</th>
		<td><s:property value="empleado.EMAIL"/><br /></td>
	</tr>
	<tr><th>PHONE</th>
		<td><s:property value="empleado.PHONE_NUMBER"/><br /></td>
	</tr>
</table>







</body>
</html>