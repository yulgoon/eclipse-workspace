package override3;

class Shape {
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);
	}
}

public class Circle extends Shape {
	protected String name;

	@Override
	public void draw() {	// sub class���� draw�� ������ -> ���� ���ε��� ���� Shape class���� draw �����ϸ� Circle class�� draw ����
		name = "Circle";	// Circle Ŭ����(����Ŭ����)�� �ִ� name�� ����
		super.name = "Shape"; // Shape Ŭ����(����Ŭ����)�� �ִ� name�� ����
		super.draw();
		System.out.println(name);
	}

	public static void main(String[] args) {
		Shape b = new Circle();	// upcasting (sub class���� super class�� ������ ���)
		b.paint();	// Shape Ŭ������ paint �޼ҵ带 ȣ���ϸ� Circle Ŭ�������� ������ �� draw �޼ҵ� ����
	}
}
