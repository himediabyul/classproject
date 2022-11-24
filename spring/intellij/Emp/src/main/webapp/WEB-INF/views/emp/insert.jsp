<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 4:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--사원이름, 직함, 관리자번호, 날짜, 연봉, 상여, 부서번호--%>
<h1>사원 등록</h1>
<hr>
<form method="post">
  <table>
    <tr>
      <td>사원이름</td>
      <td><input type="text" name="ename"></td>
    </tr>
    <tr>
      <td>직함</td>
      <td><input type="radio" name="job" value="ANALYST"> ANALYST </td>
      <td><input type="radio" name="job" value="CLERK"> CLERK </td>
      <td><input type="radio" name="job" value="MANAGER"> MANAGER </td>
      <td><input type="radio" name="job" value="SALESMAN"> SALESMAN </td>
    </tr>
    <tr>
      <td>관리자번호</td>
      <td><input type="radio" name="mgr" value="7698">7698</td>
      <td><input type="radio" name="mgr" value="7698">7782</td>
      <td><input type="radio" name="mgr" value="7698">7788</td>
      <td><input type="radio" name="mgr" value="7698">7839</td>
      <td><input type="radio" name="mgr" value="7698">7902</td>
    </tr>
    <tr>
      <td>입사일</td>
      <td><input type="date" name="hiredate"></td>
    </tr>
    <tr>
      <td>연봉</td>
      <td><input type="text" name="sal"></td>
    </tr>
    <tr>
      <td>상여</td>
      <td><input type="text" name="comm"></td>
    </tr>
    <tr>
      <td>부서번호</td>
      <td><input type="radio" name="deptno">10</td>
      <td><input type="radio" name="deptno">20</td>
      <td><input type="radio" name="deptno">30</td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="등록"></td>
    </tr>
  </table>
</form>

</body>
</html>
