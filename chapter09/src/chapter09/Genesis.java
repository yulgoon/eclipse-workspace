package chapter09;

public class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("Genesis Ω√µø¿ª ƒ’¥œ¥Ÿ.");
	}

	@Override
	public void drive() {
		System.out.println("Genesis ¥ﬁ∏≥¥œ¥Ÿ.");
	}

	@Override
	public void stop() {
		System.out.println("Genesis ∏ÿ√‰¥œ¥Ÿ.");
	}

	@Override
	public void turnoff() {
		System.out.println("Genesis Ω√µø¿ª ∏ÿ√‰¥œ¥Ÿ.");
	}

}
