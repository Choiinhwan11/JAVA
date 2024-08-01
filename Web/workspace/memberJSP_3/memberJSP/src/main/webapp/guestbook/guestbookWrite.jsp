<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page
import="guestbook.bean.GuestbookDTO"
import="guestbook.dao.GuestbookDAO"
 %>
 <%
	String name = (String)session.getAttribute("memName");
 	String email = (String)session.getAttribute("memEmail");
 	
 	String homepage = request.getParameter("homepage");
 	String subject = request.getParameter("subject");
 	String content = request.getParameter("content");
 	
 	GuestbookDTO guestbookDTO = new GuestbookDTO();
 	
 	guestbookDTO.setName(name);
 	guestbookDTO.setEmail(email);
 	guestbookDTO.setHomepage(homepage);
 	guestbookDTO.setSubject(subject);
 	guestbookDTO.setContent(content);
 	
 	GuestbookDAO guestbookDAO = GuestbookDAO.getInstance();
 	boolean isWrite = guestbookDAO.isWrite(guestbookDTO);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(isWrite == true){ %>
작성하신 글을 등록하였습니다.
<input type="button" onclick="location.href='guestbookList.jsp?pg=1'" value="방명록입장">
<% }%>
</body>
</html>