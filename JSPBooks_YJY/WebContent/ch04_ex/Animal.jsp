<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dao.AnimalRepository"%>
<%@ page import="dto.Animal"%>
<%-- <%@ include file="products.jsp" %> --%>

<jsp:useBean id="AnimalDAO" class="dao.AnimalRepository" scope="session" />

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 목록</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품목록</h1>
		</div>
	</div>
	<%
		ArrayList<Animal> listOfProducts = AnimalDAO.getAllProducts();
	%>

	<div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Animal a = listOfProducts.get(i);
			%>
			<div class="col-md-4">
				<h3>이름: <%=a.getName()%></h3>
				<p>사는 곳: <%=a.getArea()%>
				<p>나이: <%=a.getAge()%>
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
