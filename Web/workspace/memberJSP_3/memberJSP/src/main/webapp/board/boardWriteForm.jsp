
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style>
    table, th, td{
      border: 1px solid #222;
      border-collapse: collapse;
      padding: 10px;
    }
    #lastTr{
      text-align: center;
    }
    #subjectDiv, #contentDiv{
    	color:red;
    	font-size:0.7em;
    }
    
  </style>
</head>
<body>
  <form name="boardWriteForm"  method="post" action="boardWrite.jsp">
  <h3>글쓰기</h3>
  <table>
    <tr>
      <th>제목</th>
      <td>
        <input type="text" name="subject" id="subject">
        <div id="subjectDiv"></div>
      </td>
    </tr>
    <tr>
      <th>내용</th>
      <td>
        <textarea rows="4" name="content" id="content"></textarea>
        <div id="contentDiv"></div>
      </td>
    </tr>
    <tr id="lastTr">
      <td colspan="2">
        <input type="button" onclick="checkBoardWrite(); return false;" value="제출">
        <input type="reset" value="초기화">
      </td>
    </tr>
  </table>
</form>
<script type="text/javascript" src="../js/member.js"></script>
</body>
</html>