package multi;

public class MultiArray01 {

	public static void main(String[] args) {
		int[][] ar = new int[3][2];
		ar[0][0] = 10;
		for(int i = 0 ; i < ar.length ; i ++) {
			for(int j = 0 ; j < ar[i].length ; j++) {
				ar[i][j] = 10 + 20 * i  + 10 * j;
			}
		}
		for(int i = 0 ; i < ar.length ; i ++) {
			for(int j = 0 ; j < ar[i].length ; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0 ; i < ar.length ; i++) {
			System.out.println("ar[" + i + "]" + ar[i]);
		}
		for(int i = 0 ; i < ar.length ; i ++) {
			for(int j = 0 ; j < ar[i].length ; j++) {
				System.out.println("ar[" + i + "][" + j + "] :" + ar[i][j]);
			}
		}

	}

}
