<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page 
	import="board.bean.BoardDTO"
	import="board.dao.BoardDAO"
 %>
 <%@ page import="member.bean.MemberDTO" %>
<%@ page import="member.dao.MemberDAO" %>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
 <%
 	String subject = request.getParameter("subject");
 	String content = request.getParameter("content");
 	
	String name = (String)session.getAttribute("memName"); // 자식 = (자식)부모 => 다형성
	String id = (String)session.getAttribute("memId");	
 	String email = (String)session.getAttribute("memEmail");
 	
 	Map<String, String> map = new HashMap();
 	map.put("id", id);
 	map.put("name", name);
 	map.put("email", email);
 	map.put("subject", subject);
 	map.put("content", content);
 	
 	BoardDAO boardDAO = BoardDAO.getInstance();
 	boolean isWrite = boardDAO.boardWrite(map);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
window.onload=function(){

	alert("작성하신 글을 등록하였습니다.");
	location.href = "boardList.jsp?pg=1";
}
</script>


</body>
</html>