<%@ page import="ops.Notice.Beans.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>공지리스트</title>
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
	<c:forEach var = "boardList" items="${boardList}">
	<tr>
		<th>번호</th>	
		<th>아이디</th>
		<th>제목</th>		
		<th>내용</th>
		<th>이미지</th>
		<th>작성일</th>
		<th>댓글</th>
		
	</tr>
	<tr>
		<td>${boardList.board_no}</td>
		<td>${boardList.board_id}</td>
		<td><a href="boardDetail.no?board_no=${boardList.board_no}">${boardList.board_title}</a></td>
		<td>${boardList.board_content}</td>
		<td>${boardList.board_img}</td>
		<td>${boardList.board_date}</td>
		<td>${boardList.board_reply}</td>
	</c:forEach>
</table>   
</div>
</body>
</html>