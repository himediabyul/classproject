<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("now", new Date());
    %>

    ${now}

    <hr>

    <fmt:formatDate value="${now}" /><br>
    <fmt:formatDate value="${now}" type="date"/><br> <%-- 날짜만 --%>
    <fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
    <fmt:formatDate value="${now}" type="date" dateStyle="short"/><br>

    <h3>시간</h3>
    <fmt:formatDate value="${now}" type="time"/><br> <%-- 시간만 --%>
    <fmt:formatDate value="${now}" type="time" timeStyle="full"/><br>
    <fmt:formatDate value="${now}" type="time" timeStyle="short"/><br>

    <h3>both</h3>
    <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br> <%-- 날짜와 시간 모두 --%>

    <h3>패턴</h3>
    <fmt:formatDate value="${now}" pattern="yyyy. MM. dd H:mm:ss" /><br> <%-- mm소문자는 분표시, a는 오전or오후, H는 24시간기준 h는 12시간기준 --%>




</body>
</html>
