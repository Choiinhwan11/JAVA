package for_;

public class For03 {

	public static void main(String[] args) {
		int sum =  0;
		for(int i = 1 ; i <= 10 ; i++) {
			sum += i;
			System.out.println(i + "\t" + sum);
		}
		System.out.println();
		int mul = 1;
		for(int i = 1 ; i <= 10 ; i++) {
			mul *= i;
			System.out.println(i + "\t" + mul);
		}

	}

}