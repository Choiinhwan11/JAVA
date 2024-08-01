package interface_;

public interface InterA {
	public static final String NAME = "홍길동"; // 상수
	public int AGE = 25;//상수만 들어올 수 있기 때문에 static final 을 안써도 상수가 된다.
	public abstract void aa();//추상메소드 일반메소드는 못들어온다.
	public void bb();
}
