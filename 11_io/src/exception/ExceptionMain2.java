package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	static int x, y;
	public static void main(String[] args) {
		ExceptionMain2 em = new ExceptionMain2();
		em.input();
		em.output();
		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x 입력 : ");
		x = sc.nextInt();
		System.out.println("y 입력 : ");
		y = sc.nextInt();
		sc.close();
	}
	public void output() {
		int mul = 1;
		if(y >= 0) {
			for(int i = 1 ; i <= y ; i++) {
				mul *= x;
			}
		}else {
			try {
				throw new MakeException("y는 0보다 크거나 같아야 한다.");
			}catch(MakeException e){
				e.printStackTrace();
			}
		}
	}
	
}
