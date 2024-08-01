package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.control.CommandProcess;

import member.bean.MemberDTO;
import member.dao.MemberDAO;

public class CheckIdService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		//데이터 갖고오기 
		String id = request.getParameter("id");

		//DB
		MemberDAO memberDAO = MemberDAO.getInstance(); //생성
		boolean exist = memberDAO.isExistId(id); //호출
		
			
	return "member/CheckId.jsp";
		
		
		
		
		
	}

}
