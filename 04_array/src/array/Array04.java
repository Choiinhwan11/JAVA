package array;

public class Array04 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int min = 101, max = 0;
		for(int i = 0 ; i < ar.length ; i++) {
			ar[i] = (int) (Math.random() * 100 + 1);
//			max = Math.max(max, ar[i]);
			if(max < ar[i]) max = ar[i];
//			min = Math.min(min, ar[i]);
			if(min > ar[i]) min = ar[i];
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}
}
///*1 ~100 난수를 발생하여 배열에 저장 후 데이터를 출력하고 치대값, 최소값을 구하시오.
