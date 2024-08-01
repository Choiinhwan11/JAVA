package interface_;

public class InterMain implements InterA, InterB {
	public void aa() {}
	public void bb() {}
	
	public void cc() {}
	public void dd() {}

	public static void main(String[] args) {
		//클래스 명으로만 볼 떄는 클래스인지 인터페이스인지 모른다.
		//implements 모든 추상 메소드를 Override해주겠다.
		//모든 것을 Override 해줄 것이 아니라면 abstract class 로 만들어야 한다.
		//건축설계사가 도면을 1개만 가지고 있는게 아니므로 여러가지를 implement로 해도 된다.
		//extends 는 앞뒤가 같아야한다.
		//implements는 구현을 해야하므로 구현이 안되어있을 시에는 인터페이스나 추상클래스만 implemenets할 수 있따.
		

	}

}
