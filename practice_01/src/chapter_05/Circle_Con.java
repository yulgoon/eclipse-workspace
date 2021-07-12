package chapter_05;

public class Circle_Con {

	int radius;
	String name;
	
	public Circle_Con() {		// 매개변수가 없는 생성자(Con; Constructor)
		radius = 1; name = "";	// radius의 초기 값은 1		
	}
	public Circle_Con(int r, String n)	{	// 매개 변수를 가진 생성자
		radius = r; name = n;
	}

	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle_Con pizza = new Circle_Con(10, "자바피자");		// 매개변수를 가진 생성자를 호출
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area+"입니다");	
		
		Circle_Con doughnut = new Circle_Con();				// 매개변수를 가지지 않은 생성자를 호출
		doughnut.name = "자바도넛";
		area = doughnut.getArea();
		System.out.println(doughnut.name+"의 면적은 "+area+"입니다.");

	}

}
