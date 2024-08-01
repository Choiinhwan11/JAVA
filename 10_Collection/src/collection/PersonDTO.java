package collection;

public  class PersonDTO implements Comparable<PersonDTO>{
	private String name;
	
	private int age;
	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name + "\t" + age;
	}
	@Override
	public int compareTo(PersonDTO p) {
		if(this.age != p.age) {
			return this.age - p.age;}else {
				return 0;
			}
//		}else {
//			return this.name.compareTo(p.name);
//		}
	}
	
}
