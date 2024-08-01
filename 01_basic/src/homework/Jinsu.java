package homework;

public class Jinsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 250;
		String bin = Integer.toBinaryString(dec);
		String oct = Integer.toOctalString(dec);
		String hex = Integer.toHexString(dec);
		
		System.out.println(dec + "을 2진수 변환 : " + bin);
		System.out.println(dec + "을 8진수 변환 : " + oct);
		System.out.println(dec + "을 16진수 변환 : " + hex);
	}
}
/*
 * [문제] 250이라는 값을 저장 한 후 2진수 8진수 16진수로 변환한 값을 출력하시오.
 * [조건]
 * 2진수를 변환시켜주는 함수 메소드 Integer 클래스에 있다.
 * 
 * 
 */