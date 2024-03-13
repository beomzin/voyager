<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border-collapse: collapse;
}

td, th {
	border: 1px solid #000;
}
</style>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
		</tr>
	</thead>
	<tbody>
	<!-- 목록형 데이터 list에서 하나씩 꺼내서 data란 이름으로 사용 -->
	<!--
		varStatus : 반복 시 상태 값 
		상태값.index : 인덱스 번호 취득
	-->
		<c:forEach var="data" items="${list}" varStatus="status">
			<tr>
				<td>${data.no},${status.index}</td>
				<td>${data.title}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>