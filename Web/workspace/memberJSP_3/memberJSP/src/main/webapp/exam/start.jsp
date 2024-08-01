<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<font color="red">
	<b>
		start.jsp - send.jsp - sendResult.jsp 페이지를 이동합니다.<br>
		sendRedirect로 이동하므로 데이터는 공유하지 않습니다.<br>
		주소는 sendResult.jsp가 보인다.<br>
	</b>
</font>
<br>
<font color="blue">
	<b>
		start.jsp - send.jsp - sendResult.jsp 페이지를 이동합니다.<br>
		sendRedirect로 이동하므로 데이터는 공유하지 않습니다.<br>
		주소는 sendResult.jsp가 보인다.<br>
	</b>
</font>
<br>
<input type="button" value="sendRedirent" onclick="location.href='sendProc.jsp'">
<input type="button" value="forward" onclick="location.href='forwardProc.jsp'">

</body>
</html>