package for_;

public class For01 {
	public static void main(String[] args) {
		int i;
		for( i = 1 ; i <= 10 ; i++) {
			System.out.println("Hello : " + i);
		}// for
		System.out.println("탈출 i = "  + i);
		System.out.println();
		//10 9 8 7 6 5 4 3 2 1
		for( i = 10 ; i >= 1 ; i--) {
			System.out.println(i);
		}
		System.out.println("탈출 i = "  + i);
		System.out.println();
		
		for(i = 'A' ; i <= 'Z' ; i++) {
			System.out.print((char)i + " ");
		}
	}
}