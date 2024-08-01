package class_;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk Hong = new SungJuk();
		Hong.set("홍길동", 90, 96, 100);
		Hong.calc();
		System.out.println("------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("------------------------------------------------------");
		System.out.print(Hong.getName() + "\t");
		System.out.print(Hong.getKor() + "\t");
		System.out.print(Hong.getEng() + "\t");
		System.out.print(Hong.getMath() + "\t");
		System.out.print(Hong.getTot() + "\t");
		System.out.print(String.format("%.2f", Hong.getAvg())+ "\t");
		System.out.print(Hong.getGrade() + "\t");
		SungJuk bb = new SungJuk();
		bb.set("라이언", 80, 65, 72);
		bb.calc();
		System.out.println("------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("------------------------------------------------------");
		System.out.print(bb.getName() + "\t");
		System.out.print(bb.getKor() + "\t");
		System.out.print(bb.getEng() + "\t");
		System.out.print(bb.getMath() + "\t");
		System.out.print(bb.getTot() + "\t");
		System.out.print(String.format("%.2f", bb.getAvg())+ "\t");
		System.out.print(bb.getGrade() + "\t");
		SungJuk cc = new SungJuk();
		cc.set("프로도", 73, 68, 80);
		cc.calc();
		System.out.println("------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("------------------------------------------------------");
		System.out.print(cc.getName() + "\t");
		System.out.print(cc.getKor() + "\t");
		System.out.print(cc.getEng() + "\t");
		System.out.print(cc.getMath() + "\t");
		System.out.print(cc.getTot() + "\t");
		System.out.print(String.format("%.2f", bb.getAvg())+ "\t");
		System.out.print(cc.getGrade() + "\t");

	}

}
