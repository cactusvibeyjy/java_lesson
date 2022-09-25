<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex1.jsp</title>
</head>
<body>
	<!-- <form action = "ex2.jsp", method = "post">
		<p>
			이 름 : <input type = "text" name = "name"><br>
			아이디 : <input type = "text" name = "id"><br>
			비밀번호 : <input type = "password" name = "password"><br>
			
			<input type = "submit" value = "전송">
	</form>   -->
	
	<%-- <%
		String hostValue = request.getHeader("host");
		String langValue = request.getHeader("accept-language");
		Enumeration en = request.getHeaderNames();
		%> --%>

	<%-- out.print("호스트명 : " +hostValue + "<br>");
	out.print("설정된 언어 : " +langValue + "<br>");
	%>
	<h2>Enumeration을 이용하여 여러 값들을 반복문을 통해서 출려하기</h2>
	<%
		while(en.hasMoreElements()){
			String headerName = (String)en.nextElement();
			String headerValue = request.getHeader(headerName);
		
	%>
	헤더이름: <%= headerName %> , 헤더 값: <%= headerValue %><P>
	<%
	}
	%> --%>
	
	<%-- <%
		response.sendRedirect("http://www.google.com");
	%>
	 --%>
	
	<%-- <%
		response.setHeader("Cache-control", "use_cache_yjy");
		response.addHeader("contentType", "text/html; charset=utf-8");
		response.setDateHeader("date", 1L);
	%>
	
	Cache-control 출력해보기 : <%=response.getHeader("Cache-control") %><br>
	contentType 출력해보기 : <%=response.getHeader("contentType") %><br>
	date : <%=response.getHeader("date") %> --%>
	
<%-- 	<h2>페이지 3초마다 리프레쉬 출력하기</h2>
		<%
			response.setIntHeader("Refresh", 3);
		%>
		<p> <%=(new java.util.Date()) %> --%>
		
	<%-- <%
		response.sendError(400, "요청한 페이지를 찾을 수 없음.");
	%> --%>
	<% 
		response.sendError(500, "서버 오류.");
	%>
</body>
</html>