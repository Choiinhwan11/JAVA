package interface_;

import java.util.Scanner;

public class Div implements Compute{
	private int x, y;
	public Div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값 입력 : ");
		x = sc.nextInt();
		System.out.println("y의 값 입력 : ");
		y = sc.nextInt();
	}
	@Override
	public void disp() {
		System.out.println("나누기");
		System.out.println(x + " / " + y + " = " + ((double)x / y));
	}
}
