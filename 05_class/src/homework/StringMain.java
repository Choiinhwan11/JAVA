package homework;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String oriS, oldS, newS;
		System.out.println("문자열 입력 :");
		oriS = sc.next().toLowerCase();
		System.out.println("현재 문자열 입력 :");
		oldS = sc.next().toLowerCase();
		System.out.println("바꿀 문자열 입력 :");
		newS = sc.next().toLowerCase();
		if(oriS.length() < oldS.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다");
			System.out.println("치환 할 수 없습니다");
		}else {
			int firstIndex = 0, count = 0;
			while(oriS.indexOf(oldS, firstIndex)!= -1) {
					firstIndex += newS.length();
					count++;
			}
			if(count > 0) {
				System.out.println(oriS.replace(oldS, newS));
				System.out.println(count + "번 치환되었습니다.");
			}else {
				System.out.println("치환할 수 없습니다.");
			}
		}
	}

}
