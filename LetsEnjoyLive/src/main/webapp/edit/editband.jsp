<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="bean.*" %>
<jsp:useBean id="bdto" scope="request" class="bean.BandDTO" />
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
		<th width="180">バンド名</th>
		<th width="60">デビュー年</th>
		<th width="120">代表曲</th>
		</tr><br />
	<% for(int i=0; i<bdto.size(); i++) {
		BandBean bb = bdto.get(i); %>
		<tr>
		<td align="center"><%= bb.getBand() %></td>
		<td align="center"><%= bb.getDebut() %>年</td>
		<td align="center"><%= bb.getSong() %></td>
		</tr>
	<% } %>
	</table><br/>
</body>
</html>