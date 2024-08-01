<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	table, td{
	 border: 0.5px solid #222;
	 border-collapse: collapse;
	 padding : 5px
	}
	
</style>

<body>
<table>
	<%for(int num = 1 ; num <= 9 ; num++){ %>
	<tr>
	 	<%for(int dan = 2 ; dan <= 9 ; dan++) {%>
	 	<td><%=dan %> * <%= num%> = <%=dan * num %><br></td>
	 	<%}%>
	</tr>
	<%} %>
</table>
</body>
</html>