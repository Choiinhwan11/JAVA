<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    #button input{
      border: 1px solid red;
      color: red;
      background-color: white;
    }
    input[type="text"],input[type="password"]{
	    width: 200px;
    }
    div{
		font-size : 8pt;
		font-weight: bold;
		color: red;
	}
</style>
</head>
<body>
 <form name="loginForm" id="loginForm" method="post" action="login.jsp" >
    <table cellpadding="5">
      <tr>
        <td >아이디</td>
        <td>
        <input type="text" name="id" id="id" placeholder="아이디 입력">
        <div id="idDiv"></div>
        </td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td>
        <input type="password" name="pwd" id="pwd" size="30" placeholder="비밀번호 입력">
        <div id="pwdDiv"></div>
        </td>
      </tr>
      <tr id="button">
        <td colspan="2" style="text-align: center;">
          <input type="submit" value="로그인" onclick="checkLogin(); return false;" >
          <input type="button" value="회원가입" onclick="location.href='writeForm.jsp'">
        </td>
      </tr>
    </table>
    <script type="text/javascript" src="../js/login.js"></script>
 </form>
</body>
</html>