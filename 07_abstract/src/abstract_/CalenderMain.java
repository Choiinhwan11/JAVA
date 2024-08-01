package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalenderEx{
	private int year, month , firstDayOfWeek, lastDay;
	public CalenderEx(){
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		year = sc.nextInt();
		System.out.println("월 입력 : ");
		month = sc.nextInt();
	}
	
	public void calc() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		firstDayOfWeek = cal.get(cal.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH);
	}
	public void display() {
		System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.println("토\t");
		int count = 0;
		for(int i = 1 ; i < firstDayOfWeek ; i++) {
			System.out.print("\t");
			count++;
		}
		for(int i = 1 ; i <= lastDay ; i++) {
			System.out.print(i + "\t");
			count++;
			if(count % 7 == 0) System.out.println();
		}
	}
}

public class CalenderMain {
	public static void main(String[] args) {
		CalenderEx C = new CalenderEx();
		C.calc();
		C.display();
	}
}


/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- [메소드]: calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

*/