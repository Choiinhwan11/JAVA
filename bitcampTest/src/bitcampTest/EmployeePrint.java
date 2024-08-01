package bitcampTest;

import java.util.ArrayList;

public class EmployeePrint implements Employee{
	@Override
	public void excute(ArrayList<EmployeeDTO> list) {
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
		for(EmployeeDTO employeeDTO : list) {
			System.out.println(employeeDTO.toString());
		}
		System.out.println("---------------------------------");
	}
}
