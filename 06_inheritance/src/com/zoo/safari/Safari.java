package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
//		Zoo z = new Zoo();//메모리에 부모만 잡히기 떄문에 애초에 자식으로 생성을 해야한다.
		Safari sa = new Safari();
		sa.tiger();//public 당연히 됨.
		sa.giraffe();//private 은 자식 노드
//		sa.elephant();//default는 같은 패키지안에서만 허용
//		sa.lion();//private 은 다른 클래스에서는 getter setter 로만 설치 가능.

	}

}
