<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.bean.MemberDTO" %>    
<%@ page import="member.dao.MemberDAO"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:choose>
    <c:when test="${su==1}">
        <!-- condition이 참인 경우 -->
        <!-- 이 경우에는 아이디가 유효한 경우이므로 아이디가 유효하다는 메시지를 표시할 수 있습니다. -->
        <p>아이디가 유효합니다.</p>
    </c:when>
    <c:otherwise>
        <!-- condition이 거짓인 경우 -->
        <!-- 이 경우에는 아이디가 유효하지 않은 경우이므로 아이디가 유효하지 않다는 메시지를 표시할 수 있습니다. -->
        <p>e다시  작성 하세요 </p>
    </c:otherwise>
</c:choose>


</body>
</html>











