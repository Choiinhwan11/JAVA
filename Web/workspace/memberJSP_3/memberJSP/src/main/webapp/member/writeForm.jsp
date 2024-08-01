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
	#form1 div{
		color: red;
		font-size : 14px;
		font-weight : bold;
	}
	#repwdDiv{
		color: blue;
		font-size : 14px;
		font-weight : bold;
	}
	
</style>
</head>
<body>
	<form id="form1" method="post" action="write.jsp">
		<table border="1" cellpadding="10" >
			<tr>
				<th>이 름</td>
				<td width=400px>
					<input type="text" size="20" id="name" name="name" placeholder="이름 입력">
					<div id="nameDiv"></div>
				</td>
			</tr>
			<tr>
				<th>아이디</td>
				<td>
					<input type="text" placeholder="아이디 입력" size="25" id="id" name="id" >
					<input type="button" value="중복체크" onclick="checkId()" >
					<!-- 중복체크 버튼을 안누르면 check 변수에는 어떤값도 없다. -->
					<!-- 중복체크 버튼을 누르면 check 변수에 id를 주자 -->
					<input type="hidden" id="check"> 
					<div id="idDiv"></div>
				</td>
			</tr>
			<tr>
				<th>비밀번호</td>
				<td>
					<input type="password" size="35" id="pwd" name="pwd">
					<div id="pwdDiv"></div>
				</td>
			</tr>
			<tr>
				<th>재확인</td>
				<td>
					<input type="password" size="35" id="repwd" name="repwd">
					<div id="repwdDiv"></div>
				</td>
			</tr>
			<tr>
				<th>성 별</td>
				<td>
					<input type="radio" value="0" name="gender" id="gender_m" checked>
					<label for="gender_m">남성</label>
					<input type="radio" value="1" name="gender" id="gender_f">
					<label for="gender_f">여성</label>
				</td>
			</tr>
			<tr>
				<th>이메일</td>
				<td>
					
						<input type="text" id="email1" name="email1" >@
						<input type="text" id="email2" name="email2" >
						
						<!-- 
						<input type="email" name="email3" list="email3_list" id="email3" onInput="change()" placeholder="직접입력">
						<datalist id="email3_list">
							<option value="">
							<option value="google.com" >
							<option value="naver.com" >
							<option value="hanmail.com" >
						</datalist>
						 --> 
						
						<select name="email3" id="email3" onchange="javascript:onChangeEmail()">
							<option>직접입력</option>
							<option value="naver.com">naver.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="hanmail.com">hanmail.com</option>
						</select>
						 
					
				</td>
			</tr>
			<tr>
				<th>휴대폰</td>
				<td>
					<select name="tel1" id="tel">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="019">019</option>
					</select>
					<input style="font-size : 1em; width: 4em;" type="text" name="tel2" size="10">
					<input style="font-size : 1em; width: 4em;" type="text" name="tel3" size="10">
				</td>
			</tr>
			<tr>
				<th>주 소</td>
				<td>
					<div>
						<input type="text" name="zipcode" id="zipcode" readonly>
						<input type="button" value="우편번호검색" onclick="checkPost()">
					</div>
					<div>
						<input style="width:100%;" type="text" name="addr1" id="addr1" placeholder="주소" readonly>
					</div>
					<div>
						<input style="width:100%;" type="text" name="addr2" id="addr2" placeholder="상세주소">
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="회원가입" onclick="checkWrite()">
					<input type="reset" value="다시작성">
				</td>
			</tr>
		</table>
	</form>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="../js/member.js"></script>
</body>
</html>