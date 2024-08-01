package multi;

public class MultiFor02 {

	public static void main(String[] args) {
		int dan, i;
		for(dan = 2 ; dan <= 9 ; dan++) {
			for(i = 1 ; i <= 9 ; i++) {
				System.out.println(i +  " * " + i + " = " + (i * i));
			}
			System.out.println();
		}

	}

}
