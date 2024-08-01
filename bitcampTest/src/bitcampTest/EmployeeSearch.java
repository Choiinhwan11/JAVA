package bitcampTest;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSearch implements Employee{
	private String name, job;
	private int no, basic, extra, tot, salary, i, count, index;
	private double rate, tax;
	private Scanner sc = new Scanner(System.in);
	@Override
	public void excute(ArrayList<EmployeeDTO> list) {
		
		while(true) {
			System.out.println("검색할 사원명을 입력하세요.");
			name = sc.next();
			count = 0;
			for(int  j = 0 ; j < list.size() ; j++) {
				if(list.get(j).getName().equals(name)) {
					count++;
					index = j;
				}
			}
			if(count == 0) System.out.println("입력하신 사원명와 일치하는 데이터가 없습니다. 다시 입력하세요.");
			else break;
//			else if(count > 1) {
//				while(true) {
//					System.out.println("검색하실 사원번호를 입력해주세요 : ");
//					no = sc.nextInt();
//					i = 0;
//					for(i = 0 ; i < list.size() ; i++) {
//						if(list.get(i).getNo() == no) {
//							index = i;
//							break;
//						}
//					}
//					if(i == list.size()) System.out.println("동일한 사원명이 없습니다 다시 입력하세요.");
//					else break;
//				}
//			}
//			else break;
//			if(i != list.size()) break;
		}
		System.out.println("---------------------------------");
		System.out.print("사원번호\t");
		System.out.print("이름\t");
		System.out.print("직급\t");
		System.out.print("기본급\t");
		System.out.print("수당\t");
		System.out.print("합계\t");
		System.out.print("세율\t");
		System.out.print("세금\t");
		System.out.println("월급\t");
		System.out.println(list.get(index).toString());
		System.out.println("---------------------------------");
		
	}
}
