<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#sendBtn").on("click", function() {
		// submit() : form을 실행한다
		$("#goForm").submit();
	});
	
	$("#msg").on("keypress", function(event) {
		console.log(event.keyCode);
		if(event.keyCode == 13) {
			return false; // 엔터키 동작을 막음, 폼실행 X
		}
	});
});
</script>
</head>
<body>
<%-- form : 목적지에 엔티티에서 전송가능한 데이터(value와  name이 있음)를 전송하며 이동 --%>
<%-- action : 목적지 --%>
<%--
	전송방식
	get : 주소창의 주소를 통하여 전달 => 주소?키=값&키=값&...
	post : 주소 헤더를 통하여 전달 => 데이터 전달시 : [헤더]http://~~
	헤더 포함 내용 : 아이피, 맥주소(랜카드 정보), 브라우저 정보 등
 --%>
<%-- method : 전송방식결정. 기본 get --%>
<%--
	 form의 경우 input을 통하여 엔터를 입력받는 경우나
	type이 submit인 버튼일 경우 폼이 자동 실행 됨
--%>
<form action="test3.jsp" id="goForm" method="post">
	<input type="text" name="msg" id="msg" />
	<input type="button" value="전송" id="sendBtn" />
</form>
</body>
</html>