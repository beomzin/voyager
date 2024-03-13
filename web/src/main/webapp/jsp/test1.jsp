<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- taglib : 커스텀 태그를 사용하겠다 -->
<!-- prefix : 사용할 태그 명칭 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- c:set => 변수 선언 -->
<c:set var="a" value="3"></c:set>
<%-- jsp 주석 --%>
<%-- ${} : EL Tag --%>
<%-- ${변수명} : 변수를 출력하겠다 --%>
<div>${a > 0}</div>
<%-- c:if => test를 시도해서 true이면 내용을 실행 --%>
<%-- gt : 크다, lt : 작다, eq : 같다, ne : 다르다 --%>
<c:if test="${a gt 0}">
a는 0보다 크다
</c:if>
<br/>
<%-- choose : 조건문 시작 --%>
<c:choose>
	<%-- when : if와 동일 --%>
	<c:when test="${a eq 0}">
		<input type="button" value="0" />
	</c:when>
	<%-- otherwise : else와 동일 --%>
	<c:otherwise>
		<input type="button" value="X" />
	</c:otherwise>
</c:choose>
<br/>
<%-- 반복문 --%>
<%-- var : 초기 변수 선언 --%>
<%-- begin : 시작값 --%>
<%-- end : 종료값 --%>
<%-- step : 증감값 --%>
<c:forEach var="i" begin="1" end="10" step="1">
	${i}<br/>
</c:forEach>
<br/>
<hr/>
구구단
<hr/>
<%-- 작업 --%>
<c:forEach var="i" begin="2" end="9" step="1">
		${i}단<br/><hr/>
	<c:forEach var="j" begin="1" end="9" step="1">
		${i} X ${j} = ${i*j}<br/>
	</c:forEach>
	<hr/>
</c:forEach>
<%-- import : 외부 파일을 불러옴. 해당 내용을 위치에 그대로 넣음. --%>
<c:import url="temp.jsp">
	<%-- param : 해당 주소에 값을 보낼 때 사용 --%>
	<%-- name : 키 --%>
	<%-- value, entity : 값 --%>
	<c:param name="msg">테스트</c:param>
</c:import>















</body>
</html>