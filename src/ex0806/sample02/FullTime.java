package ex0806.sample02;

/**
 * ������
 * */

public class FullTime extends Employee {
	private int salary;
	private int bonus;

	public FullTime() {
	}

	public FullTime(int empNo, String empName, String job, int mgr, String hiredate, String deptName, int salary,
			int bonus) {
		super(empNo, empName, job, mgr, hiredate, deptName);
		this.salary = salary;
		this.bonus = bonus;

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + " | ");
		builder.append(salary);
		builder.append(", bonus=");
		builder.append(bonus);
		return builder.toString();
	}

	@Override
	public void message() {
		System.out.println(getEmpName() + "���� �������Դϴ�");

	}

}
