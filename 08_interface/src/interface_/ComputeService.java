package interface_;

import java.util.Scanner;

public class ComputeService {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		Compute compute = null;
		int num = 0;
		while(true) {
			System.out.println();
			System.out.println("******************");
			System.out.println("      1.합");
			System.out.println("      2.차");
			System.out.println("      3.곱");
			System.out.println("      4.몫");
			System.out.println("      5.끝내기");
			System.out.println("******************");
			System.out.println("      번호");
			num = sc.nextInt();
			if(num == 5) break;
			if(num == 1) {
				compute = new Sum(); // 부모가 모든 자식을 참조한다.
			}else if(num == 2) {
				compute = new Sub();
			}else if(num == 3) {
				compute = new Mul();
			}else if(num == 4) {
				compute = new Div();
			}
			compute.disp(); //호출 
		}
	}

}
