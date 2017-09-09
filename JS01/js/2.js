//定时器(setTimeout clearTimeout)
var i=1;
var time;
function demo2(){
	document.title=i;
	i++;
	if(i>=10){
		clearTimeout(time);
	}else{
		time=setTimeout("demo2()",1000);
	}
}

function demo4(){
	time=setInterval("demo3()",1000);
}

function demo3(){
	document.title=i;
	i++;
	if(i>=10){
		clearInterval(time);
	}else{
		if(time==undefined){
			time=setInterval("demo3()",1000);
		}
	}
}
