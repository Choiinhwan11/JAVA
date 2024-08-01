package homework;

public class GuGuDan {

	public static void main(String[] args) {
		for(int i = 0 ; i <= 2 ; i++) {
			for(int j = 1 ; j <= 9; j ++) {
				for(int k = 2 ; k <= 4 ; k ++) {
					if(i ==2 &&k == 4) {
						continue;
					}
					System.out.print((3 * i + k) + " * " + j + " = " + (3 * i + k)*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
}
