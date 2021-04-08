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
<form name="form1" method="post" action="examChugaProc.do">
<table border="1" width="400">
<tr>
	<td>이름</td>
	<td><input type="text" name="name" id="name" value=""></td>
</tr>
<tr>
	<td>주민번호</td>
	<td><input type="text" name="jumin" id="jumin" value=""></td>
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