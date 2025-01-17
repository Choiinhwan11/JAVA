<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- utf 8로 셋 해준다 .  -->
    <%--  <%request.setCharacterEncoding("UTF-8"); %> --%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<fmt:requestEncoding value="UTF-8"/>
<body>
	<ul>
	   <li>이름 : ${param.name }</li>
	   <li>나이 : ${param.age }
	   <c:if test=" ${param.age>=19 }" >성인</c:if>
	   <c:if test="${param.age<19 ">청소년 </c:if>
	   </li>
	<!-- String color = request.getParameterValues <여러개를 배열로 받을때 사용한다. -->
	<li>
		<c:if test="${param.color =='red' }">빨강</c:if>
		<c:if test="${param.color =='green' }">초록 </c:if>
		<c:if test="${param.color =='blue' }">파랑 </c:if>
		<c:if test="${param.color =='magenta' }">보라 </c:if>
		<c:if test="${param.color =='cyan' }">하늘 </c:if>
	</li>
	<li>
		<c:choose>
			<c:when test="${param.color =='red'}">빨</c:when>
			<c:when test="${param.color =='green'}">초록</c:when>
			<c:when test="${param.color =='blue'}">파랑</c:when>
			<c:when test="${param.color =='magenta'}">보라</c:when>
			<c:otherwise>하늘 </c:otherwise>
		</c:choose>
	</li>
	<li>
	<!-- 배열일 경우에는 이렇게 사용한다.  -->
		${paramValues['hobby'][0] }
		${paramValues['hobby'][1] }
		${paramValues['hobby'][2] }
		${paramValues['hobby'][3] }
		${paramValues['hobby'][4] }
	<br/>
	<br/>
	<!-- 배열일 경우에는 이렇게 가능하다.  -->
		${paramValues.hobby[0]}
		${paramValues.hobby[1]}
		${paramValues.hobby[2]}
		${paramValues.hobby[3]}
		${paramValues.hobby[4]}
		
		<c:forEach var="data" items="${paramValues.hobby }">
		${data }
		</c:forEach>
		<br/>
	</li>	
	</ul>
	
	
	
</body>
</html>