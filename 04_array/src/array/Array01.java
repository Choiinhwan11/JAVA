package array;

public class Array01 {

	public static void main(String[] args) {
		int[] ar; 
		ar = new int[5];//배모리에 생성
		//배열명은 시작 주소를 가지고 있다.
		ar[0] = 25;
		ar[1] = 43;
		ar[2] = 30;
		ar[3] = 27;
		ar[4] = 52;
		System.out.println("배열명 ar = " + ar);// 클래스명 @ 16진수 주소값.
		for(int i = 0 ; i < ar.length ; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println("거꾸로 출력");
		for(int i = ar.length - 1 ; i >= 0 ; i--){
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println("홀수 데이터만 출력");
		for(int i = 0 ; i < ar.length ; i++) {
			if(ar[i] % 2 == 1) {
				System.out.println("ar[" + i + "] = " + ar[i]);
			}
		}
		System.out.println("확장 for 문");
		for(int i : ar) {
			System.out.println("ar[" + i + "] = " + i);
		}

	}

}
