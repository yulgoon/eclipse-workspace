package chapter_05.circle;

import chapter_05.circle.Prac02_Circle_re;

public class Prac02_Circle_test_re {

	public static void main(String[] args) {

		Prac02_Circle_re pizza = new Prac02_Circle_re ();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area+"cm^2입니다.");
		
		Prac02_Circle_re doughnut = new Prac02_Circle_re();
		doughnut.radius = 2;
		doughnut.name = "자바도넛";
		area = doughnut.getArea();
		System.out.println(doughnut.name+"의 면적은 "+area+"cm^2입니다.");

	}

}