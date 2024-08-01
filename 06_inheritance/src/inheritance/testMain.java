package inheritance;

//------------
class AA{
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.println("AA : " + a + " ");
	}
}

//------------------
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}


public class testMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();
		System.out.println("aa  : " + aa.a);
		AA bb = new BB();
		bb.disp();
		System.out.println("bb : " + bb.a);
		//오버라이드는 함수에게만 해당된다. 필드는 자식을 가지 않는다.
		
		BB cc = (BB)bb; // 자식 = (자식)부모
		cc.disp();
		System.out.println("cc : " + cc.a);
		AA dd = new AA();
		dd.disp();
		System.out.println("dd : " + dd.a);
//		BB ee = (BB)dd;
//		ee.disp(); // 애초에 AA 와 BB가 같이 생성되지 않았기 때문에 캐스팅이 되지 않는다.

	}

}
