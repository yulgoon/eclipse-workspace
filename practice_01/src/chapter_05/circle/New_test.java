package chapter_05.circle;

public class New_test {
	
	int radius;
	String name;
	double area;
	
	public New_test() {}
	
	public double getArea() {
		
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		
		New_test pizza = new New_test();
		pizza.radius = 10;
		pizza.name = "자바피자";
		pizza.area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+pizza.area+"입니다.");
		
		New_test doughnut = new New_test();
		doughnut.radius = 2;
		doughnut.name = "자바도넛";
		doughnut.area = doughnut.getArea();
		System.out.println(doughnut.name+"의 면적은 "+doughnut.area+"입니다.");
	}

}
