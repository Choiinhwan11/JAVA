package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {
				"우즈베키스탄" , "쿠웨이트" , "사우디", "대한민국"
		};
		Stack<String>stack = new Stack<String>();
		for(int i = 0 ; i < groupA.length ; i++) stack.push(groupA[i]);
		while(!stack.isEmpty()) {
			out.println(stack.pop());
		}
		//함수는 stack 영역에 들어온다. 먼저처리하고 바로전에 실행되었던 함수를 그다음으로 실행해야하기 떄문이다.

	}

}
