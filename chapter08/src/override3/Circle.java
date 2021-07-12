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
	public void draw() {	// sub class에서 draw를 재정의 -> 동적 바인딩에 의해 Shape class에서 draw 실행하면 Circle class의 draw 실행
		name = "Circle";	// Circle 클래스(서브클래스)에 있는 name에 대입
		super.name = "Shape"; // Shape 클래스(수퍼클래스)에 있는 name에 대입
		super.draw();
		System.out.println(name);
	}

	public static void main(String[] args) {
		Shape b = new Circle();	// upcasting (sub class에서 super class의 영역만 사용)
		b.paint();	// Shape 클래스의 paint 메소드를 호출하면 Circle 클래스에서 재정의 된 draw 메소드 실행
	}
}
