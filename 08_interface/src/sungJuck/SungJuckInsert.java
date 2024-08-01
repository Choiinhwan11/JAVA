package sungJuck;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJuckInsert implements SungJuck{
	private int no, kor, eng, math, tot;
	private double avg;
	private String name;
	@Override
	public void excute(ArrayList<SungJuckDTO> list) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("번호 입력 : ");
			no = sc.nextInt();
			boolean check = false;
			for(SungJuckDTO data : list) {
				if(data.getNo() == no) {
					check = true;
					break;
				}
			}
			if(!check) {
				break;
			}else {
				System.out.println("존재하는 번호입니다 다시 입력해주세요.");
			}
		}
		System.out.println("이름 입력 : ");
		name = sc.next();
		System.out.println("국어 입력 : ");
		kor = sc.nextInt();
		System.out.println("영어 입력 : ");
		eng = sc.nextInt();
		System.out.println("수학 입력 : ");
		math = sc.nextInt();
		System.out.println("입력되었습니다.");
		tot = kor + eng + math;
		avg = (double)tot / 3;
		list.add(new SungJuckDTO(no, name, kor, eng, math, tot, avg));
		
	}
}
