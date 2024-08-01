package inheritance;

import java.util.Scanner;

class ShapeTest{
	protected double area;
	protected Scanner sc = new Scanner(System.in);
	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다");
	}
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
	@Override // 컴파일 할 떄 부모 객체와 같은 명의 메소드가 없으면 에러를 잡아준다.
	public void calcArea() {
		area = base * height / 2.0;
	}
	public void dispArea() {
		System.out.println("삼각형의 넓이 : " + area);
	}
}
//----------------------
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
	public void dispArea() {
		System.out.println("사각형의 넓이 : " + area);
	}
}
//----------------------
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
	public void dispArea() {
		System.out.println("사다리꼴의 넓이 : " + area);
	}
}
//----------------------
public class ShapeMain {

	public static void main(String[] args) {
//		SamTest sam = new SamTest();//1 : 1 관계
//		sam.calcArea();
//		sam.dispArea();
//		System.out.println();
//		
//		SaTest sa = new SaTest();
//		sa.calcArea();
//		sa.dispArea();
//		System.out.println();
//		
//		SadariTest sada = new SadariTest();
//		sada.calcArea();
//		sada.dispArea();
//		System.out.println();
//		
		//결합도를 낮추기, 다형성
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
















