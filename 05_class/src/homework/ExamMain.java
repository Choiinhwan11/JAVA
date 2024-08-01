package homework;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("사람 수를 입력하세요:");
		int N = sc.nextInt();
		Exam[] E = new Exam[N];
		String name, dap;
		for(int i = 0 ; i < N ; i++) {
			E[i] = new Exam();
			E[i].compare();
		}
		System.out.print("이름" + "\t");
		System.out.print("1" + "\t");
		System.out.print("2" + "\t");
		System.out.print("3" + "\t");
		System.out.print("4" + "\t");
		System.out.print("5" + "\t");
		System.out.println("점수" + "\t");
		for(int i = 0 ; i < N ; i++) {
			System.out.print(E[i].getName() + "\t");
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(E[i].getOx()[j] + "\t");
			}
			System.out.println(E[i].getScore() + "\t");
		}

	}

}
