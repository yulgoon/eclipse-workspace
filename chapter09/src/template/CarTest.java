package template;

public class CarTest {

	public static void main(String[] args) {

		System.out.println("===== ���������ϴ� �ڵ��� =====");
		Car myCar = new AICar(); // Car �������� upcasting
		myCar.run();

		System.out.println("===== ����� �����ϴ� �ڵ��� =====");
		Car hisCar = new ManualCar(); // Car �������� upcasting
		hisCar.run();
	}

}
