<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="./jstlResult.jsp">
	<table boarder="1" cellpadding="5" >
		<tr>	
			<th width="70" >이름 </th>
			<td> <input type="text" name="age">
		
		</tr>
		<tr>	
			<th width="70">색깔</th>
			<td>
				<select name="color" id="color" style="">
					<optgroup>
						<option value="red">빨강</option>
						<option value="green">초</option>
						<option value="blue">파랑</option>
						<option value="magenta">보라</option>
						<option value="cyan">하늘</option>
				
					</optgroup>
				</select>
			</td>		
		</tr>
		<tr>
			<th>취미 </th>
			<td>
				<input type="checkbox" name="hobby" id="hobby1" value="독서"/>
				<lable for="hobby1">독서  </lable>
				<input type="checkbox" name="hobby" id="hobby2" value="영화 "/>
				<lable for="hobby2">"영화 "  </lable>
				<input type="checkbox" name="hobby" id="hobby3" value="게임 "/>
				<lable for="hobby3">게임  </lable>
				<input type="checkbox" name="hobby" id="hobby4" value="음악 "/>
				<lable for="hobby4">음악  </lable>
				<input type="checkbox" name="hobby" id="hobby5" value="쇼핑"/>
				<lable for="hobby5">쇼핑  </lable>
			</td>
		</tr>
		<tr>
			<td	colspan="2" align="center">
			<input type="submit" value="send">
			<input type="reset" value="cancle">
		</tr>
	</table>


</form>

</body>
</html>