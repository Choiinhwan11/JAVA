package bitcampTest;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDelete implements Employee{
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
		list.remove(index);
	}
}
