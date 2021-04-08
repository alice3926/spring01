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


<h2>test06.do / exam02Result.jsp</h2>


<h2>상품분류 : ${dto.pcode }</h2>
<h2>상품이름 : ${dto.pname }</h2>
<h2>상품가격 : ${dto.pprice }</h2>
<h2>할인률 : ${dto.salepercent }</h2>
<h2>할인금액 : ${dto.saleamount }</h2>
<h2>제조사 : ${dto.pcompany }</h2>

</body>
</html>