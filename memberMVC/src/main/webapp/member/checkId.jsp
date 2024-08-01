<%@page import="member.bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.dao.MemberDAO" %>
<%@ page import="member.dao.MemberDAO" %>   
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
	
	<c:if test="${exist }">exist</c:if>
	<c:if test="${not exist }">non exist</c:if>
	
<%-- <%
	String id = request.getParameter("id");

	//DB
	MemberDAO memberDAO = MemberDAO.getInstance(); //생성
	boolean exist = memberDAO.isExistId(id); //호출
	
%> --%>


	


<%-- 
	<c:choose>
	    <c:when test="${exist}">
	        <form action="checkId.jsp">
	            <font color="red"><strong>선택하신 아이디 ${MemberDTO.id}은 사용 불가능</strong></font>
	            <br><br>
	            아이디 <input type="text" name="id">
	            <input type="submit" value="중복체크">
	        </form>
	    </c:when>
	    <c:otherwise>
	        <font color="blue"><strong>선택하신 아이디 ${MemberDTO.id }은 사용 가능</strong></font>
	        <br><br>
	        <input type="button" value="사용하기" onclick="${MemberDTO.id }">
	    </c:otherwise>
	</c:choose>

 --%>









