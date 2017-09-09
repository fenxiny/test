//不需要定义script标签
//全局变量
//支持对象
//var num=10;
function demo(){
	//局部变量 var num=10;
	
	//全局变量
	//num=10;
	//数据类型转换
	//parseFloat(); 将字符串转换成float
	//parseInt(); 将字符串转换成int
	//alert(parseFloat(num)+10);
	//alert(parseInt(num)+10);
	//变量
	//alert(num+10);
	//链式结构(栈结构)
	//demo1();
	//控制流程(if switch 循环)
	
	//if(1==1){
		//var num=10;
	//}
	
	//alert(num+10);
	
	//demo1();

	//得到文本框的数据
	//document(html页面的所有的元素) ID 元素的唯一标识(ID不可以重复的)
	//text变量 只想了ID为userName的元素
	//var text=document.getElementById("userName");
	//var textValue=text.value;
	//if(parseInt(textValue)>18){
		//alert("可以注册");
	//}else{
		//alert("不可以注册");
	//}
	
	/*
	var week=3;
	switch(week){
		case 1:
		    alert("星期一");
			break;
		case 2:
			alert("星期二");
			break;
		case 3:
			alert("星期三");
			break;
		case 4:
			alert("星期四");
			break;
	}
	*/
	
	//循环
	/*
	for(var i=0;i<10;i++){
		alert(i);
	}
	*/
	
	//运算符(算术，关系，位，逻辑， 赋值)
	//算术运算符(+,-,*,/,% ++ --)
	//关系运算符(> < >= <= != ==  === !==)
	//var num=10;
	//var num1="10";
	//== 判断两个数据之间的值是否一致(忽略类型)
	//!= 判断两个数据之间的值是否不一致
	//if(num==num1){
		//alert("相等");
	//}else{
		//alert("不想等");
	//}
	//=== 判断两个数据的类型和值是否都相等
	//!== 
	//if(num===num1){
		//alert("相等");
	//}else{
		//alert("不想等");
	//}
	
	//位运算符(& | ^ >> <<)
	
	//var num=10;
	//var num1=2;
	
	//alert(num&num1);
	//alert(num|num1);
	//alert(num^num1);
	//alert(num>>2);
	//alert(num>>>2);
	//alert(num<<2);
	
	//逻辑运算符(链接多个关系表达式的)
	//&& || !
	//var bool=10>2 && 2>3;
	//alert(bool);
	
	//赋值运算符(=)
	//var n=10;
	
	//自增自减
	//var num=10;
	//alert(num++);
	//alert(num);
	//alert(++num);
	//alert(num);
	
	//条件表达式(三目运算符)
	//var str=10>2?"hello":"你好";
	//alert(str);
	
}

function demo1(){
	//访问不到demo函数内部定义的num局部变量
	alert(num+20);
}
