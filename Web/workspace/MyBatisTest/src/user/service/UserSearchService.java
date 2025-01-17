package user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserSearchService implements UserService  {

	@Override
	public void execute() {
		/*
		 * 1.이름 검색
		 * 2. 아이디 검색
		 * 번호 입력 : 1
		 * 
		 * 검색할 이름 입력 : 동
		 * 홍길동 hong 111
		 * 희동 hee 111
		 * 
		 * 검색할 이름 입력 : n
		 * 홍길동 hong 111
		 * 코난 conan 111
		 * 
		 * 1번이건 2번이건 userDAO.search()메소드 처리.
		 * 
		 * userMapper.xml <select id="search"> 1개만 작성 xml 안에서 if를 검색해서 쓰세요.
		 * if문을 안쓰고 검색하는 방법도 있다.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("**********");
		System.out.println("1. 이름 검색");
		System.out.println("2. 아이디 검색");
		System.out.println("**********");
		System.out.println("번호 입력 : ");
		int num = sc.nextInt();
		String columnName = null;
		String value = null;
		
		if(num == 1) {
			System.out.print("검색할 이름 입력 : ");
			value = sc.next();
			columnName = "name";
		}else if(num == 2) {
			System.out.print("검색할 아이디 입력 : ");
			value = sc.next();
			columnName = "id";
		}
		//db
		UserDAO userDAO = UserDAO.getInstance();
		Map<String, String> map= new HashMap();
		map.put("columnName", columnName);
		map.put("value", value);
		List<UserDTO> list =  userDAO.search(map);
		for(UserDTO userDTO : list) {
			System.out.println(userDTO.getName() + "\t" + userDTO.getId() + "\t" + userDTO.getPwd());
		}
		
		
		
	}

}
