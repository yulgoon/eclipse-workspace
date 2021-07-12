package template;

public class CarTest {

	public static void main(String[] args) {

		System.out.println("===== 자율주행하는 자동차 =====");
		Car myCar = new AICar(); // Car 형식으로 upcasting
		myCar.run();

		System.out.println("===== 사람이 운전하는 자동차 =====");
		Car hisCar = new ManualCar(); // Car 형식으로 upcasting
		hisCar.run();
	}

}
