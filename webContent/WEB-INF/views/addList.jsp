<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>
	<form action = "/guestBook3/guest/insert" method = "get">
	<table border="1" >
		<tbody style = "width: 600px;">
			<tr>
				<td>이름</td>
				<td><input type = "text" style = "width: 97%" name = "name"></td>
				
				<td>비밀번호</td>
				<td><input type = "text" style = "width: 97%" name = "password"></td>
			</tr>
			<tr>
				<td colspan = "4"><input type = "text" style = "width: 800px; height: 200px" name="content" ></td>
			</tr>
			<tr>
				<td colspan = "4"><button type = "submit"> 확인</td>
			</tr>
		</tbody>
	</table>
	</form>
	<br>
	
	<c:forEach items="${gList }" var="vo" varStatus="status">
	<table border = "1">
		<tr>
			<td> ${vo.no}</td>
			<td> ${vo.name}</td>
			<td> ${vo.reg_date}</td>
			<td><a href="/guestBook3/guest/deleteForm?no=${vo.no }">삭제</a></td>
		</tr>
			<td colspan="4" width = "1024px;" height = "45px;"> ${vo.content} </td>
		</tr>
	</table>
	</c:forEach>
	
</body>
</html>