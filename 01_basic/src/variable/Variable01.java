package variable;

public class Variable01 {

	public static void main(String[] args) {
		boolean a;
		a = false;
		System.out.println("a = " + a);
		
		char charMax;
		charMax = 65535;
		System.out.println("charMax = " + charMax);
		
		int d;
		d = 65;
		System.out.println("d = " + d);
		
		int e ;
		e = 'a';
		System.out.println("e = " + e);
		
		long f;
		f = 25L; // 25L or 25l(long형 상수)
		
		float g;
		//g = 43.8;
		g = (float)43.8; // 강제 형변환
		System.out.println("g = " + g);
	}

}
