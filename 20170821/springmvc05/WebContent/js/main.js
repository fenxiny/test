$(function(){
	$("#butt").click(function(){
		$.post("loadAll",{userName:"admin",userPwd:"hello"},function(data){
			var json=eval(data);
			var str="";
			for(var i=0;i<json.length;i++){
				str+=json[i].userId+"---"+json[i].userName+"--"+json[i].userPwd;
			}
			$("#dd").text(str);
		});
	});
	
	$("#butt1").click(function(){
		$.post("loadById",{id:10},function(data){
			var json=eval(data);
			var str=json.userId+"---"+json.userName+"--"+json.userPwd;
			$("#dd").text(str);
		});
	});
});