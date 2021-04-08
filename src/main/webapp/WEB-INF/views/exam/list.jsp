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
<h2>회원목록</h2>
<table border="1" width="400">
<tr>
	<td>순번</td>
	<td>이름</td>
	<td>주민번호</td>
	<td>성별</td>
	<td>나이</td>
	<td>등록일</td>
	<td>수정 / 삭제</td>
</tr>
<c:forEach var="dto" items="${list }">
<tr>
	<td>
		<a href="examView.do?no=${dto.no }">${dto.no }</a>
	</td>
	<td>${dto.name }	</td>
	<td>${dto.jumin }	</td>
	<td>${dto.gender }	</td>
	<td>${dto.age }	</td>
	<td>${dto.regi_date }<br>
		<fmt:formatDate value="${dto.regi_date }" pattern="yyyy-MM-dd"/><br>
		<fmt:formatDate value="${dto.regi_date }" pattern="yyyy-MM-dd HH:mm:ss"/><br>
	</td>
	<td>	<a href="examSujung.do?no=${dto.no }">수정</a>
		<a href="examSakjeProc.do?no=${dto.no }">삭제</a>
	</td>
</tr>	
</c:forEach>
</table>

</body>
</html>