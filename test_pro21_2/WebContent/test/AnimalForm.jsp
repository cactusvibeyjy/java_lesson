<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
   request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동물 입출력 테스트</title>
<style>
   .text_center{
     text-align:center;
   }
</style>
</head>
<body>
	<form method="post"   action="${contextPath}/test/memberInfo.do">
	<h1  class="text_center">동물 info</h1>
	<table  align="center">
	   <tr>
	      <td width="200" align="right">이름</td>
	      <td width="400"><input type="text" name="name"></td>
	   </tr>
	   <tr>
	      <td width="200"><p align="right">나이</td>
	      <td width="400"><input type="text" name="age"></td>
	    </tr>
	    <tr>
	       <td width="200"><p align="right">지역</td>
	       <td width="400"><p><input type="text" name="local"></td>
	    </tr>
	   
	    <tr>
	       <td width="200"><p>&nbsp;</p></td>
	       <td width="400"><input type="submit" value="입력하기"><input type="reset" value="다시입력"></td>
	    </tr>
	</table>
	</form>
</body>
