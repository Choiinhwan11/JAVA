package abstract_;

import java.util.Scanner;

abstract class ShapeTest{
	protected double area;
	protected Scanner sc = new Scanner(System.in);
	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}
	public abstract void calcArea(); //추상메소드
	public abstract void dispArea(); //추상메소드
}

//----------------------
class SamTest extends ShapeTest{
	protected int base, height;
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.println("밑변 : ");
		base = sc.nextInt();
		System.out.println("높이 : ");
		height = sc.nextInt();
	}
	@Override
	public void calcArea() {
		area = base * height / 2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형의 넓이 : " + area);
	}
}
class SaTest extends ShapeTest{
	protected int width, height;
	public SaTest() {
		System.out.println("SamTest 기본생성자");
		System.out.println("밑변 : ");
		width = sc.nextInt();
		System.out.println("높이 : ");
		height = sc.nextInt();
	}
	@Override
	public void calcArea() {
		area = width * height;
	}
	@Override
	public void dispArea() {
		System.out.println("사각형의 넓이 : " + area);
	}
}
class SadariTest extends ShapeTest{
	protected int top, bottom, height;
	public SadariTest() {
		System.out.println("SamTest 기본생성자");
		System.out.println("윗변 : ");
		top = sc.nextInt();
		System.out.println("밑변 : ");
		bottom = sc.nextInt();
		System.out.println("높이 : ");
		height = sc.nextInt();
	}
	@Override
	public void calcArea() {
		area = (top + bottom)* height / 2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("사다리꼴의 넓이 : " + area);
	}
}
public class ShapeMain {

	public static void main(String[] args) {

		ShapeTest shape;
		shape = new SamTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		

	}

}
















