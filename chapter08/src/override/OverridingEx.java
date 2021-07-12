package override;

class Shape {					// ���� Ŭ����
	public Shape next;

	public Shape() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {		// ���� Ŭ����
	public void draw() {		// �޼ҵ� ������ (�޼ҵ� �������̵� : ������)
		System.out.println("Line");	// ����θ� �ٸ��� �־(������) ���
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class OverridingEx {
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
	}
}
