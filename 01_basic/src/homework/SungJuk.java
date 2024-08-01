package homework;
public class SungJuk {
	public static void main(String[] args) {
		char name = 'L';
		int kor = 85;
		int eng = 90;
		int math = 100;
		int tot = kor + eng + math;
		String avg = String.format("%.3f",(double) tot / 3.);
		System.out.println("           *** " + name + "의 성적표***     ");
		System.out.println("국어	영어	수학	총점	평균");
		System.out.println(kor + "\t" + eng + "\t" + math +
				"\t" + tot +
				"\t" + avg);
	}
}
/*
 * [문제] 성적 계산
 * 이름이 L 이고 국어점수가 85, 영어점수 90, 수학점수 100(math)일 떄 총점(tot)과 평균(avg)을 구하시오
 * [조건]
 * 총점 = 국어 + 영어 + 수학
 * 평균 = 총점/ 과목수
 * 평균의 소수이하 3째자리까지 출력
 * 
 * [실행결과]
 *      *** L의 성적표***
 * 국어	영어	수학	총점	평균
 * 85	90	100	xxx	xx.xxx
 * 
 * 
 * 
 * 
 * 
 * 
 * */
