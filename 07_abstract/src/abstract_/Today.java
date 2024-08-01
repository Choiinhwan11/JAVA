package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("오늘 날짜 = " + d);
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(d));
		System.out.println();
		
		//내 생일  =1996 07 16 10:25:37 입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("14141414141414");//String --> Date 변환
		System.out.println("내 생일 = " + birth);
		System.out.println("내 생일 = " + sdf.format(birth));
		//자식 클래스를 이용하여 생성.
		//시스템의 날짜와 시간을 기준으로 생성
		//Calendar cal = new GregorianCalendar(); subclass를 이용하여 생성;
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(cal.YEAR);
		//year = cal.get(1);// 컴퓨터 입장에서는 이렇게 보인다. but 현업에서 쓰면 안됨.
		int month = cal.get(cal.MONTH);
		//month = cal.get(2);// 컴퓨터 입장에서는 이렇게 보인다. but 현업에서 쓰면 안됨.
		int day = cal.get(cal.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK);
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일";break;
		case 2 : dayOfWeek = "월";break;
		case 3 : dayOfWeek = "화";break;
		case 4 : dayOfWeek = "수";break;
		case 5 : dayOfWeek = "목";break;
		case 6 : dayOfWeek = "금";break;
		case 7 : dayOfWeek = "토";break;
		}
		int hour = cal.get(cal.HOUR_OF_DAY);
		int minute = cal.get(cal.MINUTE);
		int second = cal.get(cal.SECOND);
		System.out.println("현재 시간은 " + year + "년 " + (1 + month) + "월 " + day + "일 " + dayOfWeek + "요일 "+ hour + "시 " + minute + "분 " + second + "초입니다.");
	}
	
}
