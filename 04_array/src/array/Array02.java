package array;

public class Array02 {

	public static void main(String[] args) {// args : 인수 argument, 매개변수 parameter 인수와 매개변수는 엄밀히 말하면 다르지만 자바에서는 같다.
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
			System.out.println("문자열의 크기 = " + args[i].length());
			System.out.println("첫번째 문자 = " + args[i].charAt(0));
			System.out.println("마지막 문자 = " + args[i].charAt(args[i].length() - 1));
			System.out.println("--------");
		}
		int t = 0;
		for(String i : args) {
			System.out.println("args[" + ++t + "] = " + i);
			System.out.println("문자열의 크기 = " + i.length());
			System.out.println("첫번째 문자 = " + i.charAt(0));
			System.out.println("마지막 문자 = " + i.charAt(i.length() - 1));
			System.out.println("--------");
		}
	}

}
