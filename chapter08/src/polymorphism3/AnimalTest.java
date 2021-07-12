package polymorphism3;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}

	public void readBook() { // Human class���� ���� ����(Override �ƴ�)
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}

	public void hunting() { // Tiger class���� ���� ����(Override �ƴ�)
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� �� ������ ���ϴ�.");
	}

	public void flying() { // Eagle class���� ���� ����(Override �ƴ�)
		System.out.println("�������� ���� �׸��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();
	}

	public void addAnimal() {
		aniList.add(new Human()); // ArrayList�� �߰��Ǹ鼭 Animal data type���� �ٷ� �� ��ȯ
		aniList.add(new Tiger()); // e.g.) Animal animal = new Tiger(); -> upcasting
		aniList.add(new Eagle());

		for (Animal ani : aniList) { // �迭�� ��ҵ��� Animal ������ ������ move ȣ���ϸ� �������̵� �� �Լ��� ȣ�� ��
			ani.move();
		}
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) { // ��� �迭 �׸���� �ϳ��� ���鼭
			Animal ani = aniList.get(i); // �ϴ� Animal type���� ���� �� (get[i]�� 0�� ������ ����)
			if (ani instanceof Human) { // Human�̸�,
				Human h = (Human) ani; // Human type���� downcasting
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
}