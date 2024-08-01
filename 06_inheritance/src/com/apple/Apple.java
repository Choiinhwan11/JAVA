package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		//Zoo 클래스에서 tiger() 메소드 호출
		Zoo z = new Zoo();
		z.tiger();
//		z.giraffe();
//		z.elephant();
//		z.lion(); 다른 패키지가 되는 것은 public 밖에 안된다.

	}

}
