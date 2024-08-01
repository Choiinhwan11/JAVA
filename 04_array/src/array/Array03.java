package array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("배열의 크기 입력 : ");
		int size = sc.nextInt();
		int[] A = new int[size];
		int sum = 0;
		for(int i = 0 ; i < size ; i++) {
			System.out.print("ar["  + i + "] 입력 : ");
			A[i] = sc.nextInt();
			sum += A[i];
		}
		for(int data : A) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("합 = " + sum);
		sc.close();
	}
}
/*ar[0] 입력:
 * ar[1] 입력:
 * ar[2] 입력:
 * 합
 * */
