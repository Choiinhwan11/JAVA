<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    //데이터
    //String id = request.getParameter("id");
    //String name = request.getParameter("name");

    String name = null;
    String id = null;
    //쿠키
    /* Cookie[] ar = request.getCookies();//특정 쿠키만을 가져오지 못하고, 그래서 모든 쿠키들을 다 가져온다.
    if(ar !=null){//쿠키가 null이 아니엿을때
        for(int i=0; i<ar.length; i++){
            String cookieName = ar[i].getName();//쿠키명꺼내기
            String cookieValue = ar[i].getValue();//쿠키값 꺼내기 

            System.out.println("쿠키명 = " + cookieName);
            System.out.println("쿠키값 = " + cookieValue);
            System.out.println();

            if(cookieName.equals("memName")){
                 name = cookieValue;
            }
            if(cookieName.equals("memId")){
                id = cookieValue;
            }
        }//for */
        //세션
        name = (String)session.getAttribute("memName");
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
	<img src="../image/apple.png" width="30" height="30" alt="apple" onclick="location.href='../index.jsp'" style="cursor:pointer">
	<font color="red"><strong><%=name%>님 로그인 되었습니다.</strong></font>
	<input type="submit" value="회원정보수정" onclick="location.href='updateForm.jsp'">
	<input type="button" value="로그아웃" onclick="location.href='logout.jsp'">
	</h3>
</body>
</html>