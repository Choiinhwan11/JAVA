package for_;

public class For04 {

	public static void main(String[] args) {
		char ch;
		int count = 0;
		for(int i = 1 ; i <=  10 ; i ++) {
			for(int j = 1 ; j <=  10 ; j ++) {
				ch = (char) (Math.random() * 26 + 65);
				System.out.print(ch + " ");
				if(ch == 'A')count ++;
			}
			System.out.println();
		}
		System.out.println("A의 개수 = " + count);
		System.out.println();
		count = 0;
		for(int j = 1 ; j <=  100 ; j ++) {
			ch = (char) (Math.random() * 26 + 65);
			System.out.print(ch + " ");
			if(j % 10 == 0) System.out.println();
			if(ch == 'A')count ++;
		}
		System.out.println();
		
		System.out.println("A의 개수 = " + count);

	}

}
