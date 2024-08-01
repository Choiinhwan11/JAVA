package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain{

	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat(); // 자식을 이용하여 부모 생성.
		System.out.println(nf.format(123412341.12851234));// 소수점 4쨰자리에서 반올림한다.
		System.out.println(nf.format(11234));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(123412341.12851234));// 
		System.out.println(nf2.format(11234));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(123412341.12851234));// 없으면 강제로 표시
		System.out.println(nf3.format(11234));
		System.out.println();
		
//		NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		System.out.println(nf4.format(123412341.12851234));// 메소드를 이용하여 클래스 생성
		nf4.setMaximumFractionDigits(2); //소수이하 2째자리
		System.out.println(nf4.format(11234));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf5.format(123412341.12851234));
		nf5.setMaximumFractionDigits(2);
		System.out.println(nf5.format(11234));
		System.out.println();
	
		
		
		

	}

}
