<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@  page import="member.dao.MemberDAO"
     import="member.bean.MemberDTO" 
     import="java.net.URLEncoder"
     %>
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
<% if(loginNum == 2) { 
	//민감한 부분에는 get방식을 쓰지 말자.
/* 	response.sendRedirect("loginOk.jsp?id=" + id + "&pwd=" + pwd + "&name=" + URLEncoder.encode(name,"UTF-8")); */
	//쿠키
	Cookie cookie = new Cookie("memName", "값");
	cookie.setMaxAge(30 * 60);//쿠키의 시간은 3초
	//클라이언트로 보내기 클라이언트에 저장.
	response.addCookie(cookie); 
	
	Cookie cookie2 = new Cookie("memId", "값");
	cookie.setMaxAge(30 * 60);//쿠키의 시간은 3초
	//클라이언트로 보내기 클라이언트에 저장.
	response.addCookie(cookie2); 
	//세션
//	HttpSession session = request.getSession();
	session.setAttribute("memName", name);
	session.setAttribute("memID", id);
	
	//페이지 이동
	response.sendRedirect("loginOk.jsp");
	
} else { 
	response.sendRedirect("loginFail.jsp");
  
 } %>
<script type="text/javascript" src="../js/login.js"></script>

</body>
</html>