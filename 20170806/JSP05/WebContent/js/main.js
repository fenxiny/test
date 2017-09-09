$(function(){
	$("#loginForm").submit(function(){
		var bool=true;
		var userName=$("input[name='userName']").val();
		var userPwd=$("input[name='userPwd']").val();
		if(userName.length<=0){
			bool=false;
			$("#userNameInfo").html("<font color='red'>账号不能为空</font>");
		}
		
		if(userPwd.length<=0){
			bool=false;
			$("#userPwdInfo").html("<font color='red'>密码不能为空</font>");
		}
		return bool;
	});
	
	$("#addBook").click(function(){
		location.href="save.jsp";
	});
	
	$("#saveBookForm").submit(function(){
		var bookPrice=$("input[name='bookPrice']").val();
		var bookPriceReg=/^\d{1,}.?\d{1,2}$/;
		var bool=bookPriceReg.test(bookPrice);
		if(!bool){
			$("#bookPriceInfo").html("<font color='red'>价格不合法</font>");
		}
		return bool;
	});
	
	$(":checkbox[name='all']").change(function(){
		var bool=this.checked;
		$(":checkbox[name='ids']").each(function(){
			this.checked=bool;
		});
	});
	
	$("#deleteBookForm").submit(function(){
		var bool=false;
		$(":checkbox[name='ids']").each(function(){
			if(this.checked){
				bool=true;
			}
		});
		if(!bool){
			alert("请选择需要删除的项");
		}
		return bool;
	});
});