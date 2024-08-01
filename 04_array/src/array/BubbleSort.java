package array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {35, 48, 25, 72, 50};
		System.out.println("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		
//		for(int i = 1 ; i < ar.length - 1 ;i ++) {
//			for(int j = 0 ; j <= i ; j ++) {
//				if(ar[j] > ar[j + 1]) {
//					int tmp = ar[j];
//					ar[j] = ar[j + 1];
//					ar[j + 1] = tmp;
//				}
//			}
//		}
		for(int i = 0 ; i < ar.length - 1 ; i ++) {
			for(int j = 0 ; j < ar.length - 1 - i ; j ++) {
				if(ar[j] > ar[j + 1]) {
					int tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
				}
				
			}
		}
		System.out.println("Bubble sort 후 : ");
		for(int data : ar){
			System.out.print(data + " ");
		}

	}

}
