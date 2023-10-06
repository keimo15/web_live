<%@page contentType="text/html;charset=utf-8" %>
<%@ page import="bean.*" %>
<jsp:useBean id="ldtoD" scope="request" class="bean.LiveDTO" />
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="style.css" rel="stylesheet" type="text/css" media="all" />
    <title>邦ロックまとめサイト!!!_ライブ</title>
    
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
    	<div class = "Search">
    	<form action="/LetsEnjoyLive/showlive" method="post">
    		<h3>日付を選択</h3><br />
    		<input type="date" name="Date">
    		<input type="submit" value="検索" /><br />
    	</div>
    		<% for(int i=0; i<ldtoD.size(); i++) {
				LiveBean lb = ldtoD.get(i); %>
				<% if (i == 0) { %>
					<h2 id = "Name"><%= lb.getDate() %>のイベント</h2><br /><br />
				<% } %>
				<div class = "other">
				<h3>・<%= lb.getName() %><br /></h3>
				<h4>　出演者:　<%= lb.getBand() %></h4>
				<h4>　会場　:　<%= lb.getPlace() %></h4>
				</div>
			<% } %>
    	</form>
    </div>
</body>

</html>