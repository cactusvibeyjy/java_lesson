<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	/* String name = request.getParameter("name"); */
	String id = request.getParameter("id");
	String password = request.getParameter("password");
		if(id.equals("관리자") && password.equals("1234")){
			response.sendRedirect("Success.jsp");
		}else {
			response.sendRedirect("Fail.jsp");
		}
	%>
	<%-- <p>이 름 : <%= name%>
	<p>아이디 : <%= id%>
	<p>비밀번호 : <%= password%>
	<P>넘어온 요청정보 길이 : <%=request.getContentLength()%>
	<p>넘어온 요정 정보 Method : <%=request.getMethod()%>
	<p>넘어온 요정 정보 URI : <%=request.getRequestURI()%>
	<p>넘어온 요정 정보 ServerName : <%=request.getServerName()%>
	<p>넘어온 요정 정보 ServerPort : <%=request.getServerPort()%> --%>
</body>
</html>