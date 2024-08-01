package nested;

public class AbstractMain{
	//AbstractTest를 생성하고 싶은데 추상메소드는 new 가 안된다.

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { // 익명 Inner Class
			@Override
			public void setName(String name) {
				this.name = name;
			}
		}; // 만약 new 를 하고 싶으면 전부 Override 해야한다.
		// 1회성
		// 익명이기 때문에 Abstract$1이라고 표시된다.
		//interface 생성
		InterA in = new InterA() {
			@Override
			public void aa() {}
			@Override
			public void bb() {}
		};
		AbstractExam ae = new AbstractExam() {
			//원하는 메소드 @Override 원하는 것만 골라서 Override를 할 수 있는 것이 장점.
		};
		
		
		
		
		
		

	}

}
/*
interface 사용하려면 
1. implements. 모든 추상 메소드를 Override
2. 대신 Override 해주는 클래스를 차장서 생성
3. method를 통해서 생성
4. 익명 inner class 

Abstract 사용방법
1. 상속 extends반드시 @Override
2. method를 통해서 생성
3. 익명 inner class를 이용하여 처리를 한다.







*/