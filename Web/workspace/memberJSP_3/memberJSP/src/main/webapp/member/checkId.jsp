<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.dao.MemberDAO"%>
<!--  <%@ page import="member.dao.MemberDAO" %>  --> 
    
   
    
    
<%
	// request response 등등 jsp가 내장객체로 가지고있다.
	String id = request.getParameter("id");
	
	//DB - 싱글톤으로 작성해야함 ( 메모리에 딱 한번만 만들어야함 (new를 한번만 생성)))
	// ==> 따라서 static으로 만들어야함.
	// id있는지 확인
	
	// MemberDAO memberDAO = new MemberDAO(); 이렇게 매번 new 하면 안됨
	// DB 싱글톤
	MemberDAO memberDAO = MemberDAO.getInstance();
	boolean exist = memberDAO.isExistId(id);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(exist){ %>
	<font color="red"><strong>선택하신 아이디 <%= id %>는 사용 불가능</strong></font>
	<br><br>
	<form action="checkId.jsp">
		<label>아이디</label>
		<input type="text" name="id">
		<input type="submit" value="중복체크">
	</form>
	
<%}else{  %>
	<font color="blue"><strong>선택하신 아이디 <%= id %>는 사용 가능</strong></font>
	<br><br>
	<input type="button" value="사용하기" onclick="checkIdClose('<%= id %>');">
<%} %>

<script>
	function checkIdClose(id){
		opener.document.getElementById("id").value = id;
		opener.document.getElementById("check").value = id;
		window.close();
		opener.document.getElementById("pwd").focus();
	}
	
	
</script>
</body>
</html>