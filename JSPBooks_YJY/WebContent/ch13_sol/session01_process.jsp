<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Session</title>
</head>
<body>
	<%
		
		String user_id4 = request.getParameter("id");
		String user_pw4 = request.getParameter("passwd");

		if (user_id4.equals("admin3") && user_pw4.equals("1234")) {
			session.setAttribute("userID4", user_id4);
			session.setAttribute("userPW4", user_pw4);
			out.println("세션 설정이 성공했습니다<br>");
			out.println(user_id4+"님 환영합니다");
		} else {
			out.println("세션 설정이 실패했습니다");
		}
	%>
</body>
</html>