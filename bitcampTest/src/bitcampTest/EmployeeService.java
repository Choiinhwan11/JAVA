package bitcampTest;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
	private ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
	private Employee employee;
	public void menu() {
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.출력 ");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.검색");
			System.out.println("6.정렬");
			System.out.println("7.종료");
			System.out.println("메뉴번호를 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == 1) {
				employee = new EmployeeInsert();
			}else if(num == 2) {
				employee = new EmployeePrint();
			}else if(num == 3) {
				employee = new EmployeeUpdate();
			}else if(num == 4) {
				employee = new EmployeeDelete();
			}else if(num == 5) {
				employee = new EmployeeSearch();
			}else if(num == 6) {
				employee = new EmployeeSort();
			}else {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			employee.excute(list);
		}
	}
}