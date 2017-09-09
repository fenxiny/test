$(function(){
	$("#loginForm").submit(function(){
		var name=$(":text").val();
		var pwd=$(":password").val();
		var bool=true;
		if(name == ""){
			bool=false;
			$("#userNameInfo").html("<font color='red' size='-1'>账号不能为空</font>");
		}
		
		if(pwd==""){
			bool=false;
			$("#userPwdInfo").html("<font color='red' size='-1'>密码不能为空</font>");
		}
		return bool;
	});
	
	$("#addBookButton").click(function(){
		location.href="save.jsp";
	});
	
	$("#all").change(function(){
		var bool=this.checked;
		$(":checkbox[name='ids']").each(function(){
			this.checked=bool;
		});
	});
	
	$("#deleteForm").submit(function(){
		var bool=false;
		$(":checkbox[name='ids']").each(function(){
			if(this.checked){
				bool=true;
			}
		});
		if(!bool)
			alert("请选择需要删除的项!!!");
		return bool;
	});
});