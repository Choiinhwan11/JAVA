package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("직급 입력 : ");
		String job = sc.next();
		System.out.println("기본급 입력 : ");
		int basic = sc.nextInt();
		System.out.println("수당 입력 : ");
		int extra = sc.nextInt();
		int tot = basic + extra;
		double rate = 5000000 <= tot ?  0.03 : tot >= 3000000 ? 0.02 : 0.01;  
		int tax = (int) (tot * rate);
		int salary = tot - tax;
 		System.out.println("*** "+ name + " " + job + " 월급 ***");
		System.out.println("기본급 : " + df.format(basic) + "원");
		System.out.println("수당 : " + df.format(extra) + "원");
		System.out.println("합계 : " + df.format(tot) + "원");
		System.out.println("세금 : " + df.format(tax) + "원");
		System.out.println("월급 : " + df.format(salary) + "원");
		sc.close();
		
		
	}

}