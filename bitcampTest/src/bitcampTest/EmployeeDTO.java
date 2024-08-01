package bitcampTest;

import java.util.Comparator;

public class EmployeeDTO implements Comparable<EmployeeDTO>{
	private String name, job;
	private int no, basic, extra, tot, salary;
	private double rate, tax;
	public EmployeeDTO(int no, String name, String job, int basic, int extra, int tot, double rate, double tax, int salary){
		this.no = no;
		this.name = name;
		this.job = job;
		this.basic = basic;
		this.extra = extra;
		this.tot = tot;
		this.rate = rate;
		this.tax = tax;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + job + "\t" + basic + "\t" + extra + "\t" + tot + "\t" + rate + "\t" + tax + "\t" + salary;
	}
	@Override
	public int compareTo(EmployeeDTO o) {
		return o.salary - this.salary;
	}
	
}
