package nested;

public abstract class AbstractTest { // POJO plain old java project
	//추상 클래스에는 추상 메소드가 있을 수도 없을 수도 있다.
	String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name); //method 부분의 body 부분을 삭제하면 추상메소드라고 한다.
	//추상클래스는 직접적인 new 가 안된다.
	
}
/*
해결방법
Abstract 사용방법
1. 상속
2. subclass 가 반드시 @Override해야한다. 상소과 동시에 Override 해야한다.
3. method를 통해서 생성을 시켜주면 된다.
4. 익명 inner class를 이용하여 처리를 한다.





*/