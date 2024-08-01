package homework;

public class CharacterCount {

	public static void main(String[] args) {
		int[] Alp = new int[26];
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 5 ; j <= 10 ; j++) {
				int now = (int) (Math.random() * 26 + 65);
				Alp[now - 65]++;
			}
		}
		char[] ch = new char[50];
		for(int  i = 0 ; i < 50 ; i++) {
			ch[i] = (char) (Math.random() * 26 + 65);
			Alp[ch[i] - 'A'] ++;
			System.out.print(ch[i] + " ");
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		System.out.println();
		for(int i = 'A' ; i <= 'Z' ; i++) {
			System.out.println((char)i + " : " + Alp[i - 'A'] + "개");
		}
			

	}

}
/*[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
*/