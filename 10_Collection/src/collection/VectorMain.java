package collection;
import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터의 크기 = " + v.size());
		System.out.println("벡터의 용량 = " + v.capacity());
		System.out.println();
		System.out.println("항목 추가");
		for(int  i = 1 ; i <= 10 ;i++) {
			v.add(i + "");
			System.out.print(v.get(i - 1) + " ");
		}
		System.out.println();
		System.out.println("벡터의 크기 = " + v.size());
		System.out.println("벡터의 용량 = " + v.capacity());
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5 + " ");
		System.out.println("벡터의 크기 = " + v.size());
		System.out.println("벡터의 용량 = " + v.capacity());
		System.out.println();
		
		for(int i  = 0 ; i < v.size() ; i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
//		v.remove("5"); // 처음 만나는 5 제거
		v.remove(10); // 10번 인덱스 제거
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		
		
		
		
		
		
	}

}
















