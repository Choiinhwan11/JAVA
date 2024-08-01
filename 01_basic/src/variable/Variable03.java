package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
		int big = Math.max(25, 36);
		System.out.println("큰 값 = " + big);
		
		double small = Math.min(12.3, 78.5);
		System.out.println("작은 값 = " + small);
		
		System.out.println();
		
		int sum = 2 + 5;
		System.out.println("합 = " + sum);
		int sum2 = '2' - 48 + '5' - 48;
		 sum2 = '2' - '0' + '5' - '0';
		System.out.println("합 = " + sum2);
		
		int sum3 = Integer.parseInt("2") + Integer.parseInt("5");
		System.out.println("합 = " + sum3);
		
//		String a = "43.8f";
//		String b = "43.8";
//		double sum4 = Float.parseFloat(a) + Double.parseDouble(b);
//		System.out.println("합 = " + sum4);
		Float a = Float.parseFloat("43.8f");
		Double b = Double.parseDouble("43.8");
		System.out.println("합 = " + (a + b));
		double c = Math.random();
		System.out.println(c);
		int d = (int)(Math.random()* (90 - 65 + 1) + 65);
		System.out.println("65 90 사이 난수: " + d);
		System.out.println((char)d);
		double e = new Random().nextDouble();
		System.out.println(e);
		int f = new Random().nextInt(100);
		System.out.println(f);
	}
}


