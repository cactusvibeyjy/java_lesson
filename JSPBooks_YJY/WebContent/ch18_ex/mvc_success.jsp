<%@ page contentType="text/html; charset=utf-8"%>
<%@page import="ch18.coms.model.Person"%>
<html>
<head>
<title>MVC</title>
</head>
<body>
	<p>입력을 성공했습니다
	<p><%

		Person person = (Person) request.getAttribute("person");
		out.print("이름 : " + person.getName());
		out.print("<br>");
		out.print("이메일 : " + person.getEmail());
		out.print("<br>");
		out.print("info : " + person.toString());
		
	%>
</body>
</html>