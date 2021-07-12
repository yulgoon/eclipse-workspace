package template;

public abstract class Car {
	public abstract void drive(); // �߻� �޼ҵ�, ���� Ŭ�������� �������ؼ� ���

	public abstract void stop(); // �߻� �޼ҵ�

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	final public void run() { // ���ø� �޼ҵ�
		startCar();
		drive();
		stop();
		turnOff();
		// step-by-step
	}

}
