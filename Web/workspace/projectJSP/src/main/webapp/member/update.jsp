<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.dao.MemberDAO"%>
<%@ page import="member.bean.MemberDTO" %>
<%
	request.setCharacterEncoding("UTF-8");
   	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String newName = request.getParameter("newName");
	String newId = request.getParameter("newId");
	String newPwd = request.getParameter("newPwd");
	String newGender = request.getParameter("newGender");
	String newEmail1 = request.getParameter("newEmail1");
	String newEmail2 = request.getParameter("newEmail2");
	String newTel1 = request.getParameter("newTel1");
	String newTel2 = request.getParameter("newTel2");
	String newTel3 = request.getParameter("newTel3");
	String newZipcode = request.getParameter("newZipcode");
	String newAddr1 = request.getParameter("newAddr1");
	String newAddr2 = request.getParameter("newAddr2");
	
	MemberDTO newMemberDTO = new MemberDTO();
	
	newMemberDTO.setName(newName);
	newMemberDTO.setId(newId);
	newMemberDTO.setPwd(newPwd);
	newMemberDTO.setGender(newGender);
	newMemberDTO.setEmail1(newEmail1);
	newMemberDTO.setEmail2(newEmail2);
	newMemberDTO.setTel1(newTel1);
	newMemberDTO.setTel2(newTel2);
	newMemberDTO.setTel3(newTel3);
	newMemberDTO.setZipcode(newZipcode);
	newMemberDTO.setAddr1(newAddr1);
	newMemberDTO.setAddr2(newAddr2);
	MemberDAO memberDAO = MemberDAO.getInstance();
	boolean Update = memberDAO.Update(id, pwd, newMemberDTO);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <script>
 <%if(Update){%>
	alert("정보수정 되었습니다.");
	location.href="loginForm.jsp";
 <%}else{%>
	alert("업데이트가 되지 않았습니다.");
	window.close();
 <%}%>
 </script>
</body>
</html>