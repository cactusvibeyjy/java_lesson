<%@page import="java.util.List"%>
<%@page import="com.admin.service.event.db.AdminEventDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WILL CINEMA - 이벤트</title>

<script src="./js/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" href="./css/eventPast.css">
<style type="text/css">

input[type=text] {
	width: 240px;
	height: auto;
	line-height: normal;
	padding: .8em .5em;
	font-family: inherit;
	outline-style: none;
	-webkit-appearance: none;
	-moz-appearance: none;
	appearance: none;
	border: 1px solid #1c1c1c;
	color: #1c1c1c;
	font-size: 14px;
}

input[type=submit] {
	width: 100px;
	height: 40px;
	outline-style: none;
	-webkit-appearance: none;
	-moz-appearance: none;
	appearance: none;
	border: 1px solid #d7282d;
	background-color: #d7282d;
	font-family: inherit;
	font-size: 14px;
	color: #ffffff;
	letter-spacing: 2px;
}

div#goBack {
	text-align: center;
	background-color: #d7282d;
	padding: 20px;
	width: 250px;
	margin: 20px auto;
}

#goBack>a {
	color: #ffffff;
	font-size: 16px;
	letter-spacing: 2px;
	font-family: inherit;
	font-weight: 500;
}
</style>

<script type="text/javascript">
	function moreRead(){
		var viewCnt=5;
		var listLen=$('.event_list li').length; //현재 ul아래에 있는 li개수
		var startCnt=$('#startCnt').val(listLen).val(); //li개수=ajax에서 가져올 리스트의 시작행
		var item=$('#item').val();
		$.ajax({
			url:"./PastMore.ae",
			type:"post",
			data:{startCnt:startCnt,viewCnt:viewCnt, item:item},
			/* dataType:"JSON", */
			success:function(data){
				//https://maengdev.tistory.com/162 참고사이트
				//dataType:'json'(jQuery)으로 받지 않고,
				//순수 ajax를 통해 데이터를 받아왔을때는 eval함수를 써야된다
				//jquery의 ajax에서는 자체적으로 JSON Object로 변환 시켜줌
				var jData=eval(data);
				var cnt=jData.toString().split(',').length;
					$.each(jData,function(index,item){
						if(index>3){return false;} //4개까지 가져온다
						cnt=cnt-1;
						if(cnt==4||cnt!=1){//다음번에 불러올 페이지가 없으면
							$('.btn_view').hide();
						}else{//다음번에 불러올 페이지가 있으면
							$('.btn_view').fadeIn();
						}
						//ul id에 html코드를 붙인다
						$('.event_list').append("<li><a href='./EventDetail.ae?eventId="+item.num+"'>"
								+"<img src='./upload/"+item.image.split(',')[0]+"'></a>"
								+"<p>"+item.f_date+'~'+item.e_date+"</p></li>");
						
					});
				},
			error:function(request,status,error){
				alert("code = "+ request.status + " message = " + request.responseText + " error = " + error); // 실패 시 처리
               }
		});
	}
</script>
</head>
<%	
	//request.setCharacterEncoding("UTF-8");
	List eventList = (List)request.getAttribute("eventList");
	String item=request.getParameter("item");
	String keyward=(String)request.getAttribute("keyward");
	int viewList=3;//보여줄 이벤트 개수-1
	System.out.println("키워드:"+keyward);
	if(keyward==null){
		keyward="";
	}
%>
<body>


<%@ include file="../../include/header.jsp" %>
	<!-- 
		CSS li줄바꿈 처리
		li{float:left;width:100px;height:100px;background:#000;color:#fff;}
		li:nth-of-type(4n-3){background:red;display:block;content:"";clear:left;}
	 -->
	 <div id="oldOne">
		 <span id="pastEvent">지난 이벤트</span>
		 &nbsp;
		 <span id="inform">윌시네마에서 진행한 다양한 이벤트들을 확인해보세요</span>
	 </div>
	 <input type="hidden" id="startCnt" value="0">
	 <input type="hidden" id="viewCnt" value="4">
	 <input type="hidden" id="item" value="<%=item%>">
	<div class="event_cwrap">
	<div class="last_wrap">
		<ul class="last_event">
			<li><a href="./EventPast.ae?item=movie">영화</a></li>
			<li><a href="./EventPast.ae?item=preview">시사회/무대인사</a></li>
			<li><a href="./EventPast.ae?item=nevent">윌시 NOW</a></li>
			<li><a href="./EventPast.ae?item=collabo">제휴 할인</a></li>
		</ul>
	</div>
	<div class="eventheader">
		<span id="category">
		<%if(item.equals("movie") ){%>
			영화
		<%}else if(item.equals("preview") ){%>
			시사회/무대인사
		<%}else if(item.equals("nevent") ){%>
			윌시 NOW
		<%}else if(item.equals("collabo") ){%>
			제휴할인
		<%} %>
		</span>
		<form action="./EventPast.ae?item=<%=item %>" id="fr" method="post">
			<input type="text" name="keyward" value="<%=keyward%>">
			<input type="submit" value="검색">
		</form>
	</div>
	<%
		if(eventList.size()!=0){
	%>
	<ul class="event_list">
	<%
			for(int i=0; i<eventList.size(); i++){ //카테고리 리스트
				if(i>viewList){break;}
				AdminEventDTO aedto=(AdminEventDTO)eventList.get(i);
	%>
	
		<li>
			<a href="./EventDetail.ae?eventId=<%=aedto.getNum() %>" >
				<img src="./upload/<%=aedto.getImage().split(",")[0]%>">
			</a>
			<p><%=aedto.getF_date()%>~<%=aedto.getE_date()%></p>
		</il>
	<% }%>
	</ul>
		<%if(eventList.size()>4){//남아있는 이벤트가 있으면 %>
		<div class="btn_view">
			<a href="javascript:void(0);" onclick="moreRead();"><span>더보기</span></a>
		</div>
		<%}
		}else{%>
			진행되는 이벤트가 없습니다.
		<%}%>
		<br class="clear">
		<br>
		<br>
		<div id="goBack"><a href="./EventSummary.ae">이벤트 목록</a></div>
	</div>
	
	
	<%@ include file="../../include/footer.jsp" %>
</body>
</html>