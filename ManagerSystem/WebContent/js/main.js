	$(function(){
		$("#checkCode").click(function(){
			this.src="checkCodeServlet";
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
		$("#option1").click(function(){
			location.href="loginServlet.jsp";
		});
	});