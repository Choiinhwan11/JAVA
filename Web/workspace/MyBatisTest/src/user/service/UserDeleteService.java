package user.service;

import java.util.List;
import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService  {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		/*
		 * 찾고자 하는 아이디가 없습니다.
		 * 
		 * 또는 
		 * 찾고자 하는 아이디 입력 : hong
		 * 회원 정보 삭제 완료
		 * */
		String name, id, pwd;
		System.out.println("찾고자 하는 아이디를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		id = sc.next();
		UserDAO userDAO = UserDAO.getInstance();
		List<UserDTO> list = userDAO.getUserList();
		for(UserDTO uu : list) {
			if(uu.getId().equals(id)) {
				userDAO.delete(id);
				System.out.println("회원 삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("찾으시는 회원이 없습니다.");
		return;
		
	}

}
