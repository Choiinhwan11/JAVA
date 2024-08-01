package com.zoo;

public class Zoo2 {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();
		z.giraffe();
		z.elephant();
//		z.lion(); 같은 패키지에서는 public protected 은 볼 수 있지만 private 만 안된다.

	}

}
