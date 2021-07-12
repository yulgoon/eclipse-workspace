package override;

class Shape {					// 수퍼 클래스
	public Shape next;

	public Shape() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {		// 서브 클래스
	public void draw() {		// 메소드 재정의 (메소드 오버라이딩 : 다형성)
		System.out.println("Line");	// 실행부만 다르게 넣어서(재정의) 사용
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
