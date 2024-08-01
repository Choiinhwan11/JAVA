package sungJuck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SungJuckSort  implements SungJuck{
	@Override
	public void excute(ArrayList<SungJuckDTO> list) {
		System.out.println("1.총점으로 정렬");
		System.out.println("2.이름으로 절렬");
		System.out.println("3.이전 메뉴로");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1) {
//			totSort(list);
			Collections.sort(list);
		}else if(n == 2) {
//			nameSort(list);
			Comparator<SungJuckDTO> com = new Comparator<SungJuckDTO>() {
				@Override
				public int compare(SungJuckDTO s1, SungJuckDTO s2) {
					return s1.getName().compareTo(s2.getName());
				}
			};
			Collections.sort(list, com);
			
		}else {
			return;
		}
	}
//	private void totSort(ArrayList<SungJuckDTO> list) {
//		for(SungJuckDTO data : list) {
//			data.setCheck(true);
//		}
//		Collections.sort(list);
//		
//	}
//
//	private void nameSort(ArrayList<SungJuckDTO> list) {
//		for(SungJuckDTO data : list) {
//			data.setCheck(false);
//		}
//		Collections.sort(list);
//	}
	
}
