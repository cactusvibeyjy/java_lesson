<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <h1>포워드 테스트 페이지입니다.</h1> -->
<%-- <jsp:forward page="b.jsp"/> --%>
<%-- <h1>include 테스트 페이지</h1>
<jsp:include page="b.jsp"></jsp:include> --%>
<%-- <h1>param 테스트 페이지</h1>
<jsp:include page="b.jsp">
	<jsp:param name="date1" value="<%= (new java.util.Date()).toLocaleString()%>"/>
</jsp:include> --%>

<h1>param1 테스트 페이지</h1>
<%-- <jsp:forward page="b.jsp">
	<jsp:param name="id" value="admin"/>
	<jsp:param name="name" value='<%=java.net.URLEncoder.encode("YJY") %>'/>
	<jsp:param name="email" value="xhrtlr@gmail.com"/>
	<jsp:param name="email" value='<%=java.net.URLEncoder.encode("xhrtlr@gmail.com") %>'/>
</jsp:forward> --%>
<%-- <jsp:param name="id" value="admin"/>
	<jsp:param name="name" value='<%=java.net.URLEncoder.encode("YJY") %>'/> --%>

<%-- <jsp:include page="b.jsp">
	<jsp:param name="date" value="<%=java.util.Calendar.getInstance().getTime() %>"/>
</jsp:include> --%>
<%-- <jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
<h2>시간예시, useBean 사용하기</h2>
<h2><%=date %></h2> 


<jsp:useBean id="bean" class="ch04.com.dao.Calculator"></jsp:useBean>
<h2>process 라는 이름의 메서드 예시 useBean 사용하기</h2>
<h2<%int result = bean.process(5); %>></h2>
<h2><%= result %></h2>
<h2>================================================</h2>
<jsp:useBean id="power" class="ch04.com.dao.Calculator"></jsp:useBean>
<h2>power 라는 이름의 메서드 예시 useBean 사용하기</h2>
<h2<%int result2 = bean.power(5); %>></h2>
<h2><%= result2 %></h2> --%>

<jsp:useBean id="p1" class="ch04.com.dao.Person" scope="request"></jsp:useBean>
<h2>Person 이라는 이름의 클래스의 멤버 사용 예시 useBean으로 사용하기</h2>
	<%
		p1.setId("yjy"); 
		p1.setName("Yujin Yie"); 
		p1.setEmail("xhrtlr@gmail.com"); 
		
		
	%>
<jsp:useBean id="p2" class="ch04.com.dao.Person" scope="request"></jsp:useBean>
	<%
		p2.setId("yjh"); 
		p2.setName("Jeeho Yie"); 
		p2.setEmail("yjy0521@gmail.com"); 
	%>
<jsp:setProperty name= "p1" property ="id" value="yjy0521"/>
<jsp:setProperty name= "p1" property ="name" value="yjy2"/>
<jsp:setProperty name= "p1" property ="email" value="yjy0521@gmail.com"/>

<h2>
<jsp:getProperty name="p1" property="id"/> <br>
<jsp:getProperty name="p1" property="name"/><br>
<jsp:getProperty name="p1" property="email"/>
</h2>

<%-- <h2>아이디:  <%= p1.getId() %></h2>
<h2>이름: <%= p1.getName() %></h2>
<h2>이메일: <%= p1.getEmail() %></h2> --%>

<h2>아이디:  <%= p2.getId() %></h2>
<h2>이름: <%= p2.getName() %></h2>
<h2>이메일: <%= p2.getEmail() %></h2>



<jsp:useBean id="a1" class="dto.Animal" scope="request"></jsp:useBean>
<h2>======================================================</h2>
<h2>Animal 클래스 사용하기</h2>
<%
a1.setName("Shark"); 
a1.setArea("Ocean"); 
a1.setAge(3); 
%>
<h2>이름:  <%= a1.getName() %></h2>
<h2>사는곳: <%= a1.getArea() %></h2>
<h2>나이: <%= a1.getAge() %></h2>

</body>

</html>