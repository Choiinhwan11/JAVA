package collection;

public class GenericMain2<T> {
		private T a;
		public T getA() {
			return a;
		}
		public void setA(T a) {
			this.a = a;
		}
		public GenericMain2(T a) {
			this.a = a;
		}
		public static void main(String[] args) {
			GenericMain2<?> aa = new GenericMain2<String>("홍길동");//object 타입의 GenericMain2로 정의를 하겠다.
//			aa.setA("홍길동"); data는 반드시 setter가 아니라 생성자를 통해서 넣어야한다.
			String name = (String) aa.getA();
			System.out.println("이름 = " + name);
			GenericMain2<?> bb = new GenericMain2<Integer>(25);
			int age = (Integer) bb.getA();
			System.out.println("나이 = " + age);
			
			
			
			
			
			
			
			
			
			
		}
}
