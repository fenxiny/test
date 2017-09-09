<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
			<table style="width: 100%; align: center;" cellspacing="0" >
				<tr align="center">
					<td style="height: 40px;width: 100px">员工ID</td>
					<td style="height: 40px;width: 100px">时间</td>
					<td style="height: 40px;width: 100px">出勤情况</td>
				</tr>
				<c:forEach items="${sessionScope.listAttend}" var="b">
				<tr align="center">
						<td>${b.eid}</td>
						<td>${b.time }</td>
						<td>${b.result}</td>
				</tr>
				</c:forEach>
			</table>
</body>
</html>