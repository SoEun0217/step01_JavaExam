package ex0806.sample02;

/**
 * 비정규직
 * */

public class PartTime extends Employee {
	private int timePay;

	public PartTime() {
	}

	public PartTime(int empNo, String empName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super(empNo, empName, job, mgr, hiredate, deptName);
		this.timePay = timePay;

	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + " | ");
		builder.append(timePay);
		return builder.toString();
	}

	@Override
	public void message() {
		System.out.println(getEmpName() + "는 비정규직 입니다.");

	}

}
