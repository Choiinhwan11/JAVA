package multi;

public class MultiArray03 {
	public static void main(String[] args) {
		int[][] ar = {{1, 2, 3, 0},{4, 5, 6, 0},{7, 8, 9, 0},{0, 0, 0, 0}};
		for(int i = 0 ; i < ar.length - 1 ; i++) {
			for(int j = 0 ; j < ar[i].length -  1 ; j++){
				ar[i][ar[i].length - 1] += ar[i][j];
				ar[ar.length - 1][j] += ar[i][j];
			}
		}
//		for(int j = 0 ; j < ar.length - 1 ; j ++  ) {
//			for(int i = 0 ; i < ar.length - 1 ; i++) {
//				ar[ar.length - 1][j] += ar[i][j];
//			}
//		}
		for(int i = 0 ; i < ar.length ; i++) {
			for(int j = 0 ; j < ar[i].length ; j++){
				System.out.print(String.format("%4d", ar[i][j]) + " ");
			}
			System.out.println();
		}
	}

}
