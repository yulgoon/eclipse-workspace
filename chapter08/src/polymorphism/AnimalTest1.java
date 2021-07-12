package polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 두 날개로 납니다.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		//  동적 바인딩에 의해서 상위 메소드를 호출했을 때, 해당하는 하위 메소드를 출력
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
