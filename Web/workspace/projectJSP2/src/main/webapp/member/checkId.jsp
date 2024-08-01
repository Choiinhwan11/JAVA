<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.dao.MemberDAO"%>
<!-- 저장 한번 해봐 -->
<%
	String id = request.getParameter("id");
	MemberDAO memberDAO = MemberDAO.getInstance();
	boolean exist = memberDAO.isExistId(id); 
%>
<!DOCTYPE html>
<html>
<head><!-- FACET SETTING 도 변경해줘야해요 톰캣 10 은 6.0 이고 톰캣 9는 4.0 -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(exist) { %>
  <form action="checkId.jsp">
	  <font color="red"><strong>선택하신 아이디 <%= id %>은(는) 사용 불가능합니다.</strong></font>
	  <br>
	  <input type="text" name="id" value="<%= id %>">
	  <input type="submit" value="중복체크">
  </form>
<% } else {  %>
  <font color="blue"><strong>선택하신 아이디 <%= id %>은(는) 사용 가능합니다.</strong></font>
  <br><br>
  <input type="button" value="사용하기" onclick="checkIdClose('<%= id %>')">
  <div  id="asdf" ></div>
<% }  %>
<script type="text/javascript">
function checkIdClose(id){
	window.close();
	opener.document.getElementById("checkIdNum").value = "확인됨";
	opener.document.getElementById("idDiv").innerHTML = "";
	opener.document.getElementById("id").value = id;
	opener.document.getElementById("pwd").focus();
}
</script>
</body>
</html>