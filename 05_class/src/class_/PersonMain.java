package class_;
class Person{
	private String name;
	private int age;
	//메소드의 기본은 public ['
	public void setName(String n ) {
		 name = n;
	}
	public void setAge(int n ) {
		 age = n;
	}
	public void setData(String a, int b) {
		name = a;
		age = b;
	}
	public void setData() {} // Overload
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}

//----------------
/*class 당 *.class 가 생성.
 * PersonMain.
 * public : 내가 주다.
 * 
 * 
 * 
 * */
public class PersonMain {
	

	public static void main(String[] args) {
		Person aa = new Person();
		System.out.println("객체 aa =  " + aa);
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println(aa.getName() + "\t" + aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		System.out.println("객체 bb = " + bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println(bb.getName() + "\t" + bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		System.out.println("객체 cc = " + cc);
		cc.setData("라이언", 30);
		System.out.println(cc.getName() + "\t" + cc.getAge());
		
		Person dd = new Person();
		System.out.println("객체 cc = " + dd);
		dd.setData();
		System.out.println(dd.getName() + "\t" + dd.getAge());

	}

}
