<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	当前访问时间是：
	<%
		java.text.SimpleDateFormat df ;
		df= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		out.print(df.format(new java.util.Date()));//得到当前时间，并输出页面
	%>
</body>
</html>