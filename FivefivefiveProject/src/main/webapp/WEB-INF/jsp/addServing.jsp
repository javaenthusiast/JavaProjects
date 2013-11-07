<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Servings Page</title>
</head>
<body>


Language : <a href="?language=en">English</a> | <a href="?language=sp">Spanish</a>


<h1> <spring:message code="task5.text"/> </h1>




<form:form commandName="servings">
<fieldset>
	<table>
		<tr>
			<td>
				<spring:message code="task.text" />
			</td>
			<td><form:input path="items"/> </td>
		</tr>
		
		<tr>
			<td><spring:message code="task1.text" /></td>
			<td><form:input path="date"/> </td>
		</tr>
		
		<tr>
			<td><spring:message code="task2.text" /></td>
			<td><form:input path="servings"/> </td>
		</tr>
		
		<tr>
			<td><spring:message code="task3.text" /></td>
			<td><form:input path="userId"/> </td>
		</tr>
		
		<tr>
			<td><spring:message code="task4.text" /></td>
			<td><form:input path="userName"/> </td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit entries" />
			</td>
			
		</tr>

	</table>
</fieldset>

</form:form>

</body>
</html>