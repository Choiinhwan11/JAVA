package collection;

import java.util.ArrayList;

public class PersonMain extends PersonDTO{
	public ArrayList<PersonDTO> init() {//메소드의 구현부
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("라이언", 30);
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		return list;
	}
	
	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();
		ArrayList<PersonDTO> list = personMain.init();
		System.out.println(list);
		System.out.println("toString 을 오버라이드 하기 전");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO.getName() + "\t" + personDTO.getAge());
		}
		System.out.println("toString 을 오버라이드 한 후");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO.toString());
		}
		
		
	}

}
