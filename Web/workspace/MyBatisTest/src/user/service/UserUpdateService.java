package user.service;

import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserUpdateService implements UserService  {

	@Override
	public void execute() {
		System.out.println("찾고자 하는 아이디를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		UserDAO userDAO = UserDAO.getInstance();
		UserDTO userDTO = userDAO.getUser(id);
		if(userDTO == null) {
			System.out.println("찾고자 하는 아이디가 없습니다.");
			return;
		}
		System.out.println(userDTO.getName() + "\t" + userDTO.getId() + "\t" + userDTO.getPwd());
		
		System.out.println("수정할 이름 입력:");
		String name = sc.next();
		System.out.println("수정할 비밀번호 입력: ");
		String pwd = sc.next();
		
		//넘길 수 있는 데이터는 1개 밖에 없기 때문에 뭉쳐줘야한다.
		userDTO.setName(name);
		userDTO.setPwd(pwd);
		userDAO.update(userDTO);
		
		System.out.println("회원정보가 수정되었습니다.");
		return;
	}
}
