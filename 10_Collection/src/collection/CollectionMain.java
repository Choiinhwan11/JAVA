package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
//	@SuppressWarnings("all") //우는 아기 울지말라고 협박하는 셈.
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); // 중복 허용, 순서
		coll.add(25); // 중복 허용, 순서
		coll.add(43.8); // 중복 허용, 순서
		coll.add("기린");
		coll.add("코끼리");
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
		
	}

}
/*
 * interface 를 사용하려면
 * 1.
 * 2.interface의 자식 클래스로 생성 (상위 인터페이스의 메소드를 전부 오버라이드를 할 수 없다면.)
 * 3.메소드를 사용 
 * it.hasNext() 있으면 true 없으면 false
 * it.next() 항목을 꺼내서 버퍼에 저장 후 다음 항목으로 이동, 버퍼 = 임시저장소
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
