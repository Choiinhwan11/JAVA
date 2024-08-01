package bitcampTest;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInsert implements Employee{
	private String name, job;
	private int no, basic, extra, tot, salary, i;
	private double rate, tax;
	private Scanner sc = new Scanner(System.in);
	@Override
	public void excute(ArrayList<EmployeeDTO> list) {
		while(true) {
			System.out.println("사원번호를 입력해주세요 : ");
			no = sc.nextInt();
			i = 0;
			for(i = 0 ; i < list.size() ; i++) {
				if(list.get(i).getNo() == no) break;
			}
			if(i != list.size()) System.out.println("동일한 사원번호이 있습니다 다시 입력하세요.");
			else break;
		}
		System.out.println("사원명을 입력해주세요 : ");
		name = sc.next();
		System.out.println("직급을 입력해주세요 : ");
		job = sc.next();
		System.out.println("기본급을 입력해주세요 : ");
		basic = sc.nextInt();
		System.out.println("수당을 입력해주세요 : ");
		extra = sc.nextInt();
		tot = extra + basic;
		rate = tot <= 2000000 ? 0.01 : tot <=4000000 ? 0.02 : 0.03;
		tax = tot * rate;
		salary = (int) (tot - tax);
		list.add(new EmployeeDTO(no, name, job, basic, extra, tot, rate, tax, salary));
	}
}
