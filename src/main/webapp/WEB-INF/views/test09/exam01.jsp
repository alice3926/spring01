<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/inc_menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
$(document).ready(function(){
    $("#btnLogin").click(function(){
      var id = $("#id").val();
      var name = $("#name").val();
      var email = $("#email").val();
      param = {"id": id, "name":name, "email":email};
      $.ajax({
         type: "post",
         data: param,
         url: "test09Proc.do",
         success: function(data){
                  $("#result").html("id: " + data.id + ", name: " + data.name + ",email: " + data.email);
               }         
      })
    });
 });


</script>






</head>
<body>
<h2> test09.do / exam01.jsp</h2>

<h2>로그인</h2>

id : <input type="text" name="id" id="id" value=""><br>
name : <input type="text" name="name" id="name" value=""><br>
email : <input type="text" name="email" id="email" value=""><br>
<input type="button" id="btnLogin" value="로그인">


<div id="result"></div>




</body>
</html>

