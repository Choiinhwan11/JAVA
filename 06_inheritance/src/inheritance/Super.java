package inheritance;

public class Super {

	protected double weight, height;
	public Super() {
		System.out.println("Super의 기본생성자입니다.");
	}
	
	public Super(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);;
	}
	public static void main(String[] args) {
	}

}
