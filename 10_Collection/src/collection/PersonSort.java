package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		System.out.println("정렬 전 = ");
		for(String data: ar) {
			System.out.println(data + " ");
		}
		System.out.println();
		Arrays.sort(ar);
		System.out.println("정렬 후 = ");
		for(String data: ar) {
			System.out.println(data + " ");
		}
		System.out.println();
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("라이언", 30);
		list.add(aa);
		list.add(bb);
		list.add(cc);
		System.out.println("정렬 전 = ");
		for(PersonDTO personDTO: list) {
			System.out.println(personDTO.toString() + " ");
		}
		System.out.println("정렬 후[나이 오름차순] = ");
		Collections.sort(list);
		for(PersonDTO personDTO: list) {
			System.out.println(personDTO.toString() + " ");
		}
		System.out.println(aa.getName());
		//이름으로 오름차순 
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName());
			}
		};
		Collections.sort(list, com);
//		Comparable<PersonDTO> comparable = new Comparable<PersonDTO>() {
//
//			@Override
//			public int compareTo(PersonDTO o) {
//				return this.getName().compareTo(o.getName());
//			}
//			
//		};생성자 Comparable 은 DTO안에서만 가능하다. this를 필요로 함.
		System.out.println("정렬후[이름으로] = ");
		for(PersonDTO personDTO: list) {
			System.out.println(personDTO.toString() + " ");
		}
		System.out.println();
		
	}

}
