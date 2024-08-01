package constructor;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compute[] C = new Compute[3];
		int x, y;
		for(int i = 0 ; i < C.length ; i++) {
			System.out.println("x 입력 : ");
			x = sc.nextInt();
			System.out.println("y 입력 : ");
			y = sc.nextInt();
//			C[i] = new Compute();
//			C[i].setCompute(x, y);
			C[i] = new Compute(x, y);
			System.out.println();
		}
		System.out.println();
		System.out.print("X" + "\t");
		System.out.print("Y" + "\t");
		System.out.print("SUM" + "\t");
		System.out.print("SUB" + "\t");
		System.out.print("MUL" + "\t");
		System.out.println("DIV" + "\t");
		for(int i = 0 ; i < C.length ; i++) {
			C[i].calc();
			System.out.print(C[i].getX() + "\t");
			System.out.print(C[i].getY() + "\t");
			System.out.print(C[i].getSum() + "\t");
			System.out.print(C[i].getSub() + "\t");
			System.out.print(C[i].getMul() + "\t");
			System.out.println(String.format("%.2f", C[i].getDiv()) + "\t");
		}
		

	}

}
