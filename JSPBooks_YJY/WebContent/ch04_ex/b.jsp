<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>b.jsp 파일입니다. 포워드로 넘어온 페이지</h2>
<%-- <h2>오늘의 날짜와 시간 : <%=request.getParameter("date1")%></h2> --%>
	<%-- <h2>아이디: <%=request.getParameter("id")%></h2>
		<%
		String name = request.getParameter("name");
		%>
	<h2>이름: <%=java.net.URLDecoder.decode(name) %></h2>
	<h2>email: <%=request.getParameter("email")%></h2>
	<%
		String email = request.getParameter("email");
		%>
	<h2>이메일: <%=java.net.URLDecoder.decode(email) %></h2> --%>
	
	<h2>오늘의 날짜와 시간 : <%=request.getParameter("date")%></h2>
</body>
</html>