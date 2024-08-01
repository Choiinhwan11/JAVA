package bitcampTest;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUpdate implements Employee{
	private String name, job;
	private int no, basic, extra, tot, salary, index;
	private double rate, tax;
	private Scanner sc = new Scanner(System.in);
	@Override
	public void excute(ArrayList<EmployeeDTO> list) {
		while(true) {
			System.out.println("사원번호를 입력해주세요 : ");
			no = sc.nextInt();
			index = -1;
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).getNo() == no) {
		            index = i;
		            break;
		        }
		    }
		    if (index == -1) {
		        System.out.println("입력하신 사원번호와 일치하는 데이터가 없습니다. 다시 입력하세요.");
		    } else {
		        break;
		    }
		}
		System.out.println("수정 후 사원의 번호를 입력하세요 : ");
		no = sc.nextInt();
		System.out.println("수정할 사원명을 입력해주세요 : ");
		name = sc.next();
		System.out.println("수정할 직급을 입력해주세요 : ");
		job = sc.next();
		System.out.println("수정할 기본급을 입력해주세요 : ");
		basic = sc.nextInt();
		System.out.println("수정할 수당을 입력해주세요 : ");
		extra = sc.nextInt();
		tot = extra + basic;
		rate = tot <= 2000000 ? 0.01 : tot <=4000000 ? 0.02 : 0.03;
		tax = tot * rate;
		salary = (int) (tot - tax);
		list.get(index).setNo(no);
		list.get(index).setName(name);
		list.get(index).setJob(job);
		list.get(index).setBasic(basic);
		list.get(index).setExtra(extra);
		list.get(index).setTot(tot);
		list.get(index).setRate(rate);
		list.get(index).setTax(tax);
		list.get(index).setSalary(salary);
		
	}
}
