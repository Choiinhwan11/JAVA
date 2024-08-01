<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page 
	import="board.bean.BoardDTO"
	import="board.dao.BoardDAO"
	import="java.util.List"
	import="java.text.SimpleDateFormat"
	%>
<%
	//데이터
	int pg = Integer.parseInt(request.getParameter("pg"));

	//페이징 처리
	int startNum = pg * 5 - 4;
	int endNum = pg * 5;
	
	BoardDAO boardDAO = BoardDAO.getInstance();
	int totalA = boardDAO.getTotalA();
	int totalP = (totalA + 4) / 5;

	//데이터 X
	List<BoardDTO> list = boardDAO.boardList(startNum,  endNum);
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        div{
            margin: 15px;
        }
        #currentPaging{
            color: red;
            cusor: pointer;
           	font-size:15px;
           	border: 1px solid red;
        }
        #Paging{
        	color: black;
        }
        #Paging:hover, #currentPaging:hover{
            text-decoration: underline;
        }
        span{
        	margin: 5px;
        	padding: 5px 10px 5px 10px;
        }
    </style>
</head>
<body>
<table border="1" cellpadding="7" frame="hsides" rules="rows">
	<tr>
		<th width="100">글번호</th>
		<th width="300">제목</th>
		<th width="150">작성자</th>
		<th width="150">작성일</th>
		<th width="100">조회수</th>
	</tr>
<%if(list != null){ %>
	<%for(BoardDTO boardDTO:list){ %>
		<tr>
			<td align="center"><%=boardDTO.getSeq() %></td>
			<td>
			<% for(int i = 0 ; i < boardDTO.getLev() ; i ++) {%>
				&emsp;
			<%} %>
			<%if(boardDTO.getLev()!= 0){ %>
				<img src="../image/reply.gif">
			<%} %>
			<%=boardDTO.getSubject() %>
			
			</td>
			<td><%=boardDTO.getName() %></td>
			<td><%=new SimpleDateFormat("YYYY.MM.dd.").format(boardDTO.getLogtime()) %></td>
			<td><%=boardDTO.getHit()%></td>
		</tr>
	<%} %>
<%} %>
</table>
<div style="text-align: center; width: 870px;">
<%for(int i = 1 ; i <= totalP ; i++){ %>
	<% if(pg == i) {%>
	<span id="currentPaging" onclick='location.href="./boardList.jsp?pg=<%=i%>"'><%=i%></span>
	<%}else{ %>
	<span id="Paging" onclick='location.href="./boardList.jsp?pg=<%=i%>"'><%=i%></span>
	<%} %>
<%} %>
</div>
</body>
</html>