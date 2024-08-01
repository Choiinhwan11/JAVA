package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {35, 48, 25, 72, 50};
		System.out.println("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		for(int i = 0 ; i < ar.length - 1 ; i++) {
			for(int j = i + 1 ; j < ar.length ; j ++) {
				if(ar[i] > ar[j] ) {
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		for(int data : ar){
			System.out.print(data + " ");
		}

	}

}
/*
 * 정렬
 * -오름차순(ASCENDING) : 1, 2, 3, ..... A, B, C, D, .... ㄱ, ㄴ, ㄷ, ㄹ, 
 * -내림차순(DESCENDING) : .....3, 2, 1    ..... C, B, A  ..... ㄷ, ㄴ, ㄱ
 * 
 * 
 * 
 * 
 * 
 * */
 