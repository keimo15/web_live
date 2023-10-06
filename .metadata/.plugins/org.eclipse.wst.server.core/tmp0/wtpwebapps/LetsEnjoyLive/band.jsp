<%@page contentType="text/html;charset=utf-8" %>
<%@ page import="bean.*" %>
<jsp:useBean id="bdto" scope="request" class="bean.BandDTO" />
<jsp:useBean id="mdto" scope="request" class="bean.MembDTO" />
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="style.css" rel="stylesheet" type="text/css" media="all" />
	<title>邦ロックまとめサイト!!!_バンド</title>
</head>
<body>
	<div class = "header">
        <nav>
            <h2 class="logo">邦ロックまとめサイト!!!</h2>
            <ul>
                <li><a href="index.html">HOME</a></li>
                <li><a href="band.jsp">バンド</a></li>
                <li><a href="live.jsp">ライブ</a></li>
                <li><a href="place.jsp">会場</a></li>
                <li><a href="review.jsp">みんなの声</a></li>
            </ul>
        </nav>
    </div>

	<div class = "main">
	<div class = "search">
		<h3>指定のバンドを表示します</h3><br />
    		<form action="/LetsEnjoyLive/showband" method="post">
    		<input type="text" name="Band" />
    		<input type="submit" value="検索" />
    	</form><br />
    </div>
	<%
		if (bdto != null && bdto.size() > 0){
			BandBean bb = bdto.get(0);
			int i = 0;
			String[] Memb = bb.getMemb();
			String[] Part = bb.getPart();
	%>
		<h1 id="Name"><%= bb.getBand() %></h1>
		<div class="other">
		<h3>デビュー:　<%= bb.getDebut() %></h3>
		<h3>代表曲　:　<%= bb.getSong() %></h3>
		<h3>メンバー</h3>
		<%  
			while(Memb[i] != null){
		%>
		<h3>　　　　　<%= Part[i] %> <%= Memb[i] %></h3>
		<% i++;} %>
		</div>
	<% } %>
	</div>
</body>
</html>