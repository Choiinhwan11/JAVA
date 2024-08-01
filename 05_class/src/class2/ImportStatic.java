package class2;
//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.Math.*;
import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Arrays.sort;

public class ImportStatic {
	public static void main(String[] args) {
		out.println("난수  = " + random());
		System.out.println("제곱  = " + pow(3, 4));
		System.out.println("소수이하 2쨰자리 = " + format("%.2f", 34.5234));
		int[] ar = {25, 47, 20, 78};
		sort(ar);
		for(int data : ar) System.out.println(data + "\t");
	}
}
