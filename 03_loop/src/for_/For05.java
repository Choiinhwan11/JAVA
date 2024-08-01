package for_;

import java.io.IOException;

public class For05 {

	public static void main(String[] args) throws IOException {
		System.out.println("x : ");
		int x = System.in.read() - 48;
		System.in.read();
		System.in.read();
		System.out.println("y : ");
		int y = System.in.read() - 48;
		int mul = 1;
		for(int i = 1 ; i <= y ; i++) {
			mul *= x;
		}
		System.out.println(x + "의 " + y + "승 "+ mul);

	}

}
