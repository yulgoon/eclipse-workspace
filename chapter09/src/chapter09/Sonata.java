package chapter09;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("Sonata ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata �õ��� ����ϴ�.");
	}

}
