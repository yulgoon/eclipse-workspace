package polymorphism;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� �� ������ ���ϴ�.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		//  ���� ���ε��� ���ؼ� ���� �޼ҵ带 ȣ������ ��, �ش��ϴ� ���� �޼ҵ带 ���
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		/*	upcasting
		 * Human h = new Human();
		 * Tiger t = new Tiger();
		 * Eagle e = new Eagle();
		 */
	}
}
