package variable;

import java.text.DecimalFormat;

public class Compute {
	public static void main(String[] args) {
		short a = 320;// 함수 안에 있으면 지역변수라고 한다. local variable
		short b = 258;
		
		short sum = (short)(a + b); //
		System.out.println(a + " + " + b + " = " + sum);
		short sub = (short)(a - b); //
		System.out.println(a + " - " + b + " = " + sub);
		int mul = a * b; //
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		double div = (double)a / b; 
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));
	}
}