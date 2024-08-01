<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>forward로 보내면 데이터는 공유한다. 주소는 forwardStart.jsp가 보이지만 결과는
		forwardEnd.jsp가 보인다.</h3>
	결과 : ${requestScope.list}
	<br>
	<br> 3번째 항목 = ${requestScope.list[2]}
	<br>
	<br>
	<c:forEach var="data" items="${list}">
		${data}
</c:forEach>
	<br>
	<c:forEach var="i" begin="0" end="6">
		${i + 1}번째 항목 = <c:out value="${list[i]}" />
		<br>
	</c:forEach>
	<br>
	<br> list2=${list2 }
	<!-- list2=    [com.jstl.PersonDTO@200d8b2f, com.jstl.PersonDTO@11a8399b, com.jstl.PersonDTO@14dd1ba] -->
	<br>
	<c:forEach var="personDTO" items="${list2}">
		이름 : ${personDTO.getName()} &emsp; 나이 = ${personDTO.getAge()}<br>
			<%--JSTL에서 메소드를 변수명처럼 사용 가능 --%>
		이름 : ${personDTO.name} &emsp; 나이 = ${personDTO.age}<br>
	</c:forEach>
</body>

</html>