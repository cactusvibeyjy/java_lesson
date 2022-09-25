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

	    if( loginForm.id.value == "" ) {
	    
	        loginForm.id.focus();
	        alert("id를 입력해 주십시오.");
	        
	        return false;
	        
	    }
	    
	}
	
</script>
<body>	
	<form name="loginForm" >
		<p>	아 이 디 : <input type="text" name="id">
		<p>	비밀번호 : <input type="password" name="passwd">
		<p>	<input type="submit" value="전송" onclick="CheckForm()">
	</form>
	
</body>
</html>