package ex0806.sample02;

public class MainApp {

	public static void main(String[] args) {

		Employee emparr[] = new Employee[5];

		emparr[0] = new FullTime(10, "���缮", "���׿��", 0, "2013-05-01", "���ѵ���", 8500, 200);
		emparr[1] = new FullTime(20, "�ڸ��", "����", 10, "2013-06-20", "���ѵ���", 7500, 100);
		emparr[2] = new FullTime(30, "������", "������", 10, "2013-06-22", "���ѵ���", 6000, 0);
		emparr[3] = new PartTime(40, "��ȫö", "������", 20, "2014-05-01", "���ѵ���", 20000);
		emparr[4] = new PartTime(50, "����", "����", 30, "2014-05-02", "���ѵ���", 25000);

		
		System.out.println("**********Emp����*************");
		for (Employee e : emparr) {
			System.out.println(e);
		}

		System.out.println("**********Emp����2*****");
		for (Employee e : emparr) {
			e.message();
		}

	

	}

}
