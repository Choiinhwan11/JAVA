package for_;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.println("원하는 단 입력 : ");
		int dan = System.in.read() - 48;
		for(int i = 1 ; i <= 9 ; i++ ) {
			System.out.println(dan +  " * " + i + " = " + (dan *i));
		}

	}

}
/*
 * 원하는 단을 입력 : 2
 * 2 * 1 = 2;
 * 
 */