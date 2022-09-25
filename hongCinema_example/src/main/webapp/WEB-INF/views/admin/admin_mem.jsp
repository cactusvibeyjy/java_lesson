<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="UTF-8">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<link rel="stylesheet" href="resources/css/admin_page.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<style>

  	#rectangle {
      width: 530px;
      height: 56px;
      background: #FF0000;
    }


.dropbtn {
    background-color: #00000;
    color: black;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}
.dropdown {
    position: relative;
    display: inline-block;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
.dropdown-content a:hover {
    background-color: #f1f1f1;
}
.dropdown:hover .dropdown-content {
    display: block;
}
.dropdown:hover .dropbtn {
    background-color: #f1f1f1;
    color:red;
}
</style>
    
    <title>관리자 페이지</title>
</head>

<body>
<%@ include file="../board/header.jsp" %>
<sec:authorize access="isAuthenticated()">
       	<sec:authentication property="principal.username" var="userid" />
       	<sec:authentication property="principal.member.userName" var="userName"/>
       	<sec:authentication property="principal.member.userEmail" var="userEmail"/>
       	<sec:authentication property="principal.member.userPhone" var="userPhone"/>
       	<sec:authentication property="principal.member.userGender" var="userGender"/>
       	<sec:authentication property="principal.member.userBirth" var="userBirth"/>
       	<sec:authentication property="principal.member.regDate" var="regDate"/>
       	<sec:authentication property="principal.member.updateDate" var="updateDate"/> 
		

    <div class="container">
        
       <!--  <ol class="breadcrumb" style="vertical-align: middle;">
            <li style="margin: 10px 0 -20px 10px; padding-bottom:-60px " class="breadcrumb-item"><a href="admin_mov">영화 관리</a></li>
            <li style="margin: 10px 0 -20px -128px; padding-bottom:-60px" class="breadcrumb-item"><a href="admin_res">예매 관리</a></li>
            <li style="margin: 10px 0 -20px -108px; padding-bottom:-60px" class="breadcrumb-item"><a href="admin_shw">상영 관리</a></li>
            <li style="margin: 10px 0 -20px -108px; padding-bottom:-60px" class="breadcrumb-item"><a href="admin_scr">상영관 관리</a></li>
            <li style="margin: 10px 0 -20px -88px; padding-bottom:-60px" class="breadcrumb-item"><a href="#">매출 관리</a></li>
            <li style="margin: 10px 0 -20px -108px; padding-bottom:-60px" class="breadcrumb-item active"><a href="admin_mem">회원 관리</a></li>
        </ol> -->
    
        
     <!-- <div id="rectangle" style="position:absolute; z-index:-1;"></div> -->
     <div class="dropdown">
      <button class="dropbtn">영화 관리</button>
      <div class="dropdown-content">
        <a href="admin_mov">영화 정보 등록</a>
        <a href="admin_movList">영화 정보 리스트</a>
      </div>
    </div>
    <div class="dropdown">
      <button class="dropbtn">예매 관리</button>
      <div class="dropdown-content">
        <a href="admin_res">예매 정보 리스트</a>
      </div>
    </div>
    <div class="dropdown">
      <button class="dropbtn">상영 관리</button>
      <div class="dropdown-content">
        <a href="admin_shw">상영 정보 등록</a>
        <a href="admin_shwList">상영 정보 리스트</a>
      </div>
    </div>
    <div class="dropdown">
      <button class="dropbtn">상영관 관리</button>
      <div class="dropdown-content">
        <a href="admin_scr">상영관 정보 등록</a>
        <a href="admin_scrList">상영관 정보 리스트</a>
      </div>
    </div>
    <div class="dropdown">
      <button class="dropbtn">회원 관리</button>
      <div class="dropdown-content">
        <a href="adminSignup">회원 등록</a>
        <a href="admin_mem">회원 정보 리스트</a>
      </div>
    </div>
    
    <div class="form-group">
		<select  style="width: 110px; float: right; margin-top:95px;" class="form-control" id="cntPerPage" name="sel" onchange="selChange()">
			<option value="5"
				<c:if test="${paging.cntPerPage == 5}">selected</c:if>>5개 보기</option>
			<option value="10"
				<c:if test="${paging.cntPerPage == 10}">selected</c:if>>10개 보기</option>
			<option value="15"
				<c:if test="${paging.cntPerPage == 15}">selected</c:if>>15개 보기</option>
			<option value="20"
				<c:if test="${paging.cntPerPage == 20}">selected</c:if>>20개 보기</option>
		</select>
		</div>
      
        <h4 style="font-weight: 600; margin-top: 100px;">회원 정보 리스트</h4>
        <hr color="black">
        <table class="table table-hover">
        <thead>
            <tr class="table-active">
              <th scope="col">아이디</th>
              <th scope="col">이름</th>
              <th scope="col">이메일</th>
              <th scope="col">성별</th>
              <th scope="col">휴대폰번호</th>
              <th scope="col">생년월일</th>
              <th scope="col">가입일</th>
              <th scope="col">업데이트</th>
              <th scope="col">수정/탈퇴</th>
            </tr>
          </thead>
          <tbody>
          <c:choose>
          <c:when test="${empty viewAll}" >
          <tr><td colspan="5" align="center">데이터가 없습니다.</td></tr> 
          </c:when>
		<c:when test="${!empty viewAll}"> 
		<c:forEach var="list" items="${viewAll}">

          <tr >
              <td style="vertical-align: middle;"><c:out value="${list.userid}"/></td>
              <td style="vertical-align: middle;"><c:out value="${list.userName}"/></td>
              <td style="vertical-align: middle;"><c:out value="${list.userEmail}"/></td>
              <td style="vertical-align: middle;"><c:out value="${list.userGender}"/></td>
              <td style="vertical-align: middle;"><c:out value="${list.userPhone}"/></td>
              <td style="vertical-align: middle;"><c:out value="${list.userBirth}"/></td>
              <td style="vertical-align: middle;"><fmt:formatDate value="${list.regDate}" pattern="yyyy-MM-dd"/></td>
              <td style="vertical-align: middle;"><fmt:formatDate value="${list.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
              <td>
              <button type="button" class="btn btn-outline-primary" onclick="location.href='/admin_modify_userInfo?userid=${list.userid}'">수정</button>
              <button type="button" class="btn btn-outline-primary" onclick="confirmDelete('/memberDelete?userid=${list.userid}&userpw=${list.userpw}')">탈퇴</button>
              </td>
            </tr> 
            </c:forEach>
           </c:when>
           </c:choose> 
          </tbody>
      </table>
      <hr color="lightgray">
      <input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
				
	<div >
		<ul style="width: 70px; margin: 0 auto;" class="pagination">
		<c:if test="${paging.startPage != 1 }">
    	<li class="page-item">
			<a class="page-link" href="/admin_mem?nowPage=${paging.startPage - 1 }&cntPerPage=${paging.cntPerPage}">&laquo;</a>
			</li>	
		</c:if>
		
		<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="p">
			<c:choose>
				<c:when test="${p == paging.nowPage }">
					<li class="page-item active">
					<a class="page-link" href="/admin_mem?nowPage=${p }&cntPerPage=${paging.cntPerPage}">${p }</a>
					</li>
				</c:when>
				<c:when test="${p != paging.nowPage }">
					<li class="page-item">
					<a class="page-link" href="/admin_mem?nowPage=${p }&cntPerPage=${paging.cntPerPage}">${p }</a>
					</li>
				</c:when>
			</c:choose>
		</c:forEach>
		<c:if test="${paging.endPage != paging.lastPage}">
		 <li class="page-item">
			<a class="page-link" href="/admin_movList?nowPage=${paging.endPage+1 }&cntPerPage=${paging.cntPerPage}">&raquo;</a>
    	</li>
		</c:if>
  </ul>
	
	</div>
      
      </div>
    
 </sec:authorize>     
   <!-- jQuery -->
	<script src="/resources/js/jquery-3.5.1.min.js"></script>   
    
    <script>
	function selChange() {
		var sel = document.getElementById('cntPerPage').value;
		location.href="admin_mem?nowPage=${paging.nowPage}&cntPerPage="+sel;
	}
	</script>  
    
    
    <script type="text/javascript">
    
    //탈퇴 버튼 이벤트
    function confirmDelete(url) {
        if (confirm("정말 탈퇴시키시겠습니까? 탈퇴하면 복구할 수 없습니다.")) {
        	alert("탈퇴되었습니다.");
        	window.location.replace(url);
        } else {
            false;
        }       
    };
    
    
  
    	
	</script>
      <%@ include file="../board/footer.jsp" %>
      </body>
      
      
      </html>