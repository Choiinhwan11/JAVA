package homework;

public class FruitMain extends Fruit{

	public static void main(String[] args) {
		Fruit[] ar = new Fruit[3];
		for(int i = 0  ; i < ar.length ; i++) {
			ar[i] = new Fruit();
			ar[i].calcTot();
		}
		System.out.println("--------------------------");
		System.out.print("PUM\t");
		System.out.print("JAN\t");
		System.out.print("FEB\t");
		System.out.print("MAR\t");
		System.out.println("TOT\t");
		System.out.println("--------------------------");
		for(int i = 0 ; i < ar.length ; i++) {
			ar[i].display();
		}
		System.out.println("--------------------------");
		Fruit.output();
		

	}

}
