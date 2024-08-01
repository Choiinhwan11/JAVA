package homework;

import java.util.Scanner;

public class SungJeok {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		System.out.print("인원수 입력: ");
		cnt = sc.nextInt();
		System.out.println();
		String[] name = new String[cnt];
		int subjectCnt;
		String[][] subject = new String[cnt][];
		int[][] jumsu = new int[cnt][];
		double[] avg = new double[cnt];
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println("이름 입력 : ");
			name[i] = sc.next();
			 System.out.println("과목 수 입력 : ");
			 subjectCnt = sc.nextInt();
			 subject[i] = new String[subjectCnt];
			 for(int j = 0 ; j < subjectCnt ; j ++) {
				 System.out.println("과목명 입력 : ");
				 subject[i][j] = sc.next();
			 }
			 jumsu[i] = new int[subjectCnt + 1];
			 for(int j = 0 ; j < subjectCnt ; j ++) {
				 System.out.println(subject[i][j] + "점수 입력 : ");
				 jumsu[i][j] = sc.nextInt();
				 jumsu[i][subjectCnt] += jumsu[i][j];
			 }
			 avg[i] = (double) jumsu[i][subjectCnt] / subjectCnt;
		}
		//출력
		for(int i = 0 ; i < cnt ; i++) {
			System.out.print("이름\t");
			for(int j = 0 ; j < subject[i].length ; j++) {
				System.out.println(subject[i][j] + "\t");
			}
			System.out.println("총점\t평균");
			System.out.print(name[i] + "\t");
			for(int j = 0 ; j < jumsu[i].length ; j++) {
				System.out.println(jumsu[i][j] + "\t");
			}
			System.out.println(jumsu[i][jumsu[i].length]+ "\t" + String.format("%.2f", avg[i]));
		}
	}
}