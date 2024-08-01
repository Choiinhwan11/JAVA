<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Document</title>
    <style>
        table, th, td{
            border: 1px solid black;
            border-collapse: collapse;
        }
        th{
            width: 80px;
        }
        td{
            width: 400px;
            padding: 3px;
        }
        #subject{
            width: 95%;
        }
        #email{
            width: 200px;
        }
        #homepage{
            width: 250px;
        }
        #subjectDiv, #contentDiv{
        	color: red;
        	font-size: 0.7em;
        }
    </style>
</head>
<body>
    <form id="guestbookWriteForm" action="guestbookWrite.jsp" method="post">
        <table>
            <tr>
                <th>작성자</th>
                <td><input name="name" id="name" type="text" placeholder="작성자 입력"></td>
            </tr>
            <tr>
                <th>이메일</th>
                <td><input name="email" id="email" type="email" placeholder="이메일 입력"></td>
            </tr>
            <tr>
                <th>홈페이지</th>
                <td><input name="homepage" id="homepage" type="text" value="http://"></td>
            </tr>
            <tr>
                <th>제목</th>
                <td><input name="subject" id="subject" type="text" placeholder="제목 입력">
                <div id="subjectDiv"></div></td>
            </tr>
            <tr>
                <th>내용</th>
                <td><textarea name="content" id="content" rows="10" cols="50"></textarea>
                <div id="contentDiv"></div></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;">
                    <input type="submit"  value="글작성" onclick="checkGuestbookWrite(); return false;">
                    <input type="reset"  value="다시작성">
                    <input type="button" onclick="location.href='guestbookList.jsp'" value="글목록">
                </td>
            </tr>
        </table>
    </form>
    <script type="text/javascript" src="../js/member.js"></script>
</body>
</html>