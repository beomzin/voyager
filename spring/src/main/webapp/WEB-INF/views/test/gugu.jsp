<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="resources/jquery/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#sendBtn").on("click", function() {
		if($("#dan").val() == "") {
			alert("값을 입력하세요.")
			
			$("#dan").focus();
		} else if (isNaN($("#dan").val())) {
			alert("숫자만 넣으세요.");
			$("#dan").val("");
			$("#dan").focus();
		} else {
			$("#goForm").submit();
		}
		
	});
	
});
</script>
</head>
<body>
<h1>구구단</h1>
<form action="gugures" id="goForm" method="post">
	<input type="text" name="dan" id="dan" />
	<input type="button" value="전송" id="sendBtn" />
</form>
</body>
</html>