i=10;
	function xun(){
		var butn=document.getElementById("pa");
		if(i>0){
			butn.innerHTML=i;
			i--;
		}else{
			butn.innerHTML="同意";
			butn.disabled=false;
			clearInterval(time);
		}
	}
	function run(){
		time=setInterval("xun()",1000);
	}
	run();