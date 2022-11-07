<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.sist.*"%>
    <%
    Music[] m=MusicSystem.musicList();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 <style type="text/css">
 .container{
 	margin-top: 50px;
 }
 .row{
 margin: 0px auto;
 width:850px;
 }
 </style>
</head>
<body>
	<div class="container">
		<div class="row">
		<table class="table">
		<tr class="success">
		<th class="text-center">순위</th>
		<th class="text-center"></th>
		<th class="text-center">곡명</th>
		<th class="text-center">가수명</th>
		</tr>
		<%
		for(Music mm:m)
		{
			%>
			<tr>
			<td class="text-center"><%=mm.mno %></td>
			<td class="text-center"></td>
			<img src="<%=mm.poster %>" width=35 height="35">
			<td><%=mm.title %></td>
			<td><%=mm.singer %></td>
			</tr>
			<%
		}
		%>
		</table>
		</div>
		</div>
</body>
</html>