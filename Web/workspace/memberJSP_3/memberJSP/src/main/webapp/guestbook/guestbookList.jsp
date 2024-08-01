<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page
import="guestbook.bean.GuestbookDTO"
import="guestbook.dao.GuestbookDAO"
import="java.util.List"
import="java.util.ArrayList"
import="java.text.SimpleDateFormat"
 %>
 <%
 	int pg = Integer.parseInt(request.getParameter("pg"));
 
 	int endIndex = pg * 3;
 	int startIndex = endIndex - 2;
 	
 	GuestbookDAO gueustbookDAO = GuestbookDAO.getInstance();
 	List<GuestbookDTO> list = new ArrayList<>();
 	list = gueustbookDAO.guestbookList(startIndex, endIndex);
 	
 	int totalA = gueustbookDAO.totalA();
 	int totalP  = (totalA + 2) / 3;
 	
 %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
		#container{
			margin: 10px auto;
		}
		
		#pages > div{
			display:inline-block;
			margin:10px;
		}
		#pages{
			margin-top:10px;
			display:box;
			text-align: center;
			width:100%;
		}
		#currentPage{
			color: red;
			text-decoration: underline red;
		}
		#Page{
			color: black;
			text-decoration:  none;
		}
		a{
			text-decoration: none;
		}
		#guestbooks{
			margin:20px auto;
			display:flex;
			justify-content:center;
		}
	
		table, td{
			border: 1px solid #222;
			border-collapse: collapse;
			padding: 15px;
		}
	</style>
</head>
<body>
	<div id="container">
		<div id="pages">
			<%for(int i = 1 ; i <= totalP ; i++) {%>
				<%if(i == pg){ %>
					<div><a  id="currentPage" href="guestbookList.jsp?pg=<%=i%>">[<%=i%>]</a></div>
				<%}else{ %>
					<div><a  id="Page" href="guestbookList.jsp?pg=<%=i%>">[<%=i%>]</a></div>
				<%} %>	
			<%} %>
		</div>
		<% if(list!=null) {%>
		<% for(GuestbookDTO cc: list){ %>
		<div id="guestbooks" >
			<table>
				<tr>
					<td style="width: 100px;  text-align:center;">작성자</td>
					<td style="width: 100px;"><%= cc.getName() %></td>
					<td style="width: 100px;  text-align:center;">작성일</td>
					<td style="width: 100px;">
					<%=new SimpleDateFormat("YYYY.MM.dd").format(cc.getLogtime()) %>
					</td>
				</tr>
				<tr>
					<td style="text-align:center;">이메일</td>
					<td colspan="3"><%= cc.getEmail() %></td>
				</tr>
				<tr>
					<td style="text-align:center;">홈페이지</td>
					<td colspan="3"><%= cc.getHomepage() %></td>
				</tr>
				<tr>
					<td style="text-align:center;">제목</td>
					<td colspan="3"><%= cc.getSubject() %></td>
				</tr>
				<tr>
					<td colspan="4"><%= cc.getContent() %></td>
				</tr>
			</table>
				<hr id="selectedUnderline" style="display:none">
		</div>
		<%} %>
		<%} %>
	</div>
	<script>
		document.getElementById('guestbooks').addEventListener('mouseover', function(){
		    document.getElementById('selectedUnderline').style.display = 'box';
		    document.getElementById('selectedUnderline').style.color = 'red';
		});
	
	</script>
</body>
</html>