package sungJuck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJuckDelete implements SungJuck {
	private String name;
	private Scanner sc = new Scanner(System.in);
	@Override
	public void excute(ArrayList<SungJuckDTO> list) {
		System.out.println("삭제할 이름을 입력: ");
		String name = sc.next();
		int count = 0;
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				count++;
			}
		}
		Iterator<SungJuckDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJuckDTO sungJuckDTO = it.next();
			if(sungJuckDTO.getName().equals(name)) {
				it.remove(); // it.next()로 전에 보관했던 항목을 지운다.
			}
		}
		if(count == 0) {
			System.out.println("회원의 정보가 없습니다");
		}else {
			System.out.println(count+ "건의 항목을 삭제하였습니다.");
		}
	}
}
