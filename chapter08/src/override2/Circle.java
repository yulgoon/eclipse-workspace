package override2;

class Shape2 {
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println("Shape");
	}
}

public class Circle extends Shape2 {

	@Override	// 메소드 재정의 할 때 -> 입력하지 않으면 아래 메소드 작성 시 위와 형식이 달라도(오타, 잘못 코딩하는 등) 새로운 메소드로 작성됨
	public void draw() {
		System.out.println("Circle");
	}

	public static void main(String[] args) {
		Shape2 b = new Circle();
		b.paint();

	}
}
