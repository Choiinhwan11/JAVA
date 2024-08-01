package abstract_;

public class AbstractMain extends AbstractTest { //POJO형식 (Plain Old Java Object)
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		AbstractTest at = new AbstractMain();
		at.setName("홍길동");
		System.out.println(at.getName());
	}
	
}
/*

Abstract, 추상 클래스 생성방법?
1. 상속 - 추상메소드를 Override
2. 메소드

final 은 자식 클래스가 접근하지 못하도록
abstract는 자식 클래스가 접근하도록 
정반대 계념


*/