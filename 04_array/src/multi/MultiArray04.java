package multi;

public class MultiArray04 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "프로도", "라이언"};
		int[][] jumsu = {{90,95,100,0},{100,89,75,0}, {75,80,48,0}};
		float[] avg = new float[3];
		char[] grade = new char[3];
		for(int i = 0 ; i <= 2 ; i++) {
			jumsu[i][3] = jumsu[i][0] + jumsu[i][1] + jumsu[i][2];
			avg[i] = (float)jumsu[i][3] / 3;
			if(avg[i] >= 90) grade[i] = 'A';
			else if(avg[i] >= 80) grade[i] = 'B';
			else if(avg[i] >= 70) grade[i] = 'C';
			else if(avg[i] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
		}
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-8s%-8s%-8s%-8s%-8s%-8s%-8s", "이름","국어", "영어", "수학", "충점", "평균", "학점");
		System.out.println();
		System.out.println("-----------------------------------------------------");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print(String.format("%-8s", name[i]));
			for(int j = 0 ; j < 4 ; j++) {
				System.out.print(String.format("%-8d", jumsu[i][j]));
			}
			System.out.print(String.format("%-10.2f", avg[i]));
			System.out.println(String.format("%-8c", grade[i]));
		}
		System.out.println("-----------------------------------------------------");
		

	}

}
