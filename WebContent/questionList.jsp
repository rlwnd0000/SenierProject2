<%@ page import="ops.Notice.Beans.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Q&amp;A리스트</title>
<style>
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: center;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

a{text-decoration:none;
  color:black;
}
</style>
</head>
<body>
<div style="overflow-x:hidden">
<table border="1">	
	<c:forEach var = "questionList" items="${questionList}">
	<tr>
		<th>번호</th>	
		<th>제목</th>		
		<th>내용</th>
		<th>등록일</th>
	</tr>
	<tr>
		<td>${questionList.q_no}</td>
		<td><a href="questionDetail.no?q_no=${questionList.q_no}">${questionList.q_title}</a></td>
		<td>${questionList.q_content}</td>
		<td>${questionList.q_date}</td>
	</c:forEach>
</table>   
</div>
</body>
</html>