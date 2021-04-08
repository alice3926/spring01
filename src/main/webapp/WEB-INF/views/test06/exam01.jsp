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
<h2>test06.do / exam01.jsp</h2>

<form action="test06Proc.do" method="post">
상품분류 : <input type="text" name="pcode" id="pcode" value=""><br>
상품이름 : <input type="text" name="pname" id="pname" value=""><br>
상품가격 : <input type="text" name="pprice" id="pprice" value=""><br>
할인률 : <input type="text" name="salepercent" id="salepercent" value=""><br>
제조사 : <input type="text" name="pcompany" id="pcompany" value=""><br>

<input type="submit" value="확인">
</form>





</body>
</html>