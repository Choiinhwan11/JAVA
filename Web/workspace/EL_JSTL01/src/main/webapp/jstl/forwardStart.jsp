

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import ="java.util.List" %>
<%@page import="com.jstl.PersonDTO" %>

<%
//java 역활 아무것도 web 에 뿌려지지 않는다 . 


List<String>list = new ArrayList<String>();
list.add("호랑이 ");
list.add("사자");
list.add("기린");
list.add("코끼리");
list.add("타조");
list.add("코알라");
list.add("여우");



List<PersonDTO>list2 = new ArrayList<PersonDTO>();

PersonDTO aa = new PersonDTO("홍길동 ",25);
PersonDTO bb = new PersonDTO("뽀로",25);
PersonDTO cc = new PersonDTO("크롱",25);

list2.add(aa);
list2.add(bb);
list2.add(cc);

//페이지 이동 
//이동 하기 위해서  단순 이동을 위해서 

request.setAttribute("list",list);
request.setAttribute("list2",list2);



//<%--JSTL에서 메소드를 변수명 처럼 사용이 가능하다 . >


RequestDispatcher dispatcher=request.getRequestDispatcher("forwardEnd.jsp");  //forward와 같은 의미다 . 상대번지 
dispatcher.forward(request, response); //데터가 아닌 주소로 나오는 값이다 . 
//주소를 타고 넘어가기 위해서는 string타입   문자열만 가능하다 . 객체는 넘길 수없다 . 
//1.request하기 . session두가지로 가능 하긴하다 .session 은 잘 터짐 

%>
<%-- <jsp:forward page = "forwardEnd.jsp"/> --%>
<!-- 배열이 아닌 주소로 나온다 .  -->













