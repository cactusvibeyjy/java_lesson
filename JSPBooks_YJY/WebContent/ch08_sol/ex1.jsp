<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Validation</title>
</head>
<script type="text/javascript">
	/* function CheckForm() {
		alert("아이디 : " + document.loginForm.id.value + "\n" + 
				"비밀번호 : " + document.loginForm.passwd.value);
	} */
	function CheckForm() {

	/*     if( !isNaN(document.loginForm.name.value.substr(0,1))) {*/	
    var regExp = /^[a-z|A-z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
	var str = document.loginForm.name.value;
	if (!regExp.test(str)){
	alert("이름은 영대소문자 또는 한글로 시작.")	
	}
	
	var result = regExp.test(str);
/* 	var result = regExp.exec(str); */
		/* alert(result[0]); */
	       /*  loginForm.name.focus();
	        alert("이름은 숫자로 시작 할 수 없습니다.");
	        document.loginForm.name.select();
	        
	        return false;
	         */
	    
	    
	}
	
</script>
<body>	
	<form name="loginForm" >
		<p>	이 름 : <input type="text" name="name">
		<p>	비밀번호 : <input type="password" name="passwd">
		<p>	<input type="submit" value="전송" onclick="CheckForm()">
	</form>
	
</body>
</html>