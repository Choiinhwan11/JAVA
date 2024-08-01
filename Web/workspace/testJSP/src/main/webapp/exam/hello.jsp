<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
//전역변수 , 1번만 실행
String name = "홍길동";
int sese = 0;
int age = 25;
%><%
//요청시마다 실행
age++;
sese--;
%>
<%sese += 3; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Hello JSP!!<br> 학워에 오지 않았지만 입실체크는 함. -->
<%--안녕하세요!! JSP!!<br> 학원에 오지 않고 안보임. 소스코도 안보임.--%>
나의 이름은 <%=name%> 입니다.<br><!-- -comple할 필요가 없어서 f5로 바로 최신화된다. -->
<% out.println("나의 이름은 " + name + "입니다."); %><br> <%--out 내장객체 9개의 내장객체를 가지고 있다.jsp는 compile하기 떄문에 무거워서 오류 2개가 생긴다. tymeleaf에서 react로 바뀌었따. --%>
<%--소스가 바뀔 떄만 컴파일 한다. -> tomcat이 껐다가 켜진다 --%>
내 나이는 <%=age %>살 입니다. <br> 
<% out.println("내 나이는 " + age + "살 입니다."); %>
내 sese는 <%=sese %>입니다.
</body>
</html>