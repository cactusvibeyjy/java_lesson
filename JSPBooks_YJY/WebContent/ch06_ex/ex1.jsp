<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form 확인</title>
</head>
<body>
	<h2>Radio & Checkbox 확인</h2>
	<p> 성별 : <input type="radio" name ="sex" value = "Male" checked> Male
			 <input type="radio" name ="sex" value = "Female" checked> Female
	<p> 취미 : 독서<input type= "checkbox" name="hobby1" checked>
			  운동<input type= "checkbox" name="hobby2">
			  영화<input type= "checkbox" name="hobby3">
	<p><select name ="city" size ="3">
			<option value = "서울">서울</option>
			<option value = "경기도">경기도</option>
			<option value = "부산">부산</option>
			<option value = "대구">대구</option>
			<option value = "울산">울산</option>
	</select>
	


</body>
</html>