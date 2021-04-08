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
<h2>회원정보 수정</h2>
<form name="form1" method="post" action="examSujungProc.do">
<table border="1" width="400">
<tr>
	<td>순번</td>
	<td><input type="hidden" name="no" id="no" value="${dto.no }">${dto.no }</td>
</tr>

<tr>
	<td>이름</td>
	<td><input type="text" name="name" id="name" value="${dto.name }"></td>
</tr>
<tr>
	<td>주민번호</td>
	<td><input type="text" name="jumin" id="jumin" value="${dto.jumin}"> </td>
</tr>
<tr>
	<td>성별</td>
	<td><input type="text" name="gender" id="gender" value="${dto.gender}"> </td>
</tr>
<tr>
	<td>나이</td>
	<td><input type="text" name="age" id="age" value="${dto.age }"></td>
</tr>
<tr>
	<td>등록일</td>
	<td>${dto.regi_date }
		<br>
		<fmt:formatDate value="${dto.regi_date }" pattern="yyyy-MM-dd"/>
	</td>
</tr>
<tr>
	<td colspan="2">
		<input type="button" value="목록으로" onclick="GoPage('examList','');">
		<input type="submit" value="수정">
	</td>
</tr>	
</table>
</form>
<script>
function GoPage(value1, value2){
	location.href=value1+".do";
};
</script>


</body>
</html>