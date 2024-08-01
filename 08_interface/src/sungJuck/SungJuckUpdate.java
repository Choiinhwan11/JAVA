package sungJuck;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJuckUpdate  implements SungJuck{
	private int no, kor, eng, math, tot;
	private double avg;
	private String name;
	@Override
	public void excute(ArrayList<SungJuckDTO> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력 : ");
		no = sc.nextInt();
		boolean check = false;
		int i = 0;
		for(SungJuckDTO data : list) {
			if(data.getNo() == no) {
				check = true;
				break;
			}
			i++;
		}
		if(!check) {
			System.out.println("존재하지 않는 번호입니다.");
			return;
		}else {
			System.out.print("번호\t");
			System.out.print("이름\t");
			System.out.print("국어\t");
			System.out.print("영어\t");
			System.out.print("수학\t");
			System.out.print("총점\t");
			System.out.println("평균\t");
			System.out.println(list.get(i).toString());
			System.out.println();
			System.out.println("수정할 이름 입력 : ");
			name = sc.next();
			System.out.println("수정할 국어 입력 : ");
			kor = sc.nextInt();
			System.out.println("수정할 영어 입력 : ");
			eng = sc.nextInt();
			System.out.println("수정할 수학 입력 : ");
			math = sc.nextInt();
			tot = kor + eng + math;
			avg = (double)tot / 3;
			list.set(i, new SungJuckDTO(no, name, kor, eng, math, tot, avg));
			System.out.println("수정되었습니다.");
		}
		
	}
}
