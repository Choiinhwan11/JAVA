<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.bean.MemberDTO" %>
<%@ page import="member.dao.MemberDAO" %>
<% 	
	// 데이터
	String id = (String)session.getAttribute("memId");
	
	
	// DB
	MemberDAO memberDAO = MemberDAO.getInstance();
	MemberDTO memberDTO = memberDAO.getMember(id);
	
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border-collapse : collapse;
	}
	#updateForm div{
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
	<form name="updateForm" id="updateForm" method="post" action="update.jsp">
		<table border="1" cellpadding="10" >
			<tr>
				<th>이 름</td>
				<td width=400px>
					<input type="text" size="20" id="name" name="name" placeholder="이름 입력" value="<%=memberDTO.getName() %>">
					<div id="nameDiv"></div>
				</td>
			</tr>
			<tr>
				<th>아이디</td>
				<td>
					<input type="text" size="25" id="id" name="id" value="<%=memberDTO.getId() %>" readonly>
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
					<input type="radio" value="0" name="gender" id="gender_m">
					<label for="gender_m">남성</label>
					<input type="radio" value="1" name="gender" id="gender_f">
					<label for="gender_f">여성</label>
				</td>
			</tr>
			<tr>
				<th>이메일</td>
				<td>
					
						<input type="text" id="email1" name="email1" value="<%= memberDTO.getEmail1() %>">@
						<input type="text" id="email2" name="email2" value="<%= memberDTO.getEmail2() %>">
						
						
						
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
					<input style="font-size : 1em; width: 4em;" type="text" name="tel2" size="10" value="<%= memberDTO.getTel2() %>">
					<input style="font-size : 1em; width: 4em;" type="text" name="tel3" size="10" value="<%= memberDTO.getTel3() %>">
				</td>
			</tr>
			<tr>
				<th>주 소</td>
				<td>
					<div>
						<input type="text" name="zipcode" id="zipcode" readonly value="<%= memberDTO.getZipcode() %>">
						<input type="button" value="우편번호검색" onclick="checkPost()">
					</div>
					<div>
						<input style="width:100%;" type="text" name="addr1" id="addr1" placeholder="주소" readonly value="<%= memberDTO.getAddr1() %>">
					</div>
					<div>
						<input style="width:100%;" type="text" name="addr2" id="addr2" placeholder="상세주소" value="<%= memberDTO.getAddr2() %>">
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="회원정보수정" onclick="checkUpdate()">
					<input type="reset" value="다시입력" onclick="location.reload()">
				</td>
			</tr>
		</table>
	</form>
	
	<script>
		window.onload = function(){
			// radio는 배열의 값으로 넘어온다. 그래서 남자는 gender[0]. 여자는 gender[1]
			
		//		document.getElementById("gender_m").checked = true;
		//	} else{
		//		// document.getElementById("gender_f").checked = true;
		//		document.updateForm.gender[1].checked = true;
		//	}
			
			document.updateForm.gender['<%= memberDTO.getGender() %>'].checked = true;
			
			if('<%= memberDTO.getTel1() %>' == "010"){
				document.getElementById("tel").value = "010";
			}else if('<%= memberDTO.getTel1() %>' == "011"){
				document.getElementById("tel").value = "011";
			}else{
				document.getElementById("tel").value = "019";
			}
		}
		
	</script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="../js/member.js"></script>
</body>
</html>