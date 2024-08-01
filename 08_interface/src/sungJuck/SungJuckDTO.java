package sungJuck;

public class SungJuckDTO implements Comparable<SungJuckDTO>{
	private int no, kor, eng, math, tot;
	static boolean check;
	private double avg;
	private String name;
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public SungJuckDTO(int no, String name, int kor, int eng, int math, int tot, double avg) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg;
	}
	@Override
	public int compareTo(SungJuckDTO o) {
		if(this.tot != o.tot) {
			return this.tot - o.tot;
		}else {
			return 0;
		}
	}
	
}
	
