<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%! int count = 1;
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
%>
<meta charset="UTF-8">
<title>JSP KADAI</title>
</head>
<body>
	<h1> 訪問回数:<%=count%> </h1>
	<% count++; %>
	<p> 今日の日付:<%=sdf.format(date)%> <p>
</body>
</html>