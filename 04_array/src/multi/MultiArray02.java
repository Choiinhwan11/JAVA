package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		for(int i = 0 ; i < ar.length ; i++) {
			for(int j = 0 ; j < ar[i].length ; j++){
				ar[i][j] = 1 + 10 * i + j;
				System.out.print(String.format("%4d", ar[i][j]) + " ");
			}
			System.out.println();
		}
		for(int i = 0 ; i < ar.length ; i++) {
			for(int j = 0 ; j < ar[i].length ; j++){
				System.out.print(String.format("%4d", ar[ar.length - 1 - j][ar.length - 1 - i]) + " ");
			}
			System.out.println();
		}
		for(int i = ar.length ; i >= 0; i--) {
			for(int j = ar.length ; j >= 0; j--){
				System.out.print(String.format("%4d", ar[i][j]) + " ");
			}
			System.out.println();
		}

	}

}
