<%@ page import="com.firstcoding.firstapp.member.member" %>
<%@ page import="com.firstcoding.firstapp.product.Product" %><%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-09
  Time: 오후 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // request -> session -> application 찾는순서

    request.setAttribute("name", "손흥민");  // 다형성
    session.setAttribute("name", "이강인");

    member member = new member();
    member.setId("cool");
    member.setPw("1234");
    member.setName("COOL");

    session.setAttribute("member", member);

    session.setAttribute("product", new Product());

%>


<html>

<head>
    <title>Title</title>
</head>
<body>

     <h4>표현식 : <%= request.getAttribute("name")%></h4>
     <h4>표현언어 : ${requestScope.name}</h4>

     <h4>표현식 : <%= request.getAttribute("id")%></h4>  <%-- null표현 --%>
     <h4>표현언어 : ${requestScope.id}</h4> <%-- 공백 표현 --%>

     <h4> param (code) : ${param.code} </h4>

     <h4> pageContext : ${pageContext.request.requestURL} </h4>  <%-- url 출력 --%>
     <h4> pageContext : ${pageContext.request.requestURI} </h4>  <%-- url에서 뒤에 경로 출력 --%>
     <h4> pageContext : ${pageContext.request.contextPath} </h4>  <%-- test시 실제 운영되는 환경을 고려하여 contextPath를 붙여 경로설정 --%>
     <h4> contextPath : <%= request.getContextPath()%> </h4>

     <h4> sessionScope (name) : ${sessionScope.name}</h4>
     <h4> (name) : ${name}</h4>


     <hr>

     ${true} / ${false} / ${100} / ${1.2} / ${'손흥민'} / ${null}


     <hr>
     <h4>${sessionScope.member}</h4>
     <h4>${member} / ${member.id} / ${member.pw} / ${member.name} / ${member.info}</h4>


     <hr>
     <h4>첫번째 상품 : ${product.list[1]}, 가격 ${product.price}</h4>



</body>
</html>
