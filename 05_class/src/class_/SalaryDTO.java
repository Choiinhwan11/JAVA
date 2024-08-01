package class_;
//1인분 
public class SalaryDTO {
	private String name, job;
	private int basic, extra, total, tax, salary;
	private double rate; // 외부 클래스에서는 접근 불가하므로 setter, getter를 이용해야한다.
	
	public void setData(String n, String j, int b, int e) {
		name = n;
		job = j;
		basic = b;
		extra = e;
	}
	public void calc() {
		total = basic + extra;
		rate = total >= 5000000 ? 0.03 : total >=3000000 ? 0.02 : 0.01;
		tax = (int) (total * rate);
		salary = total - tax;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public int getBasic() {
		return basic;
	}
	public int getExtra() {
		return extra;
	}
	public int getTotal() {
		return total;
	}
	public int getTax() {
		return tax;
	}
	public int getSalary() {
		return salary;
	}
	public double getRate() {
		return rate;
	}
}
