<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#checkCode").click(function(){
			var d=new Date();
			this.src="checkCodeServlet?haha="+d.getTime();
		});
		
		$(":text[name='userCode']").blur(function(){
			$.post("validationCheckCodeServlet",{userCode:this.value},function(data){
				if(data==1){
					$("#codeInfo").html("<font color='red' size='-1'>验证码错误</font>");
				}else{
					$("#codeInfo").html("<font color='green' size='-1'>验证码正确</font>");
				}
			});
		});
	});
</script>
</head>
<body>
	<form action="loginServlet" method="post">
		账号:<input type="text" name="userName"/><br/>
		密码:<input type="password" name="userPwd"/><br/>
		验证码:<input type="text" name="userCode"/>
		<img src="checkCodeServlet" width="120" height="25" align="top" id="checkCode"/><br/>
		<span id="codeInfo"></span><br/>
		<input type="submit" value="确定"/>
	</form>
</body>
</html>