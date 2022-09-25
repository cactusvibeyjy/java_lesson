<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../resources/css/bootstrap.min.css" />
<!-- <script type="text/javascript">
function checkForm() {
	if (!document.newMember.id.value) {
		alert("아이디를 입력하세요.");
		return false;
	}

	if (!document.newMember.password.value) {
		alert("비밀번호를 입력하세요.");
		return false;
	}

	if (document.newMember.password.value != document.newMember.password_confirm.value) {
		alert("비밀번호를 동일하게 입력하세요.");
		return false;
	}
}
</script> -->
<title>회원가입</title>
</head>
<body>
<section class="signup-wrap" style="text-align : center;">
<form name="newMember" class="form-horizontal"  action="processAddMember.jsp" method="post" onsubmit="return checkForm()">
            <div>
                <!--아이디,비번,비번재확인-->

                <h3>아이디</h3>
                <span class="signup-input">
                    <input id="signup-id" type="text"></input>
                    </span>
                    <span class="signup-at">
                
                 <select id="signup-domain" class="selectbox" name="domain" onchange="">
                        <option value="@naver.com">@naver.com</option>
                        <option value="@gmail.com">@gmail.com</option>
                        <option value="@daum.net">@daum.net</option>
                        <option value="@yahoo.com">@yahoo.com</option>
              
                        </span>
                        
                    </select>
               </span>

                <h3>비밀번호</h3>
                <span class="signup-input">
                    <input id="signup-pw" type="text"></input>
                    <span class="pw-lock"></span>
                </span>

                <h3>비밀번호 재확인</h3>
                <span class="signup-input">
                    <input id="signup-pww" type="text"></input>
                    <span class="pww-lock"></span>
                </span>

            </div>

            <div style="margin-top: 35px;">
                <!--이름,생년월일,성별,이메일-->
                <h3>이름</h3>
                <span class="signup-input">
                    <input id="signup-name" type="text"></input>
                </span>

                <h3>생년월일</h3>
                <span style="text-align : center;">
                    <span class="signup-input-birth">
                        <input id="signup-birth-yy" type="text" placeholder="년(4자)"></input>
                    </span>
                    <span class="signup-input-birth" style="margin-left: 10px;">
                        <select id="signup-birth-mm" class="selectbox" name="month" onchange="">
                            <option value="month">월</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                        </select>
                    </span>
                    <span class="signup-input-birth" style="margin-left: 10px;">
                        <input id="signup-birth-dd" type="text" placeholder="일"></input>
                    </span>
                </span>

                <h3>성별</h3>
                <span class="signup-input">
                    <select id="signup-gender" class="selectbox" name="gender" onchange="">
                        <option value="gender">성별</option>
                        <option value="man">남자</option>
                        <option value="woman">여자</option>
                        <option value="no">선택 안함</option>
                    </select>
                </span>

                <span class="choice">
                    <h3>본인 확인 이메일</h3>
                    <span>(선택)</span>
                </span>
                <span class="signup-input">
                    <input id="signup-email" type="text" placeholder="선택입력"></input>
                </span>

            </div>

            <div style="margin-top: 35px;">
                <!--휴대전화-->
                <h3>휴대전화</h3>
                <span class="signup-input">
                    <select id="signup-country" class="selectbox" name="country" onchange="">
                        <option value="ko">대한민국 +82</option>
                    </select>
                </span>
                <div style="text-align : center;">
                    <span class="signup-input" style="width:100%; margin: 10px 0px 0px 0px">
                        <input id="signup-phone" type="text" placeholder="전화번호 입력"></input>
                    </span>
                    <span class="cnum-btn-wrap">
                        <button id="cnum-btn">인증번호 받기</button>
                    </span>
                </div>
                
                <span class="signup-input-c" style="margin-top: 10px;">
                    <input id="signup-cnum" type="text" placeholder="인증번호 입력하세요"></input>
                </span>
            </div>

            <div>
                <!--가입하기-->
                <div class="signup-btn-wrap">
                    <button id="signup-btn">가입하기</button>
                </div>
            </div>
            </form>
        </section>

  
</body>
</html>