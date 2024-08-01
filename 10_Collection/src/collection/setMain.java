package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class setMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//가장 많이 쓰이는 것이 set이다.
		set.add("호랑이");
		set.add("사자");
		set.add("기린");
		set.add("코끼리");
		//중복 x 순서 상관 없다.
		Iterator it = set.iterator();
		while(it.hasNext()) {
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
