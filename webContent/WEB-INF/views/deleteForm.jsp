<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
</head>
<body>

	<form action="/guestBook3/guest/delete" method="get" >
		<input type = "hidden" value = "${no }" name = "no">
		비밀번호 <input type = "password" name = "pass"><button type = "submit">확인</button>
	</form>
	<br><br>
	<a href = "./guest/main.jsp">메인으로 돌아가기</a>
</body>
</html>