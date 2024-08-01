<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import ="java.util.List" %>

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

//페이지 이동 
//이동 하기 위해서  단순 이동을 위해서 

request.setAttribute("list",list);


response.sendRedirect("./sendEnd.jsp");
//주소를 타고 넘어가기 위해서는 string타입   문자열만 가능하다 . 객체는 넘길 수없다 . 
//1.request하기 . session두가지로 가능 하긴하다 .session 은 잘 터짐 
%>