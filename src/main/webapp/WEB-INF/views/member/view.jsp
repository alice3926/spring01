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
<h2>회원등록</h2>
<table border="1" width="400">
<tr>
	<td>아이디</td>
	<td>${dto.id }</td>
</tr>
<tr>
	<td>비밀번호</td>
	<td>${dto.passwd} </td>
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
		<input type="button" value="수정으로" onclick="GoPage('memberSujung','${dto.id}');">
		<input type="button" value="삭제로" onclick="GoPage('memberSakje','${dto.id}');">
	</td>
</tr>	
</table>
<script>
function GoPage(value1, value2){
	location.href=value1+".do?id="+value2;
};
</script>


</body>
</html>