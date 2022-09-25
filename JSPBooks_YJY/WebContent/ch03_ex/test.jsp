<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="myError.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <h2>현재 시각은</h2>
<%=new Date() %> --%>
	<%-- <% String str = null;
out.println(str.toString());
%> --%>

	<%-- <h2>EL표기법에 대해서 간단히 알아보기.</h2>
<%
	request.setAttribute("key", "실제값(value)");
%>
<h2>${requestScope.key }</h2>
<h2>여기에 myError.jsp 파일을 배포합니다.</h2>
<%@ include file = "myError.jsp" %> --%>
	<h2>JSP 에서 JSTL 사용자 정의 태그, taglib 지시어를 통해서 c(core)사용해보기.</h2>
	<c:out value="출력용도로 사용함. 마치 jsp의 " />
	<br>
	<c:forEach var="a" begin="0" end="10" step="2">
		<c:out value="${a}" />
		<br>
	</c:forEach>
	<%
		Date day = new java.util.Date();
	String am_pm;
	int hour = day.getHours();
	int minute = day.getMinutes();
	int second = day.getSeconds();
	if (hour / 12 == 0) {
		am_pm = "AM";
	} else {
		am_pm = "PM";
		hour = hour - 12;
	}
	String CT = hour + ":" + minute + ":" + second + " " + am_pm;
	out.println("현재 접속 시각: " + CT + "\n");
	%>

<%!int count = 0;

	void addCount() {
		count++;
	}%>
	<%
		addCount();
	%>
	<h2>이 페이지는 myError 페이지 입니다.</h2>
	<h2>
		방문자 수 :
		<%=count%>
		번째 방문자.
	</h2>

	<%@ include file="footer.jsp"%>

</body>
</html>