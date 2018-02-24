<%--
  Created by IntelliJ IDEA.
  User: tharindu
  Date: 2/24/18
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file=""%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%


    javax.servlet.http.Cookie cookie
            = new javax.servlet.http.Cookie("name", "value");

    // cookie.setXXX()

    response.addCookie(cookie);



%>



</body>
</html>
