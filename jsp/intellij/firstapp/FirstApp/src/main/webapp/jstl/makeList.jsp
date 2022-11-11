<%@ page import="java.util.ArrayList" %>
<%@ page import="com.firstcoding.firstapp.member.member" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <%

    List<member> members = new ArrayList<>();  //컬렉션 데이터 추가는 add
    members.add(new member("cool00","111","COOL0"));
    members.add(new member("cool01","111",null));
    members.add(new member("cool02","111","COOL2"));
    members.add(new member("cool03","111","COOL3"));
    members.add(new member("cool04","111",null));
    members.add(new member("cool05","111","COOL5"));
    members.add(new member("cool06","111","COOL6"));
    members.add(new member("cool07","111","COOL7"));
    members.add(new member("cool08","111",null));
    members.add(new member("cool09","111","COOL9"));

    session.setAttribute("members", members);  // 세션종료 후 list 재 사용시 session을 다시 불러와야함! 재시작!

  %>

</body>
</html>
