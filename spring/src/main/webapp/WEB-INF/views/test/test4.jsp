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
	   $("[type='button']").on("click", function() {
	      if($(this).val() == "가위") {
	         $("#num").val("1");
	      } else if($(this).val() == "바위") {
	         $("#num").val("2");
	      } else if($(this).val() == "보") {
	         $("#num").val("3");
	      }
	      $("#goForm").submit();
	   });
	});

</script>
</head>
<body>
<input type="button" value="가위" />
<input type="button" value="바위" />
<input type="button" value="보" />

<form action="test5" id="goForm" method="post">
<input type="hidden" id="num" name="num">
</form>
</body>
</html>