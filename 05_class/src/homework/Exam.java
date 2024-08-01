package homework;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private char[] ox;
	private int score = 0;
	private final String JUNG="11111";
	public Exam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력:");
		this.name = sc.next();
		System.out.println("답 입력:");
		this.dap = sc.next();
		ox = new char[5];
	}
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
	public void compare() {
		for(int i = 0 ; i < 5 ; i++) {
			if(JUNG.charAt(i) == dap.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}else {
				ox[i] = 'X';
			}
		}
		
	}

}
