<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	border-collapse : collapse;
	}
#loginForm div{
	color: red;
	font-size : 14px;
	font-weight : bold;
<!-- --> 
</style>
</head>
<body>
	<form name ="loginForm" method="post" id="loginForm" action="login.jsp">
		<table align="center" border="1" cellpadding="10">
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" placeholder="아이디 입력" size="25" id="id" name="id">
					<div id="idDiv"></div>
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" size="35" id="pwd" name="pwd">
					<div id="pwdDiv"></div>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="로그인" onclick="checkLogin()">
				<!-- 	<input type="reset" value="회원가입" onclick="openWriteForm()"> -->
					<input type="reset" value="회원가입" onclick="location.href='writeForm.jsp'">
					
				</td>
			</tr>
		</table>
	</form>
	<script src="../js/member.js"></script>
</body>
</html>