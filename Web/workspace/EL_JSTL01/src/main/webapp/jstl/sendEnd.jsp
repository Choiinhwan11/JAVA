<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 결과=${param.list } --%>
<!--jstl  -->
<h3>
sendRedirect 로 보내면 테이터는 공유하지 않는다 . 
</h3>
결과 = ${requestScope.list }

</body>
</html>