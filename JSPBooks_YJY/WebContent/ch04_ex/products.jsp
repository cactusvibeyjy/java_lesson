<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<%@ include file="dbconn.jsp" %>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>상품 목록</title>
</head>
<body>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="center">
			
			<%
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				String sql = "select * from product";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
			%>
			<div class="col-md-4">
				<%-- <img src="c:/upload/<%=rs.getString("p_fileName")%>" style="width: 100%"> --%>
				<img src="./resources/images/<%=rs.getString("p_fileName")%>" style="width: 100%">
				<h3><%=rs.getString("a_name")%></h3>
				<p><%=rs.getString("a_age")%>
				<p><%=rs.getString("a_area")%>원
				
			</div>
			<%
				}
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			%>
		</div>
		<hr>
	</div>

</body>
</html>
