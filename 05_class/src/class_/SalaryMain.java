package class_;

import java.text.DecimalFormat;

public class SalaryMain {
	public static void main(String[] args) {
		SalaryDTO[] ar = new SalaryDTO[3];//자료형에 상관없이 모든 것을 받는 텀블러
		// Object[] ar = new SalaryDTO[3];
		ar[0] = new SalaryDTO();
		ar[1] = new SalaryDTO();
		ar[2] = new SalaryDTO();
		
		ar[0].setData("홍길동", "이사", 4800000, 300000);
		ar[1].setData("송중기", "사원", 2000000, 100000);
		ar[2].setData("홍길동", "이사", 2900000, 150000);
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("-----------------------------------");
		for(SalaryDTO data : ar) {
			data.calc();
			System.out.print( data.getName() + "\t");
			System.out.print( data.getJob() + "\t");
			System.out.print( df.format(data.getBasic()) + "\t");
			System.out.print( df.format(data.getExtra()) + "\t" + "\t");
			System.out.print( df.format(data.getTotal()) + "\t");
			System.out.print( df.format(data.getRate()) + "\t");
			System.out.print( df.format(data.getTax()) + "\t" + "\t");
			System.out.println( df.format(data.getSalary()) + "\t" + "\t");
		}
	}
	
}
