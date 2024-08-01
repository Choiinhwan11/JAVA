package inheritance;

class AA{}
class BB extends AA{}

public class instanceOf {

	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = new BB();
		AA aa2 = new BB();
		// x instance of y : x의 메모리에 y 가 잡혀있느냐?
		AA aa3 =  aa;
		if(aa instanceof AA)System.out.println("1. TRUE");
		else System.out.println("1. FALSE");
		
		AA aa4 = bb;
		if(bb instanceof AA)System.out.println("2. TRUE");
		else System.out.println("2. FALSE");
		
		BB bb2 = (BB)aa2;
		if(aa2 instanceof BB)System.out.println("3. TRUE");
		else System.out.println("3. FALSE");
		
//		BB bb3 = (BB)aa; aa의 메모리에는 BB가 없기 때문에 업캐스팅이 안된다.
		if(aa instanceof BB)System.out.println("4. TRUE");
		else System.out.println("4. FALSE");
		
	}

}
