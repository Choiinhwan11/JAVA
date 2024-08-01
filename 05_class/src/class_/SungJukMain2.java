package class_;

public class SungJukMain2 {
	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3]; // 객체 배열 생성
		for(int i = 0 ; i < ar.length ; i++) {
			ar[i] = new SungJuk(); 
		}
		ar[0].set("홍길동", 90, 96, 100);
		ar[1].set("라이언", 80, 65, 72);
		ar[2].set("프로도", 73, 68, 80);
		for(int i = 0 ; i < ar.length ; i++) {
			ar[i].calc();
		}
		for(int i = 0 ; i < ar.length ; i++) {
			System.out.println("------------------------------------------------------");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.print(ar[i].getName() + "\t");
			System.out.print(ar[i].getKor() + "\t");
			System.out.print(ar[i].getEng() + "\t");
			System.out.print(ar[i].getMath() + "\t");
			System.out.print(ar[i].getTot() + "\t");
			System.out.print(String.format("%.2f", ar[i].getAvg())+ "\t");
			System.out.println(ar[i].getGrade() + "\t");
		}
	}
}
