<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/inc_menu.jsp"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>test05.do / exam01Result.jsp</h2>


<h2>이름 : ${dto.name }</h2>
<h2>국어 : ${dto.kor }</h2>
<h2>영어 : ${dto.eng }</h2>
<h2>수학 : ${dto.mat }</h2>
<h2>과학 : ${dto.sci }</h2>
<h2>역사 : ${dto.his }</h2>
<h2>총점 : ${dto.tot }</h2>
<h2>평균 : ${dto.avg }</h2>

</body>
</html>