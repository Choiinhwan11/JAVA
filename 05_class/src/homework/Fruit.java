package homework;

import java.util.Scanner;

public class Fruit {
	private String pum;
	private int  jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar;
	private Scanner sc = new Scanner(System.in);
	public Fruit() {
		System.out.println("과일의 품종을 입력하세요.");
		this.pum = sc.next();
		System.out.println("1월 생산량을 입력하세요.");
		this.jan = sc.nextInt();
		System.out.println("2월 생산량을 입력하세요.");
		this.feb = sc.nextInt();
		System.out.println("3월 생산량을 입력하세요.");
		this.mar = sc.nextInt();
	}
	
	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	public void display() {
		System.out.print(pum + "\t");
		System.out.print(jan + "\t");
		System.out.print(feb + "\t");
		System.out.print(mar + "\t");
		System.out.println(tot + "\t");
	}
	public static void output() {
		System.out.print("\t");
		System.out.print(sumJan + "\t");
		System.out.print(sumFeb + "\t");
		System.out.println(sumMar + "\t");
	}
}