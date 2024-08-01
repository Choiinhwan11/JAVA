<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.dao.MemberDAO"%>
    <%@ page import="member.bean.MemberDTO" %>
<%
 	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	MemberDAO memberDAO = MemberDAO.getInstance();
 	int loginNum = memberDAO.login(id, pwd); 
	String name = memberDAO.select(id, pwd).getName();



%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
     input{
      border: 1px solid red;
      color: red;
      background-color: white;
    }
    div{
		font-size : 8pt;
		font-weight: bold;
		color: red;
		border: 1px solid #222;
	}
	*{
	margin: 10px;
	}
</style>
</head>
<body>
<% if(loginNum == 2) { %>
  <form name="login" action="updateForm.jsp">
	  <font color="red"><strong><%=name%>님 로그인 되었습니다.</strong></font>

	  <input type="submit" value="회원정보수정" onclick="goToUpdateForm(); return false;">
	  <input type="hidden" name="id" value="<%=id%>">
	  <input type="hidden" name="pwd"  value="<%=pwd%>">
  </form>
<% } else { %> 
  <font color="red" ><strong>
  <%if(loginNum == 1){ %>
  패스워드
  <%}else{ %>
  아이디
  <%}%>
  가 틀렸습니다. </strong></font>
  <br>
  <input type="button" value="뒤로가기" onclick="history.go(-1); return false;">
<% } %>
<script type="text/javascript" src="../js/login.js"></script>
</body>
</html>