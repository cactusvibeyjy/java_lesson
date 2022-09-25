<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Scripting Tag</h2>
	
	
	
	<% 
		for(int i =0; i <= count; i++){
			if(i % 2 == 0)
			out.println("Test : " +i+"<br>");
		}
	%>
	<%-- 
	<%= count %>
	<br>
	<%= makeItLower("Hello World") %>
	<br>
	<%=name %>
	<br>
	<%= makeItUpper("hello world") %>
	--%>
	<br>
	<%= makeItUpper(address) %>
	<br>
	<%= sum(1,2) %>
	<h2>날짜 사용하기</h2>
	<%= new java.util.Date() %>
	<%
	out.println(sum(100,200));
	%>
	<%! int count =10;
		String name = "YJY";
		String address ="Masan Happo-gu Munhwa-dong";
		int sum(int a, int b){
			return a+b;
		}
		String makeItLower(String data){
			return data.toLowerCase();
		}
		
		String makeItUpper(String data2){
			return data2.toUpperCase();		
		}
		
		%>
		
		
</body>
</html>