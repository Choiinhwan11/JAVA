<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

#boardWriteForm  div {
	color: red;
	font-size: 8pt;
	font-weight: bold;
}
</style>
</head>
<body>
<form action="boardWrite.jsp" id="boardWriteForm" name="boardWriteForm" method="post">
	<h3>글쓰기</h3>
	<table border="1" cellpadding="7">
		<tr>
			<th width="100">제목</th>
			<td>
				<input type="text" name="subject" id="subject" size="45">
				<div id="subjectDiv"></div>
			</td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td>
				<textarea name="content" id="content" cols="50" rows="15"></textarea>
				<div id="contentDiv"></div>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="글쓰기" onclick="checkBoardWrite()">
				<input type="reset" value="다시작성">
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
function checkBoardWrite() {
	document.getElementById("subjectDiv").innerText = "";
	document.getElementById("contentDiv").innerText = "";
	
	if(document.boardWriteForm.subject.value == "")
		document.getElementById("subjectDiv").innerText = "제목 입력";
	
	else if(document.boardWriteForm.content.value == "")
		document.getElementById("contentDiv").innerText = "내용 입력";
	
	else
		document.boardWriteForm.submit();
}
</script>
</body>
</html>









