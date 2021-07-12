package template;

public abstract class Car {
	public abstract void drive(); // 추상 메소드, 서브 클래스에서 재정의해서 사용

	public abstract void stop(); // 추상 메소드

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	final public void run() { // 템플릿 메소드
		startCar();
		drive();
		stop();
		turnOff();
		// step-by-step
	}

}
