<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr align="center">
		<td width="50%">표현식</td>
		<td width="50%">값</td>
	</tr>
	
	<tr align="center">
		<td>\${25 + 3 }</td>
		<td>${25 + 3 }</td>
	</tr>
	
	<tr align="center">
		<td>\${25 / 3 }</td>
		<td>${25 / 3 }</td>
	</tr>
	
	<tr align="center">
		<td>\${25 % 3 }</td>
		<td>${25 % 3 }</td>
	</tr>
	
	<tr align="center">
		<td>\${25 mod 3 }</td>
		<td>${25 mod 3 }</td>
	</tr>
	
	<!-- > gt, < lt, >= ge, <= le, == eq, !== ne -->
	<tr align="center">
		<td>\${25 lt 3 }</td>
		<td>${25 < 3 }</td>
	</tr>
	
	<tr align="center">
		<td>\${25 gt 3 }</td>
		<td>${25 > 3 }</td>
	</tr>
	
	<tr align="center">
		<td>\${header['host'] }</td>
		<td>${header['host'] }</td>
	</tr>
	
	<tr align="center">
		<td>\${header.host }</td>
		<td>${header.host }</td>
	</tr>
	
	<tr align="center">
		<td>\${header['host'] }</td>
		<td>${header['host'] }</td>
	</tr>
</table>
</body>
</html>