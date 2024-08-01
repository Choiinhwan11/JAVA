<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.bean.MemberDTO" 
		import= "member.dao.MemberDAO"
%>
<%  
 	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	MemberDAO memberDAO = MemberDAO.getInstance();
	MemberDTO memberDTO = memberDAO.select(id, pwd);
	String name = memberDTO.getName();
	String gender = memberDTO.getGender();
	String email1 = memberDTO.getEmail1();
	String email2 = memberDTO.getEmail2();
	String tel1 = memberDTO.getTel1();
	String tel2 = memberDTO.getTel2();
	String tel3 = memberDTO.getTel3();
	String zipcode = memberDTO.getZipcode();
	String addr1 = memberDTO.getAddr1();
	String addr2 = memberDTO.getAddr2();
%> 
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
<form id="updateForm" method="post" action="update.jsp" >
	<input type="hidden" name="id" value="<%=id%>">
	<input type="hidden" name="pwd"  value="<%=pwd%>">
	<table border="1" cellpadding="5">
		<tr>
			<td width="100">이름</td>
			<td>
			<input type="text" name="newName" id="name" placeholder="이름 입력" value="<%=name%>">
			<div id="nameDiv"></div>
		</tr>
		<tr>
			<td >아이디</td>
			<td>
			<input type="text" name="newId" id="id" placeholder="아이디 입력"  value="<%=id%>" readonly>
			<div id="idDiv"></div>
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
			<input type="password" name="newPwd" id="pwd" size="30" placeholder="비밀번호 입력">
			<div id="pwdDiv"></div>
			</td>
		</tr>
		<tr>
			<td>재확인</td>
			<td>
			<input type="password" name="newRepwd" id="repwd" size="30" placeholder="비밀번호 입력">
			<div id="repwdDiv"></div>
			</td>
		</tr>
		<tr>
			<th>재확인</th>
			<td>
				<input type="radio" id="male" name="newGender" value="0" 
				<%if(gender.equals("0")){%>
				 	checked
				<%} %>
				>
				<label for="male">남자</label>
				<input type="radio" id="female" name="newGender" value="1"
				<%if(gender.equals("1")){%>
				 	checked
				 <%} %>
				>
				<label for="female">여자</label>
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>
				<input type="text" name="newEmail1" id="email1" value="<%=email1%>">
				@
				<input type="text" name="newEmail2" id="email2" value="<%=email2%>">
  				<select  name="email3" id="email3" oninput="change()" >
					<option value="직접입력" >직접입력</option>
					<option value="hanmail.com"
					<%if(email2.equals("hanmail.com")){%>
				 	selected
				 	<%} %>
				 	>
				 	hanmail.com</option>
					<option value="naver.com"
					<%if(email2.equals("naver.com")){%>
				 	selected
				 	 <%} %>
				 	>
					naver.com</option>
					<option value="gmail.com"
					<%if(email2.equals("gmail.com")){%>
				 	selected
				 	 <%} %>
				 	>
					gmail.com</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>휴대전화</th>
			<td>
				<select name="newTel1">
					<option value=010
					<%if(tel1.equals("010")){%>
				 	selected
				 	 <%} %>
					>010</option>
					<option value=011
					<%if(tel1.equals("011")){%>
				 	selected
				 	 <%} %>
				 	>011</option>
					<option value=019
					<%if(tel1.equals("019")){%>
				 	selected
				 	<%} %>
				 	>019</option>
				</select>
				-
				<input type="text" name="newTel2" size="4" maxlength="4" value="<%=tel2%>">
				-
				<input type="text" name="newTel3" size="4" maxlength="4" value="<%=tel3%>">
			</td>
		</tr>
		<tr name="add">
      		<th>주소</th>
	        <td>
	          <input type="text" name="newZipcode" id="zipcode" value="<%=zipcode%>">
	          <button onclick="checkPost(); return false;">우편번호검색</button>
	          <input type="text" id="addr1" name="newAddr1" placeholder="주소" value="<%=addr1%>">
	          <input type="text" id="addr2" name="newAddr2" placeholder="상세주소" value="<%=addr2%>">
	        </td>
      </tr>
      <tr>
        <td colspan="2" style="text-align: center;">
          <input type="submit" value="회원정보수정" onclick="javascript:checkUpdate(); return false;">
          <input type="reset" value="다시입력">
        </td>
      </tr>
	</table>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script type="text/javascript" src="../js/update.js"></script>
</form>
</body>
</html>