package com.param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/param")
public class paramServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("nameI");
		int age = Integer.parseInt(request.getParameter("ageI"));
		String result = age >= 20 ? "성인" : "청소년"; 
		String back = "onclick=history.go(-1);";
//		String back = "onclick=javascript:location.href='http://localhost:8080/testServlet22/homework/param.html'";
		String str = "<html><head><meta charset=UTF-8>"
				+ "  <style>"
				+ "    span{"
				+ "      font-weight: bold;"
				+ "      font-size: 1.5em;"
				+ "      color: red;"
				+ "    }"
				+ "  </style>"
				+ "</head><body>나의 이름은 " + name + "이고, 나이는 " + age + "입니다. <br> 그래서 <span>"
				+ result 
				+ "</span>입니다."
				+ "<br><br>"
				+ "<input type='button' type='button' value='뒤로' "
				+ back
				+ ">"
				+ "</body></html>";
		
		response.setContentType("text/html; charset=UTF-8);");
		PrintWriter out = response.getWriter();
		out.println(str);

		
		
	}

}
