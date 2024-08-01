<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
border-collapse: collapse;
}
div{
font-size : 8pt;
font-weight: bold;
color: red;
}
</style>
</head>
<body>
<form id="writeForm" method="post" action="write.jsp" >
	<input type="text" value="확인필요"  id="checkIdNum">
	<table border="1" cellpadding="5">
		<tr>
			<td width="100">이름</td>
			<td>
			<input type="text" name="name" id="name" placeholder="이름 입력">
			<div id="nameDiv"></div>
		</tr>
		<tr>
			<td >아이디</td>
			<td>
			<input type="text" name="id" id="id" placeholder="아이디 입력" oninput="idCheckPlease()">
			<button type="button" onclick="checkId(); return false;">중복체크</button>
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
		<tr>
			<td>재확인</td>
			<td>
			<input type="password" name="repwd" id="repwd" size="30" placeholder="비밀번호 입력">
			<div id="repwdDiv"></div>
			</td>
		</tr>
		<tr>
			<th>성별</th>
			<td>
				<input type="radio" id="male" name="gender" value="0" checked>
				<label for="male">남자</label>
				<input type="radio" id="female" name="gender" value="1">
				<label for="female">여자</label>
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>
				<input type="text" name="email1" id="email1">
				@
				<input type="text" name="email2" id="email2">
				
  				<select  name="email3" id="email3" oninput="change(); return false;" >
					<option value="직접입력" >직접입력</option>
					<option value="hanmail.com">hanmail.com</option>
					<option value="naver.com">naver.com</option>
					<option value="gmail.com">gmail.com</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>휴대전화</th>
			<td>
				<select name="tel1">
					<option value=010>010</option>
					<option value=011>011</option>
					<option value=019>019</option>
				</select>
				-
				<input type="text" name="tel2" size="4" maxlength="4">
				-
				<input type="text" name="tel3" size="4" maxlength="4">
			</td>
		</tr>
		<tr name="add">
      		<th>주소</th>
	        <td>
	          <input type="text" name="zipcode" id="zipcode">
	          <button onclick="checkPost(); return false;">우편번호검색</button>
	          <input type="text" id="addr1" name="addr1" placeholder="주소">
	          <input type="text" id="addr2"  name="addr2"placeholder="상세주소">
	        </td>
      </tr>
      <tr>
        <td colspan="2" style="text-align: center;">
          <input type="submit" value="회원가입" onclick="checkWrite(); return false;">
          <input type="reset" value="다시작성">
        </td>
      </tr>
		
	</table>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script type="text/javascript" src="../js/member.js"></script>
</form>
</body>
</html>