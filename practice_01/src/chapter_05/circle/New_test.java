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
		pizza.name = "�ڹ�����";
		pizza.area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+pizza.area+"�Դϴ�.");
		
		New_test doughnut = new New_test();
		doughnut.radius = 2;
		doughnut.name = "�ڹٵ���";
		doughnut.area = doughnut.getArea();
		System.out.println(doughnut.name+"�� ������ "+doughnut.area+"�Դϴ�.");
	}

}
