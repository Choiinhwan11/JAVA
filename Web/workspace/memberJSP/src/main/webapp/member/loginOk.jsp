<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = null;
	String id = null;
	
	// 쿠키
	/*
	Cookie[] ar = request.getCookies(); // 특정 쿠키만을 가져오지 못하고 모든 쿠키들을 다 가져온다.
	if(ar != null){ // ar == null (쿠키가 소멸됐다)
		for(int i=0 ; i<ar.length ; i++){
			String cookieName = ar[i].getName(); // 쿠키명
			String cookieValue = ar[i].getValue(); // 쿠키값
			
			System.out.println("쿠키명 = " + cookieName);
			System.out.println("쿠키값 = " + cookieValue);
			System.out.println();
			
			if(cookieName.equals("memName"))
				name = cookieValue;
			if(cookieName.equals("memId"))
				id = cookieValue;
		}// for
	}
	*/
	
	// 세션
	name = (String)session.getAttribute("memName"); // 자식 = (자식)부모 => 다형성
	id = (String)session.getAttribute("memId");	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>
	<img src="../image/img1.gif" width="30" heigth="30" alt="망상토끼" 
			onclick="location.href='../index.jsp'" style="cursor :pointer;">
	<%= name %>님 로그인
	<br><br>
	<input type="button" value="회원정보수정" onclick="location.href='updateForm.jsp'">
	<input type="button" value="로그아웃" onclick="location.href='logout.jsp'">
	</h3>

</body>
</html>