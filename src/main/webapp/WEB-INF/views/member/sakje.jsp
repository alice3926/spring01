<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/inc_menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원정보 삭제</h2>
<form name="form1" method="post" action="memberSakjeProc.do">
<table border="1" width="400">
<tr>
	<td>아이디</td>
	<td><input type="hidden" name="id" id="id" value="${dto.id }">${dto.id }</td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input type="password" name="passwd" id="passwd" value="${dto.passwd}"></td>
</tr>
<tr>
	<td>이름</td>
	<td>${dto.name }</td>
</tr>
<tr>
	<td>이메일</td>
	<td>${dto.email }</td>
</tr>
<tr>
	<td>등록일</td>
	<td>${dto.regi_date }</td>
</tr>
<tr>
	<td colspan="2">
		<input type="button" value="목록으로" onclick="GoPage('memberList','');">
		<input type="submit" value="삭제">
	</td>
</tr>	
</table>
<script>
function GoPage(value1, value2){
	location.href=value1+".do";
};
</script>


</body>
</html>