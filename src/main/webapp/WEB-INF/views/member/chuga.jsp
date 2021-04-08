<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/inc_menu.jsp"></jsp:include>
<%-- <%@ include file="include/inc_menu.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>회원등록</h2>
<form name="form1" method="post" action="memberChugaProc.do">
<table border="1" width="400">
<tr>
	<td>아이디</td>
	<td><input type="text" name="id" id="id" value=""></td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input type="password" name="passwd" id="passwd" value=""></td>
</tr>
<tr>
	<td>이름</td>
	<td><input type="text" name="name" id="name" value=""></td>
</tr>
<tr>
	<td>이메일</td>
	<td><input type="text" name="email" id="email" value=""></td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" value="확인">
	</td>
</tr>	
</table>
</form>














</body>
</html>