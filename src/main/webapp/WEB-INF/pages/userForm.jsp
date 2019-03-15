<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<html>
<head>
<title>JavaSpringExamples Spring MVC Form</title>
</head>
<body>

	<h2>Form</h2>
	<mvc:form modelAttribute="user" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="name">Name</mvc:label></td>
				<td><mvc:input path="name" /></td>
				<td><mvc:errors path="name" /></td>
			</tr>
			<tr>
				<td><mvc:label path="lastname">Last Name</mvc:label></td>
				<td><mvc:input path="lastname" /></td>
				<td><mvc:errors path="lastname" /></td>
			</tr>
			<tr>
				<td><mvc:label path="password">Password</mvc:label></td>
				<td><mvc:password path="password" /></td>
				<td><mvc:errors path="password" /></td>
			</tr>
			<tr>
				<td><mvc:label path="detail">Detail</mvc:label></td>
				<td><mvc:textarea path="detail" /></td>
			</tr>
			<tr>
				<td><mvc:label path="birthDate">Birth Date</mvc:label></td>
				<td><mvc:input path="birthDate" /></td>
			</tr>
			<tr>
				<td><mvc:label path="gender">Gender</mvc:label></td>
				<td><mvc:radiobuttons path="gender" items="${genders}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="country">Country</mvc:label></td>
				<td><mvc:select path="country" items="${countries}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="nonSmoking">Non Smoking</mvc:label></td>
				<td><mvc:checkbox path="nonSmoking" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
</body>
</html>