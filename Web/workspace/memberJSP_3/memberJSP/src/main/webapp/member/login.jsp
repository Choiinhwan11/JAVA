<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
<%@ page import="member.bean.MemberDTO" %>
<%@ page import="member.dao.MemberDAO" %>
<% 
	// 데이터 얻어오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	// DB -select
	MemberDAO memberDAO = MemberDAO.getInstance();
	MemberDTO memberDTO = memberDAO.login(id,pwd);

	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% if(memberDTO == null){
	// 페이지 이동
	response.sendRedirect("loginFail.jsp");	
 }else {
	// 페이지 이동 URLEncoder => java.net
	//response.sendRedirect("loginOk.jsp?name=" 
	//					+URLEncoder.encode(memberDTO.getName(),"UTF-8") 
	//					+"&id=" + id);	
	
	// 데이터를 쿠키와 세션에 실어준다.
	
	/*
	// 쿠키
	Cookie cookie = new Cookie("memName", memberDTO.getName()); // 쿠키라는걸 의미하기위해 mem붙여줌
	cookie.setMaxAge(30*60); // 초단위 30분 
	response.addCookie(cookie); // 클라이언트로 보내기
	
	Cookie cookie2 = new Cookie("memId", id);
	cookie2.setMaxAge(30*60); // 초단위 30분 
	response.addCookie(cookie2); // 클라이언트로 보내기
	
	*/
	
	// 세션 - 예민한 정보는 세션에 담아준다.
	// HttpSession session = request.getSession(); - JSP 내장객체
	session.setAttribute("memName", memberDTO.getName());
	session.setAttribute("memId", id);
	session.setAttribute("memEmail", memberDTO.getEmail1() + "@" + memberDTO.getEmail2());
	session.setAttribute("memMemberDTO", memberDTO);
	// 페이지 이동
	response.sendRedirect("loginOk.jsp"); 
			
							
	
	
} %>
	
	
</body>
</html>