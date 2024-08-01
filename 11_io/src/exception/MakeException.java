package exception;

public class MakeException extends Exception{

	//exception class 를 쓰기 싫어서 사용자가 만든 exception을 출력한다.예외처리 클래스
	private String msg;
	public MakeException() {}
	public MakeException(String msg) {
		super();
		this.msg = msg; 
	}
	@Override
	public String toString() {
		return msg + " : new  Exception 처리";
	}

}
