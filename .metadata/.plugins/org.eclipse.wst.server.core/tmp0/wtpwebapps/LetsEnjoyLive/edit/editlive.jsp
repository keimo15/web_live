<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="bean.*" %>
<jsp:useBean id="ldto" scope="request" class="bean.LiveDTO" />
<jsp:useBean id="msg"  scope="request" class="java.lang.String" />
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>表示画面</title>
</head>
<body>
	<h2><%= msg %></h2>
	<a href="/LetsEnjoyLive/edit/edit.html">戻る</a>
	<table border="0">
		<tr>
		<th width="180">イベント名</th>
		<th width="180">出演者</th>
		<th width="180">会場名</th>
		<th width="100">日付</th>
		</tr><br />
	<% for(int i=0; i<ldto.size(); i++) {
		LiveBean lb = ldto.get(i); %>
		<tr>
		<td align="center"><%= lb.getName() %></td>
		<td align="center"><%= lb.getBand() %></td>
		<td align="center"><%= lb.getPlace() %></td>
		<td align="center"><%= lb.getDate() %></td>
		</tr>
	<% } %>
	</table><br/>
</body>
</html>