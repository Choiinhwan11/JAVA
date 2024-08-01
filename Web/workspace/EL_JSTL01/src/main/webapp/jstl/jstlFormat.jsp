<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




<!-- type 에 넘버를적을시 3자리마다쉼표를 찍어준다.  -->
	<fmt:formatNumber type="numbr" valuer="123456789"/>
	<fmt:formatNumber type="number" valuer="123456789.88"/>
	<fmt:formatNumber type="number" valuer="123456789.88"maxFractionDigits="1"/>
	
	<fmt:formatNumber type="numbr" valuer="12345.67" pattern="#.###"/>
	<fmt:formatNumber type="numbr" valuer="12345.678" pattern=.##/>
	<fmt:formatNumber type="numbr" valuer="123456789" pattern="#,###.##"/>
	
	<fmt:formatNumber type="numbr" valuer="0000,00" pattern="#,###.##"/>
	<fmt:formatNumber type="numbr" valuer="0000.00" pattern="0,000.00"/>
	<fmt:formatNumber type="numbr" valuer="0,000.00" pattern="000.00"/>
	
	<c:set var="now" value="<%= new java.util.Date() %>"/>
	<c:out value="${now }"/><br/>
	data: <fmt:formatDate value="${now}" type="date"/><br>
	time: <fmt:formatDate value="${now}" type="time "/><br>
	both: <fmt:formatDate value="${now}" type="both"/><br>
	
	<fmt:formatDate value="${now }"pattern="yyyy-MM-dd hh:mm" type="both"/><br>
	<fmt:formatDate value="${now }"pattern="yyyy-MM-dd" type="date"/><br>
	<fmt:formatDate value="${now }"pattern="yyyy-MM-dd E요일 a" type="date"/><br>
	<fmt:formatDate value="${now }"pattern="yyyy-mm-ss" type="date"/><br>
	
</body>
</html>