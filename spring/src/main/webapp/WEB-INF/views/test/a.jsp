<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--
	Spring에서 resources경로 지정 시 주소창을 기준으로 상대경로 지정 
	=> resources가 들어올 경우 매핑을 연결 시켰기 때문
-->
<!-- 
	 현재주소 : http://localhost:8090/test/test
	 => http://localhost:8090/test/resources/jquery/jquery-1.12.4.js
 -->
<script type="text/javascript" src="resources/jquery/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#sendBtn").on("click", function() {
		$("#goForm").submit();
	});
	
});
</script>
</head>
<body>
Hi!<br/>

<!-- EL은 jstl선언 없이 사용가능 -->
<!-- Controller에서 넘어오는 것은 이전 화면에서 넘어오는 것이 아니기 때문에 param. 없이 호출해야 한다 -->
${msg}<br/>
<form action="test2" id="goForm" method="post">
	<input type="text" name="txt" />
	<input type="button" value="전송" id="sendBtn" />
</form>
</body>
</html>