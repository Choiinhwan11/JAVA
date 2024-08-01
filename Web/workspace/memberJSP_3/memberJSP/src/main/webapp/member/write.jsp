<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  알파벳 순서 지켜줘야한다. bean > dao  -->
<%@ page import="member.bean.MemberDTO" %>
<%@ page import="member.dao.MemberDAO" %>

<%

 // 데이터
 // 위에 page에 잡은 UTF-8은 응답에 대한 한글처리
 // post 요청시 Tomcat 버전 낮으면 한글 깨진다
request.setCharacterEncoding("UTF-8"); 
//파라메타를 갖고 오기 위한 메서드 이다 . 
String name = request.getParameter("name"); 
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String gender = request.getParameter("gender");
String email1 = request.getParameter("email1");
String email2 = request.getParameter("email2");
String tel1 = request.getParameter("tel1");
String tel2 = request.getParameter("tel2");
String tel3 = request.getParameter("tel3");
String zipcode = request.getParameter("zipcode");
String addr1 = request.getParameter("addr1");
String addr2 = request.getParameter("addr2");
 
// DB - insert
MemberDTO memberDTO = new MemberDTO();//new 를 사용하여 메서드를 사용 하기 위한 셋 memberDTO 에다 저장을 위함이다. 
memberDTO.setName(name);
memberDTO.setId(id);
memberDTO.setPwd(pwd);
memberDTO.setGender(gender);
memberDTO.setEmail1(email1);
memberDTO.setEmail2(email2);
memberDTO.setTel1(tel1);
memberDTO.setTel2(tel2);
memberDTO.setTel3(tel3);
memberDTO.setZipcode(zipcode);
memberDTO.setAddr1(addr1);
memberDTO.setAddr2(addr2);

MemberDAO memberDAO = MemberDAO.getInstance();
//memberDAO 의 인스턴스를 갖고 오기 위해서 사용한다. 이때 함수 표시를 해줘야한다 .
//이때 메서드의내려받는 방식으로 이용한다 .다형성 이용 

int su = memberDAO.write(memberDTO);
//DAO에 저장 되어 있는write 를 갖고 오기 위해서사요아한다 . 


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(su == 1){ %>
	회원가입을 축하합니다.
<% }else { %>
	회원가입 안되었습니다. <br>
	다시 작성하세요
<%} %>
</body>
</html>