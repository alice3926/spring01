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
	<td>순번</td>
	<td>${dto.no }</td>
</tr>
<tr>
	<td>이름</td>
	<td>${dto.name} </td>
</tr>
<tr>
	<td>주민번호</td>
	<td>${dto.jumin }</td>
</tr>
<tr>
	<td>성별</td>
	<td>${dto.gender }</td>
</tr>
<tr>
	<td>나이</td>
	<td>${dto.age }</td>
</tr>
<tr>
	<td>등록일</td>
	<td>${dto.regi_date }<br>
		<fmt:formatDate value="${dto.regi_date }" pattern="yyyy-MM-dd"/>
	</td>
</tr>
<tr>
	<td colspan="2">
		<input type="button" value="목록으로" onclick="GoPage('examList','');">
		<input type="button" value="수정으로" onclick="GoPage('examSujung','${dto.no}');">
		<input type="button" value="삭제로" onclick="GoPage('examSakjeProc','${dto.no}');">
	</td>
</tr>	
</table>
<script>
function GoPage(value1, value2){
	location.href=value1+".do?no="+value2;
};
</script>


</body>
</html>