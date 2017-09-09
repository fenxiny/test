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
		$(":text").blur(function(){
			$.post("checkUserNameServlet",{userName:this.value},function(data){
				if(data==1){
					$("#nameInfo").html("<font color='red'>用户名不能使用</font>");
				}else{
					$("#nameInfo").html("<font color='green'>用户名可以使用</font>");
				}
			});
		});
	});
</script>
</head>
<body>
	<form action="" method="post">
		账号:<input type="text" name="userName"/><span id="nameInfo"></span><br/>
		密码:<input type="password" name="userPwd"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>